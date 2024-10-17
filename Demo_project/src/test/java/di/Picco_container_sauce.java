package di;

import Page_actions_SauceLab.Checkout_action_page;
import Page_actions_SauceLab.Login_App_page_action;
import Page_actions_SauceLab.Product_verify_page_action;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class Picco_container_sauce implements ObjectFactory {

	PicoFactory delegate = new PicoFactory();

	public Picco_container_sauce() {
		addClass(Login_App_page_action.class);
		addClass(Product_verify_page_action.class);
		addClass(Checkout_action_page.class);
		

	}

	@Override
	public void start() {
		delegate.start();
	}

	@Override
	public void stop() {
		delegate.stop();
	}

	@Override
	public boolean addClass(Class<?> clazz) {
		return delegate.addClass(clazz);
	}

	@Override
	public <T> T getInstance(Class<T> clazz) {
		return delegate.getInstance(clazz);
	}
}
