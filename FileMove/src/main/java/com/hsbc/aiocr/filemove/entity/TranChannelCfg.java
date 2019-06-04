package com.hsbc.aiocr.filemove.entity;

import java.util.ArrayList;
import java.util.List;

public class TranChannelCfg {
	private List<TranChannel> tranChannels = new ArrayList<TranChannel>();

	public List<TranChannel> getTranChannels() {
		return tranChannels;
	}

	public void setTranChannels(List<TranChannel> tranChannels) {
		this.tranChannels = tranChannels;
	}
	
}
