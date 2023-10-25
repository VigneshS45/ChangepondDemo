8.1 Obtain the names of all physicians that have performed a medical procedure they
 have never been certified to perform.

Ans: select distinct p.name from physician p join undergoes u on p.employeeid = u.physician
join procedures pr on u.procedures = pr.code
where pr.code not in (select t.treatment from trained_in t where t.physician = p.employeeid);


8.2 Same as the previous query, but include the following information in the results: Physician name, name of procedure, date when the procedure was carried out, name of the patient the procedure was carried out on.

Ans: select distinct p.name as physicianname, pr.name as procedurename, u.dateundergoes as proceduredate, pat.name as patientname
from physician p
join undergoes u on p.employeeid = u.physician
join procedures pr on u.procedures = pr.code
join patient pat on u.patient = pat.ssn
where pr.code not in (select t.treatment from trained_in t where t.physician = p.employeeid);


8.3 Obtain the names of all physicians that have performed a medical procedure that they are certified to perform, but such that the procedure was done at a date (Undergoes.Date) after the physician's certification expired (Trained_In.CertificationExpires).

Ans: select distinct p.name from physician p join undergoes u on p.employeeid = u.physician
join trained_in t on p.employeeid = t.physician and u.procedures = t.treatment
where u.dateundergoes > t.certificationexpires;


8.4 Same as the previous query, but include the following information in the results: Physician name, name of procedure, date when the procedure was carried out, name of the patient the procedure was carried out on, and date when the certification expired.

Ans: select distinct p.name as physicianname, pr.name as procedurename, u.dateundergoes as proceduredate, pat.name as patientname, t.certificationexpires
from physician p join undergoes u on p.employeeid = u.physician
join procedures pr on u.procedures = pr.code
join patient pat on u.patient = pat.ssn
join trained_in t on p.employeeid = t.physician and u.procedures = t.treatment
where u.dateundergoes > t.certificationexpires;


8.5 Obtain the information for appointments where a patient met with a physician other than his/her primary care physician. Show the following information: Patient name, physician name, nurse name (if any), start and end time of appointment, examination room, and the name of the patient's primary care physician.

Ans: select pat.name as patientname, phy.name as physicianname, n.name as nursename, a.start, a.end, a.examinationroom, pcp.name as primarycarephysician
from appointment a join patient pat on a.patient = pat.ssn
join physician phy on a.physician = phy.employeeid
left join nurse n on a.prepnurse = n.employeeid
join physician pcp on pat.pcp = pcp.employeeid
where a.physician != pat.pcp;

-- 8.6 The Patient field in Undergoes is redundant, since we can obtain it from the Stay table. 
-- There are no constraints in force to prevent inconsistencies between these two tables. 
-- More specifically, the Undergoes table may include a row where the patient ID does 
-- not match the one we would obtain from the Stay table through the Undergoes.Stay foreign key.
-- Select all rows from Undergoes that exhibit this inconsistency.

Ans: select * from Undergoes U where patient (select patient from stay S where U.stay = S.stayid);


8.7 Obtain the names of all the nurses who have ever been on call for room 123.

Ans: select n.name from nurse n inner join room r on n.registered=r.unavailable where r.roomnumber=123;


8.8 The hospital has several examination rooms where appointments take place. Obtain the number of appointments that have taken place in each examination room.

Ans: select examinationroom, count(*) as num_appointments from appointment group by examinationroom;

8.9 Obtain the names of all patients (also include, for each patient, the name of the patient's primary care physician), such that \emph{all} the following are true:
    -- The patient has been prescribed some medication by his/her primary care physician.
    -- The patient has undergone a procedure with a cost larger that $5,000
    -- The patient has had at least two appointment where the nurse who prepped the appointment was a registered nurse.
    -- The patient's primary care physician is not the head of any department.

Ans: select distinct p.name as patientname, pcp.name as primarycarephysician
from patient p join prescribes ps on p.ssn = ps.patient
join medication m on ps.medication = m.code
join undergoes u on p.ssn = u.patient
join procedures pr on u.procedures = pr.code
join appointment a on p.ssn = a.patient
join nurse n on a.prepnurse = n.employeeid
join physician pcp on p.pcp = pcp.employeeid
where m.code is not null and pr.cost > 5000 and n.registered = 1 
group by p.name, pcp.name having count(distinct n.employeeid) >= 2;