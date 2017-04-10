package com.detectify.TestingChallenge;

import java.util.List;

public class SettingStr {
	private String target_id = "";
	//private String target_id = "";
	private List<Hook> hooks = null;

	
	
	
	public SettingStr(String target_id, List<Hook> hooks) {
		this.target_id = target_id;
		this.hooks = hooks;
	}

	
	public String getTarget_id() {
		return target_id;
	}

	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}

	
	public List<Hook> getHooks() {
		return hooks;
	}

	public void setHooks(Hook hook) {
		this.hooks.add(hook);
	}
	
	

}
