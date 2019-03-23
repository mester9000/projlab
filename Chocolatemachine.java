
package com.company;

import com.company.Broadcast;

public class Chocolatemachine extends SimpleField implements Broadcast {
	public boolean accept(Animal a) {
		return true;
	}
	
	public void react(Shy s) {
	}
	
	public void broadcast() {
	}
}
