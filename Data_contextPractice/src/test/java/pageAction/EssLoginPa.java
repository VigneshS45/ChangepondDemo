package pageAction;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avolta.autoqa_core.actions.StepActions;

import base.Base;
import dataContext.DataCon_Get_Set;
import dataContext.DataContext;

public class EssLoginPa extends PageContext {



	@FindBy(name = "userId")
	WebElement useridBox;

	@FindBy(name = "password")
	WebElement passwordBox;

	@FindBy(xpath = "//button[.='Submit']")
	WebElement submitBtn;

	@FindBy(xpath = "(//img [@class='ng-tns-c0-0'])[2]")
	WebElement changepondlogo;

StepActions step;
	public EssLoginPa(Base base, StepActions step) {
		super(base);
		this.step=step;
	}

	public void launchUrl() {
		String Url = base.getProperty().getProperty("Url");
		base.getDriver().get(Url);
	}

	public void Credentilas(String datakey, String sheet, String path) {
		List<Map<String,String>> data = DataContext.getData(datakey, sheet, path);

		Map<String, String> map = data.get(0);

		DataCon_Get_Set.setCredentials(map);

		String userId = DataCon_Get_Set.getCredentials().get("UserId");
		String password = DataCon_Get_Set.getCredentials().get("password");

		step.setDataInTextBox(useridBox, userId);
		step.setDataInTextBox(passwordBox, password);
		
//		useridBox.sendKeys(userId);
//		passwordBox.sendKeys(password);
	}

	public void clickSubmit() {

		step.clickElement(submitBtn);
		
	}

	public String validateDashboard() {


		return changepondlogo.getAttribute("alt");

	}


}















