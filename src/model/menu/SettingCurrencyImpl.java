package model.menu;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * currency management class.
 *
 */
public class SettingCurrencyImpl implements SettingCurrency {
/**
 * SettingCurrencyImpl fields.
 */
	private String euro;
	private String dollar;
	private List<String> currenciens;
/**
 * constructor of SettingCurrencyImpl.
 */
	public SettingCurrencyImpl() {
		this.currenciens = new ArrayList<>();
		this.euro = "euro";
		this.dollar = "dollar";
}

/**
* {@inheritDoc}
* 
*/
	public List<String> getCurrency() {

		return currenciens;
}
/**
* {@inheritDoc}
* 
*/
	public void setListCurrency(final List<String> currenciens) {
		currenciens.add(euro);
		currenciens.add(dollar);
}


}
