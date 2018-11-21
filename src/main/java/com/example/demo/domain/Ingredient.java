package com.example.demo.domain;

public class Ingredient {

	String amount;
	String descriptiveText; // chopped, diced, hot, cold etc
	String item;

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the descriptiveText
	 */
	public String getDescriptiveText() {
		return descriptiveText;
	}

	/**
	 * @param descriptiveText the descriptiveText to set
	 */
	public void setDescriptiveText(String descriptiveText) {
		this.descriptiveText = descriptiveText;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ingredients [amount=" + amount + ", descriptiveText=" + descriptiveText + ", item=" + item + "]";
	}

}
