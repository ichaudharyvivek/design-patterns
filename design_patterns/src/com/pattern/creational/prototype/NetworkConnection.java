package com.pattern.creational.prototype;

public class NetworkConnection implements Cloneable {
	private String ip;
	private String metadata;

	public void loadData() throws InterruptedException {
		// This data would take time to load.
		// Using thread to sleep for 5s
		this.metadata = "Network related data.";
		Thread.sleep(5000);
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip= " + ip + ", metadata= " + metadata + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
