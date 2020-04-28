# spring-security-ldap
# ldap open implemetation -- local instance of LDAP for us to use

    <groupId>com.unboundid</groupId>
    <artifactId>unboundid-ldapsdk</artifactId>
    <!-- <version>4.0.14</version> -->    

# spring integration library that works with ldap

    <groupId>org.springframework.ldap</groupId>
    <artifactId>spring-ldap-core</artifactId>
    <!-- <version>2.3.2.RELEASE</version> -->

# spring security integrate with LDAP

    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-ldap</artifactId>
    <version>5.2.1.RELEASE</version>


# add properties to connect local LDAP server

link to ldif file and spring documentation - https://spring.io/guides/gs/authenticating-ldap/
password encoded in sha format alright sha is not usually a recommended format for encoding passwords in general but this is I think the only thing that works with LDAP


