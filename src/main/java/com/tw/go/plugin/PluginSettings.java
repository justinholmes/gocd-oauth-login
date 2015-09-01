package com.tw.go.plugin;

import static org.apache.commons.lang.StringUtils.isBlank;

public class PluginSettings {
    private String serverBaseURL;
    private String consumerKey;
    private String consumerSecret;
    private String username;
    private String password;
    private String oauthToken;
    private String organisationName;
    private String usernameRegex;

    public PluginSettings(String serverBaseURL, String consumerKey, String consumerSecret, String username, String password, String oauthToken, String usernameRegex, String organisationName) {
        this.serverBaseURL = serverBaseURL;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.username = username;
        this.password = password;
        this.oauthToken = oauthToken;
        this.organisationName = organisationName;
        this.usernameRegex = usernameRegex;
    }

    public String getServerBaseURL() {
        return serverBaseURL;
    }

    public void setServerBaseURL(String serverBaseURL) {
        this.serverBaseURL = serverBaseURL;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    public String getUsernameRegex() {
        return usernameRegex;
    }

    public void setUsernameRegex(String usernameRegex) {
        this.usernameRegex = usernameRegex;
    }

    public boolean containsUsernameAndPassword() {
        return !isBlank(username) && !isBlank(password);
    }

    public boolean containsOAuthToken() {
        return !isBlank(oauthToken);
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PluginSettings that = (PluginSettings) o;

        if (consumerKey != null ? !consumerKey.equals(that.consumerKey) : that.consumerKey != null) return false;
        if (consumerSecret != null ? !consumerSecret.equals(that.consumerSecret) : that.consumerSecret != null)
            return false;
        if (oauthToken != null ? !oauthToken.equals(that.oauthToken) : that.oauthToken != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (serverBaseURL != null ? !serverBaseURL.equals(that.serverBaseURL) : that.serverBaseURL != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serverBaseURL != null ? serverBaseURL.hashCode() : 0;
        result = 31 * result + (consumerKey != null ? consumerKey.hashCode() : 0);
        result = 31 * result + (consumerSecret != null ? consumerSecret.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (oauthToken != null ? oauthToken.hashCode() : 0);
        return result;
    }

}
