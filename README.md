# client-rest-service

### to generate keystore
```
keytool -genkey -v -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass changeit -keypass changeit -validity 10000 -keysize 2048
```
### to view Keystore details
```
keytool -list -v -keystore keystore.jks
```
### to list all certs in CAcert
```
keytool -list -v -keystore cacerts
```
### to import X509 cert into CAcert (localhost.crt here is X509 cert)
```
keytool -importcert -file localhost.crt -alias selfsigned -keystore cacerts -storepass changeit
```
### include cacert into client src/main/resources

### include jks into server src/main/resources
