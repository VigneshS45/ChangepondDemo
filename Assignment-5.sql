 5.1 Select the name of all the pieces. 

Ans: select Name from Pieces;

5.2  Select all the providers' data. 

Ans: select * from Providers;

5.3 Obtain the average price of each piece (show only the piece code and the average price).

Ans: select Piece, AVG(Price) AS AveragePrice from Provides GROUP BY Piece;

5.4  Obtain the names of all providers who supply piece 1.

Ans: select P.Name from Providers AS P JOIN Provides AS Pr ON P.Code = Pr.Provider where Pr.Piece = 1;

5.5 Select the name of pieces provided by provider with code "HAL".

Ans: select Pi.Name from Pieces AS Pi JOIN Provides AS Pr ON Pi.Code = Pr.Piece where Pr.Provider = 'HAL';

!!!-- 5.6
-- ---------------------------------------------
-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
-- Interesting and important one.
-- For each piece, find the most expensive offering of that piece and include the piece name, provider name, and price 
-- (note that there could be two providers who supply the same piece at the most expensive price).

Ans: select provides.piece, pieces.name as piece name, providers.name as providers_name from Pieces inner join Provides ON Pieces.Code = provides.piece
     inner join Providers on Provides.provider = Providers.code where Price in (select max(Price) from Provides group by piece);

-- ---------------------------------------------
5.7 Add an entry to the database to indicate that "Skellington Supplies" (code "TNBC") will provide sprockets (code "1") for 7 cents each.

Ans: insert into Provides (Piece, Provider, Price) VALUES (1, 'TNBC', 7);

5.8 Increase all prices by one cent.

Ans: UPDATE Provides SET Price = Price + 1;

5.9 Update the database to reflect that "Susan Calvin Corp." (code "RBT") will not supply bolts (code 4).

Ans: delete from Provides where Piece = 4 AND Provider = 'RBT';

5.10 Update the database to reflect that "Susan Calvin Corp." (code "RBT") will not supply any pieces 
    -- (the provider should still remain in the database).

Ans: delete from Provides where Provider = 'RBT';
