Secure API Example
==================
Example of an API protected by Anypoint Secure Token Service. The operations on the API are protected by READ and WRITE scope. These are the only scopes declared on the OAuth2 Provider. The provider registers 3 clients, two of which are of the grantType RESOUCE_OWNER_PASSWORD_CREDENTIALS permitting the client to exchange a username / password pair for a token. The other client is of type IMPLICIT obliging the client to complete the full OAuth2 dance.
The API also demonstrates the use of HTTPS as the inbound-endpoint on the API in order to cover the need for Digital Signatures and Encryption.

Contact
=======
nial.darbey@mulesoft.com