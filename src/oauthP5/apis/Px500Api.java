package oauthP5.apis;

import oauthP5.oauth.Token;

public class Px500Api extends DefaultApi10a
{
  private static final String AUTHORIZATION_URL = "https://api.500px.com/v1/oauth/authorize?oauth_token=%s";
  
  @Override
  public String getAccessTokenEndpoint()
  {
    return "https://api.500px.com/v1/oauth/access_token";
  }

  @Override
  public String getRequestTokenEndpoint()
  {
    return "https://api.500px.com/v1/oauth/request_token";
  }
  
  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZATION_URL, requestToken.getToken());
  }
}