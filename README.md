# GoCD OAuth Login
This is GoCD's Authentication plugin that allows users to login using OAuth.

This fork actually allows the ability to filter based on user's private organisations
The previous version of this plugin used a fixed auth token to check the user's organisations,
which only shows their public affiliations. By using the authorisation that comes from the login
process, we can access their private organisations as well.

## Currently supported
* GitHub
* Google

## Adding new providers
The plugin internally uses [social-auth](https://github.com/3pillarlabs/socialauth) which acts as a wrapper for multiple OAuth integrations. Hence adding more integrations is very little effort. You will need to add a [provider](https://github.com/srinivasupadhya/gocd-oauth-login/blob/master/src/main/java/com/tw/go/plugin/provider/Provider.java) and a [maven profile](https://github.com/srinivasupadhya/gocd-oauth-login/blob/master/pom.xml#L65) (use **Google** implementation for reference).

## Requirements
* GoCD >= v15.2

## Getting Started

## Installation

Download the latest plugin jar from [Releases](https://github.com/srinivasupadhya/gocd-oauth-login/releases) section. Place it in `<go-server-location>/plugins/external` and restart Go Server.

## Configuration (GitHub as an example)

**Note**: Due to a bug in the current version of GoCD, you'll need to set a valid **Password file path** under **Server Configuration** (or configure an LDAP server).

It is also recommended you have at least one local admin configured to avoid getting yourself locked out during this process. If you're using password files, make sure the file contains at least one entry, as per these [instructions](https://github.com/gocd/documentation/blob/master/user/configuration/dev_authentication.md#file-based-authentication).

1. Generate an OAuth Client ID and Client Secret (go to Personal settings > Applications > Developer applications): ![Generate OAuth Token][1]

1. Generate a "Personal access token" (recommended). The plugin only needs the **user** permission to work.

1. You will see **Github OAuth Login** / **Google OAuth Login** on plugin listing page: ![Plugins listing page][2]

1. Enter the client ID and secret obtained from the first step under Consumer Key and Consumer Secret: ![Configure plugin pop-up][3]

1. Once you click Save, you should see this screen: ![Login Page][4]

1. Log in with your GitHub credentials, and you will be taken to GitHub to authorize the application to access your data: ![GitHub authorize page][5]

1. If everything worked as expected, you should see your pipeline dashboard: ![Pipeline Dashboard][6]

The **GitHub** plugin also supports user search, allowing you to search and add users right from GoCD's UI:
![Add User][7]

[1]: images/generate-oauth-token.png  "Generate OAuth Token"
[2]: images/list-plugin.png  "List Plugin"
[3]: images/configure-plugin.png  "Configure Plugin"
[4]: images/login-page.png  "Login Page"
[5]: images/github-login.png  "Authorize GitHub Login"
[6]: images/successful-login.png  "On Successful Login"
[7]: images/add-user.png  "Add User"
