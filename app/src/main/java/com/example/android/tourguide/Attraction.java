package com.example.android.tourguide;

/**
 * {@link Attraction} represents a tourist attraction that the user wants to know about.
 * It contains information about the attraction name, description, phone, address, operating hours and an image.
 */
public class Attraction {

    /** Attraction Name */
    private String mAttractionName;

    /** Attraction Description */
    private String mAttractionDescription;

    /** Address or location */
    private String mAttractionAddress;

    /** Contact Phone Number */
    private String mAttractionPhone;

    /** Operating Hours */
    private String mAttractionHours;

    /** Other info */
    private String mOther;

    /** Attraction Image Resource ID */
    private int mAttractionImageResourceID = NO_IMAGE_AVAILABLE;

    /** Image availability */
    private final static int NO_IMAGE_AVAILABLE = -1;

    /**
     * Constructor that has to have exactly the same name as the class
     * @param attractionName The name of the attraction
     * @param attractionDescription Description or type
     * @param attractionAddress Address or approximate location
     * @param attractionHours Operating hours
     * @param attractionPhone Phone number of place or competent authority
     * @param attractionImageResourceID Image Resource ID
     */
    public Attraction(String attractionName, String attractionDescription, String attractionAddress, String attractionHours, String attractionPhone, int attractionImageResourceID) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionHours = attractionHours;
        mAttractionAddress = attractionAddress;
        mAttractionPhone = attractionPhone;
        mAttractionImageResourceID = attractionImageResourceID;
    }
    /**
     * Constructor that has to have exactly the same name as the class
     * @param attractionName The name of the attraction
     * @param attractionDescription Description or type
     * @param attractionAddress Address or approximate location
     * @param attractionHours Operating hours
     * @param attractionPhone Phone number of place or competent authority
     */
    public Attraction(String attractionName, String attractionDescription, String attractionAddress, String attractionHours, String attractionPhone) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionHours = attractionHours;
        mAttractionAddress = attractionAddress;
        mAttractionPhone = attractionPhone;
    }

    /**
     * Method: Get the name of the attraction
     * @return Name
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Method: Get the description of the attraction
     * @return Description or Cuisine Type
     */
    public String getAttractionDescription() {
        return mAttractionDescription;
    }

    /**
     * Method: Get the address of the attraction
     * @return Address or Location
     */
    public String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Method: Get the operating (or visit) hours of the attraction
     * @return Operating/Visit Hours
     */
    public String getAttractionHours() {
        return mAttractionHours;
    }

    /**
     * Method: Get the phone number of the attraction site or representative
     * @return Phone Number
     */
    public String getAttractionPhone() {
        return mAttractionPhone;
    }

    /**
     * Method: Get the resource ID of the image to be used
     * @return Resource ID
     */
    public int getAttractionImageResourceID() {
        return mAttractionImageResourceID;
    }

    /**
     * Method: Get status of image availability
     * @return TRUE if there is an image
     * @return FALSE if there is NO image
     */
    public boolean hasImage() {
        return mAttractionImageResourceID != NO_IMAGE_AVAILABLE;
    }

    /**
     * Returns the string representation of the {@link Attraction} object.
     */
    @Override
    public String toString() {
        return "Attraction{" +
                "mAttractionName='" + mAttractionName + '\'' +
                ", mAttractionDescription='" + mAttractionDescription + '\'' +
                ", mAttractionAddress='" + mAttractionAddress + '\'' +
                ", mAttractionHours='" + mAttractionHours + '\'' +
                ", mAttractionPhone='" + mAttractionPhone + '\'' +
                ", mAttractionImageResourceID=" + mAttractionImageResourceID +
                '}';
    }
}
