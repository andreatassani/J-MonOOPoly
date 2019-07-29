package model.menu;

import java.util.List;
/**
 * Interface to manage the currency to use.
 * 
 *
 */
public interface SettingCurrency {
/**
 * 
 * @return a list of available currencies.
 */
List<String> getCurrency();
/**
 * 
 * @param currenciens
 * a list of currency types.
 */
void setListCurrency(List<String> currenciens);

}
