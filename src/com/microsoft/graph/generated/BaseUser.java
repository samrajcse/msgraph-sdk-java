// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User.
 */
public class BaseUser extends DirectoryObject implements IJsonBackedObject {


    public BaseUser() {
        oDataType = "microsoft.graph.user";
    }

    /**
     * The Account Enabled.
	 * true if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Assigned Licenses.
	 * The licenses that are assigned to the user. Not nullable.
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
	 * The plans that are assigned to the user. Read-only. Not nullable.
     */
    @SerializedName("assignedPlans")
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
	 * The telephone numbers for the user. NOTE: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The City.
	 * The city in which the user is located. Supports $filter.
     */
    @SerializedName("city")
    @Expose
    public String city;

    /**
     * The Company Name.
	 * The company name which the user is associated.
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Country.
	 * The country/region in which the user is located; for example, “US” or “UK”. Supports $filter.
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Department.
	 * The name for the department in which the user works. Supports $filter.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Display Name.
	 * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
	 * The given name (first name) of the user. Supports $filter.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Im Addresses.
	 * 
     */
    @SerializedName("imAddresses")
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Job Title.
	 * The user’s job title. Supports $filter.
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Mail.
	 * The SMTP address for the user, for example, "jeff@contoso.onmicrosoft.com". Read-Only. Supports $filter.
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
	 * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Mobile Phone.
	 * The primary cellular telephone number for the user.
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The On Premises Immutable Id.
	 * This property is used to associate an on-premises Active Directory user account to their Azure AD user object. This property must be specified when creating a new user account in the Graph if you are using a federated domain for the user’s userPrincipalName (UPN) property. Important: The $ and  characters cannot be used when specifying this property. Supports $filter.
     */
    @SerializedName("onPremisesImmutableId")
    @Expose
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
	 * Indicates the last time at which the object was synced with the on-premises directory; for example: "2013-02-16T03:04:54Z". The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Security Identifier.
	 * Contains the on-premises security identifier (SID) for the user that was synchronized from on-premises to the cloud. Read-only.
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
	 * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Password Policies.
	 * Specifies password policies for the user. This value is an enumeration with one possible value being “DisableStrongPassword”, which allows weaker passwords than the default policy to be specified. “DisablePasswordExpiration” can also be specified. The two may be specified together; for example: "DisablePasswordExpiration, DisableStrongPassword".
     */
    @SerializedName("passwordPolicies")
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
	 * Specifies the password profile for the user. The profile contains the user’s password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName("passwordProfile")
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Office Location.
	 * The office location in the user's place of business.
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Postal Code.
	 * The postal code for the user's postal address. The postal code is specific to the user's country/region. In the United States of America, this attribute contains the ZIP code.
     */
    @SerializedName("postalCode")
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
	 * The preferred language for the user. Should follow ISO 639-1 Code; for example "en-US".
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Provisioned Plans.
	 * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
	 * For example: ["SMTP: bob@contoso.com", "smtp: bob@sales.contoso.com"] The any operator is required for filter expressions on multi-valued properties. Read-only, Not nullable. Supports $filter.
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The State.
	 * The state or province in the user's address. Supports $filter.
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street Address.
	 * The street address of the user's place of business.
     */
    @SerializedName("streetAddress")
    @Expose
    public String streetAddress;

    /**
     * The Surname.
	 * The user's surname (family name or last name). Supports $filter.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Usage Location.
	 * A two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries.  Examples include: "US", "JP", and "GB". Not nullable. Supports $filter.
     */
    @SerializedName("usageLocation")
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
	 * The user principal name (UPN) of the user. The UPN is an Internet-style login name for the user based on the Internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant’s collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of organization. Supports $filter and $orderby.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
	 * A string value that can be used to classify user types in your directory, such as “Member” and “Guest”. Supports $filter.
     */
    @SerializedName("userType")
    @Expose
    public String userType;

    /**
     * The Mailbox Settings.
	 * Settings for the primary mailbox of the signed-in user. You can get or update settings for sending automatic replies to incoming messages, locale and time zone.
     */
    @SerializedName("mailboxSettings")
    @Expose
    public MailboxSettings mailboxSettings;

