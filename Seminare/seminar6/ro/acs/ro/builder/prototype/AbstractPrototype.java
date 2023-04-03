package ro.acs.ro.builder.prototype;

public interface AbstractPrototype extends Cloneable{
	
	public AbstractPrototype createCopy() throws CloneNotSupportedException;

}
