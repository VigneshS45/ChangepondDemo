package di;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import pageAction.EssLoginPa;

public class Di_datacon implements ObjectFactory {
	
	PicoFactory delegate=new PicoFactory();
	
    public Di_datacon() {
		addClass(EssLoginPa.class);
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
