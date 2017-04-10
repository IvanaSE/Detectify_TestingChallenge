package com.detectify.TestingChallenge;

import java.util.List;

public class Setting {
	private int target_id = 0;
	//private String target_id = "";
	private List<Hook> hooks = null;

	
	
	
	public Setting(int target_id, List<Hook> hooks) {
		this.target_id = target_id;
		this.hooks = hooks;
	}

	
	public int getTarget_id() {
		return target_id;
	}

	public void setTarget_id(int target_id) {
		this.target_id = target_id;
	}

	
	public List<Hook> getHooks() {
		return hooks;
	}

	public void setHooks(Hook hook) {
		this.hooks.add(hook);
	}
	
	

}
