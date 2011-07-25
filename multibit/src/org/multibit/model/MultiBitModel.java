package org.multibit.model;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Vector;

import com.google.bitcoin.core.Wallet;

/**
 * model containing the MultiBit data
 * @author jim
 *
 */
public class MultiBitModel {
    public static final String USER_LANGUAGE_CODE = "languageCode";
    public static final String USER_LANGUAGE_IS_DEFAULT = "isDefault";
       

    private Wallet wallet;
    private String walletFilename;
    
    // user preferences
    // note - all the preferences (for all viewsystems are stored in one properties object for simplicity
    private Properties userPreferences;
    
    // development items - will get replaced by real things
    private int fakeBalance;
    
    private Vector<WalletData> fakeWalletData;
    
    private Vector<AddressBookData> fakeReceivingAddressBookData;
    
    private Vector<AddressBookData> fakeSendingAddressBookData;
    
    public MultiBitModel() {
        // TODO load up old preferences
        userPreferences = new Properties();
        
        fakeBalance= 19;
        fakeWalletData = createFakeWalletData();
        fakeReceivingAddressBookData = createFakeReceivingAddressBookData();
        fakeSendingAddressBookData = createFakeSendingAddressBookData();
    }
    
    /**
     * get a user preference
     * @param key String key of property
     * @return String property value
     */
    public String getUserPreference(String key) {
        return userPreferences.getProperty(key);
    }
    
    /**
     * set a user preference
     * @return
     */
    public void setUserPreference(String key, String value) {
        userPreferences.put(key, value);
    }
    
    public int getFakeBalance() {
        return fakeBalance;
    }

    public void setFakeBalance(int fakeBalance) {
        this.fakeBalance = fakeBalance;
    }

    public Vector<WalletData> getFakeWalletData() {
        return fakeWalletData;
    }

    public void setFakeWalletData(Vector<WalletData> fakeWalletData) {
        this.fakeWalletData = fakeWalletData;
    }

    public Vector<AddressBookData> getFakeReceivingAddressBookData() {
        return fakeReceivingAddressBookData;
    }

    public void setFakeReceivingAddressBookData(Vector<AddressBookData> fakeReceivingAddressBookData) {
        this.fakeReceivingAddressBookData = fakeReceivingAddressBookData;
    }

    public Vector<AddressBookData> getFakeSendingAddressBookData() {
        return fakeSendingAddressBookData;
    }

    public void setFakeSendingAddressBookData(Vector<AddressBookData> fakeSendingAddressBookData) {
        this.fakeSendingAddressBookData = fakeSendingAddressBookData;
    }

    public Wallet getWallet() {
        return wallet;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public String getWalletFilename() {
        return walletFilename;
    }
    public void setWalletFilename(String walletFilename) {
        this.walletFilename = walletFilename;
    }

    
    private Vector<WalletData> createFakeWalletData() {
        Vector<WalletData> walletDataVector = new Vector<WalletData>();

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy hh:mm");

        // fake data
        WalletData walletData;
        try {
            walletData = new WalletData(null, "", formatter.parse("06jul2011 10:11"),
                    "Received with: Mt Gox account (1GFrHq4CC8E5yaDARrKygX1E4yQaCUHDQZ )", null, new BigInteger("11"));
            walletDataVector.add(walletData);

            walletData = new WalletData(null, "", formatter.parse("05jul2011 18:40"),
                    "To: Jose Alvaro (17JzkreEBYNHQM9tMTiUKCHANofwzHRLhP)", new BigInteger("14"), null);
            walletDataVector.add(walletData);

            walletData = new WalletData(null, "", formatter.parse("04jul2011 16:40"),
                    "To: Joseph Jacks (15ECB9f1pKiPYh5ujDFbmpHgZKJ1JXp6UJ)", new BigInteger("4"), null);
            walletDataVector.add(walletData);

            walletData = new WalletData(null, "", formatter.parse("03jul2011 14:20"),
                    "To: Michelle Jones (19xoFuz1HZQZuWJRuSHX5VD81fFn8FZuzm)", new BigInteger("16"), null);
            walletDataVector.add(walletData);

            walletData = new WalletData(null, "", formatter.parse("02jul2011 09:10"),
                    "Received with: Jim's Amazon account (1GC6s72s5oiuav29p4oyBt93ZMftjTpAra)", null, new BigInteger("25"));
            walletDataVector.add(walletData);

            walletData = new WalletData(null, "", formatter.parse("01jul2011 10:30"),
                    "Received with: Google dividend (1GJwaK4Xh6QsD6u9XYqQiPEkxXuRshdeDv )", null, new BigInteger("17"));
            walletDataVector.add(walletData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return walletDataVector;
    }
    
    private Vector<AddressBookData> createFakeReceivingAddressBookData() {
        Vector<AddressBookData> addressBookDataVector = new Vector<AddressBookData>();

        // fake data
        AddressBookData addressBookData;

        addressBookData = new AddressBookData("Mt Gox account", "1GFrHq4CC8E5yaDARrKygX1E4yQaCUHDQZ ");
        addressBookDataVector.add(addressBookData);

        addressBookData = new AddressBookData("Jim's Amazon account", "1GC6s72s5oiuav29p4oyBt93ZMftjTpAra ");
        addressBookDataVector.add(addressBookData);

        addressBookData = new AddressBookData("Google dividend", "1GJwaK4Xh6QsD6u9XYqQiPEkxXuRshdeDv ");
        addressBookDataVector.add(addressBookData);

        return addressBookDataVector;
    }

    private Vector<AddressBookData> createFakeSendingAddressBookData() {
        Vector<AddressBookData> addressBookDataVector = new Vector<AddressBookData>();

        // fake data
        AddressBookData addressBookData;
            addressBookData = new AddressBookData("Jose Alvaro","1x3f45ed");
            addressBookDataVector.add(addressBookData);

            addressBookData = new AddressBookData("Joseph Jacks", "1xq90");
            addressBookDataVector.add(addressBookData);

            addressBookData = new AddressBookData("Michelle Jones", "1j8s2");
            addressBookDataVector.add(addressBookData);

        return addressBookDataVector;
    }    
}
