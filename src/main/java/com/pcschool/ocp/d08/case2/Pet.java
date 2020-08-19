package com.pcschool.ocp.d08.case2;

public interface Pet {
 
	public static final int legs = 4;
	 
	public void eat();
        
	public void skill();
        
        default void copyright() {
            System.out.println("Hey 寵物店");
        }
}
 