    /**
     * The About Me.
	 * A freeform text entry field for the user to describe themselves.
     */
    @SerializedName("aboutMe")
    @Expose
    public String aboutMe;

    /**
     * The Birthday.
	 * The birthday of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("birthday")
    @Expose
    public java.util.Calendar birthday;

    /**
     * The Hire Date.
	 * The hire date of the user. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("hireDate")
    @Expose
    public java.util.Calendar hireDate;

    /**
     * The Interests.
	 * A list for the user to describe their interests.
     */
    @SerializedName("interests")
    @Expose
    public java.util.List<String> interests;

    /**
     * The My Site.
	 * The URL for the user's personal site.
     */
    @SerializedName("mySite")
    @Expose
    public String mySite;

    /**
     * The Past Projects.
	 * A list for the user to enumerate their past projects.
     */
    @SerializedName("pastProjects")
    @Expose
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
	 * The preferred name for the user.
     */
    @SerializedName("preferredName")
    @Expose
    public String preferredName;

    /**
     * The Responsibilities.
	 * A list for the user to enumerate their responsibilities.
     */
    @SerializedName("responsibilities")
    @Expose
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
	 * A list for the user to enumerate the schools they have attended.
     */
    @SerializedName("schools")
    @Expose
    public java.util.List<String> schools;

    /**
     * The Skills.
	 * A list for the user to enumerate their skills.
     */
    @SerializedName("skills")
    @Expose
    public java.util.List<String> skills;

    /**
     * The Owned Devices.
	 * Devices that are owned by the user. Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Registered Devices.
	 * Devices that are registered for the user. Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Manager.
	 * The user or contact that is this user’s manager. Read-only. (HTTP Methods: GET, PUT, DELETE.)
     */
    @SerializedName("manager")
    @Expose
    public DirectoryObject manager;

    /**
     * The Direct Reports.
	 * The users and contacts that report to the user. (The users and contacts that have their manager property set to this user.) Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage directReports;

    /**
     * The Member Of.
	 * The groups and directory roles that the user is a member of. Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage memberOf;

    /**
     * The Created Objects.
	 * Directory objects that were created by the user. Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage createdObjects;

    /**
     * The Owned Objects.
	 * Directory objects that are owned by the user. Read-only. Nullable.
     */
    public transient DirectoryObjectCollectionPage ownedObjects;

    /**
     * The License Details.
	 * 
     */
    public transient LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Extensions.
	 * The collection of open extensions defined for the user. Read-only. Nullable.
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Messages.
	 * The messages in a mailbox or folder. Read-only. Nullable.
     */
    public transient MessageCollectionPage messages;

    /**
     * The Mail Folders.
	 * The user's mail folders. Read-only. Nullable.
     */
    public transient MailFolderCollectionPage mailFolders;

    /**
     * The Calendar.
	 * The user's primary calendar. Read-only.
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Calendars.
	 * The user's calendars. Read-only. Nullable.
     */
    public transient CalendarCollectionPage calendars;

    /**
     * The Calendar Groups.
	 * The user's calendar groups. Read-only. Nullable.
     */
    public transient CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendar View.
	 * The calendar view for the calendar. Read-only. Nullable.
     */
    public transient EventCollectionPage calendarView;

    /**
     * The Events.
	 * The user's events. Default is to show Events under the Default Calendar. Read-only. Nullable.
     */
    public transient EventCollectionPage events;

    /**
     * The Contacts.
	 * The user's contacts. Read-only. Nullable.
     */
    public transient ContactCollectionPage contacts;

    /**
     * The Contact Folders.
	 * The user's contacts folders. Read-only. Nullable.
     */
    public transient ContactFolderCollectionPage contactFolders;

    /**
     * The Inference Classification.
	 * Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
     */
    @SerializedName("inferenceClassification")
    @Expose
    public InferenceClassification inferenceClassification;

    /**
     * The Photo.
	 * The user's profile photo. Read-only.
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
	 * 
     */
    public transient ProfilePhotoCollectionPage photos;

    /**
     * The Drive.
	 * The user's OneDrive. Read-only.
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
	 * A collection of drives available for this user. Read-only.
     */
    public transient DriveCollectionPage drives;

