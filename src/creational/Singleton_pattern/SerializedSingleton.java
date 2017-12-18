package creational.Singleton_pattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	private static final long serialVersionUID = -5644362734692209706L;

	private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    /**
     * For De-serialization
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
