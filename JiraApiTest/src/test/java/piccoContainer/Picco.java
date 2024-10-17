package piccoContainer;

import apiActions.CreateIssueActions;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class Picco implements ObjectFactory {


	PicoFactory delegate=new PicoFactory();

	public Picco() {
		addClass(CreateIssueActions.class);
		
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