    /**
     * The Planner.
	 * 
     */
    @SerializedName("planner")
    @Expose
    public PlannerUser planner;

    /**
     * The Onenote.
	 * Read-only.
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("ownedDevices")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("ownedDevices@odata.nextLink")) {
                response.nextLink = json.get("ownedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredDevices")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("registeredDevices@odata.nextLink")) {
                response.nextLink = json.get("registeredDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("directReports")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("directReports@odata.nextLink")) {
                response.nextLink = json.get("directReports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("directReports").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            directReports = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("createdObjects")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("createdObjects@odata.nextLink")) {
                response.nextLink = json.get("createdObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("createdObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            createdObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("ownedObjects")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("ownedObjects@odata.nextLink")) {
                response.nextLink = json.get("ownedObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("licenseDetails")) {
            final BaseLicenseDetailsCollectionResponse response = new BaseLicenseDetailsCollectionResponse();
            if (json.has("licenseDetails@odata.nextLink")) {
                response.nextLink = json.get("licenseDetails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("licenseDetails").toString(), JsonObject[].class);
            final LicenseDetails[] array = new LicenseDetails[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LicenseDetails.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            licenseDetails = new LicenseDetailsCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("messages")) {
            final BaseMessageCollectionResponse response = new BaseMessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final Message[] array = new Message[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Message.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new MessageCollectionPage(response, null);
        }

        if (json.has("mailFolders")) {
            final BaseMailFolderCollectionResponse response = new BaseMailFolderCollectionResponse();
            if (json.has("mailFolders@odata.nextLink")) {
                response.nextLink = json.get("mailFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mailFolders").toString(), JsonObject[].class);
            final MailFolder[] array = new MailFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MailFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mailFolders = new MailFolderCollectionPage(response, null);
        }

        if (json.has("calendars")) {
            final BaseCalendarCollectionResponse response = new BaseCalendarCollectionResponse();
            if (json.has("calendars@odata.nextLink")) {
                response.nextLink = json.get("calendars@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendars").toString(), JsonObject[].class);
            final Calendar[] array = new Calendar[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Calendar.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendars = new CalendarCollectionPage(response, null);
        }

        if (json.has("calendarGroups")) {
            final BaseCalendarGroupCollectionResponse response = new BaseCalendarGroupCollectionResponse();
            if (json.has("calendarGroups@odata.nextLink")) {
                response.nextLink = json.get("calendarGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarGroups").toString(), JsonObject[].class);
            final CalendarGroup[] array = new CalendarGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CalendarGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarGroups = new CalendarGroupCollectionPage(response, null);
        }

        if (json.has("calendarView")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("calendarView@odata.nextLink")) {
                response.nextLink = json.get("calendarView@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarView").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarView = new EventCollectionPage(response, null);
        }

        if (json.has("events")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("events@odata.nextLink")) {
                response.nextLink = json.get("events@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("events").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            events = new EventCollectionPage(response, null);
        }

        if (json.has("contacts")) {
            final BaseContactCollectionResponse response = new BaseContactCollectionResponse();
            if (json.has("contacts@odata.nextLink")) {
                response.nextLink = json.get("contacts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contacts").toString(), JsonObject[].class);
            final Contact[] array = new Contact[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Contact.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contacts = new ContactCollectionPage(response, null);
        }

        if (json.has("contactFolders")) {
            final BaseContactFolderCollectionResponse response = new BaseContactFolderCollectionResponse();
            if (json.has("contactFolders@odata.nextLink")) {
                response.nextLink = json.get("contactFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contactFolders").toString(), JsonObject[].class);
            final ContactFolder[] array = new ContactFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ContactFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contactFolders = new ContactFolderCollectionPage(response, null);
        }

        if (json.has("photos")) {
            final BaseProfilePhotoCollectionResponse response = new BaseProfilePhotoCollectionResponse();
            if (json.has("photos@odata.nextLink")) {
                response.nextLink = json.get("photos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("photos").toString(), JsonObject[].class);
            final ProfilePhoto[] array = new ProfilePhoto[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProfilePhoto.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            photos = new ProfilePhotoCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final BaseDriveCollectionResponse response = new BaseDriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }
    }
}