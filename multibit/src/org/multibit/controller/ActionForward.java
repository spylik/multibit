package org.multibit.controller;

/**
 * an enum encapsulating the ActionForwards 
 * these are used (mainly in Actions) to point to the next logical View to display
 * @author jim
 *
 */
public enum ActionForward {
    FORWARD_TO_SAME,
    FORWARD_TO_PREVIOUS,
    FORWARD_TO_HOME_PAGE,
    FORWARD_TO_SEND_BITCOIN,
    FORWARD_TO_SEND_BITCOIN_CONFIRM,
    FORWARD_TO_RECEIVE_BITCOIN,
    FORWARD_TO_CREATE_NEW_RECEIVING_ADDRESS,
    FORWARD_TO_CREATE_NEW_SENDING_ADDRESS,
    FORWARD_TO_EDIT_RECEIVING_ADDRESS,
    FORWARD_TO_EDIT_SENDING_ADDRESS,
    FORWARD_TO_HELP_CONTENTS,
    FORWARD_TO_HELP_ABOUT,
    FORWARD_TO_PREFERENCES,
    FORWARD_TO_ADDRESS_BOOK_RECEIVING,
    FORWARD_TO_ADDRESS_BOOK_SENDING,
    FORWARD_TO_OPEN_WALLET,
    FORWARD_TO_SAVE_WALLET_AS
}
