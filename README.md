The client will now receive all logging from the daemon (pid: 25812). The daemon log file: C:\Users\ikudryashov.EATMEAT\.gradle\daemon\4.8.1\daemon-25812.out.log
Starting build in new daemon [memory: 1.1 GB]
Using 4 worker leases.
Starting Build
Settings evaluated using settings file 'C:\shared\pbem_chess\settings.gradle'.
Using local directory build cache for the root build (location = C:\Users\ikudryashov.EATMEAT\.gradle\caches\build-cache-1, removeUnusedEntriesAfter = 7 days).
Projects loaded. Root project using build file 'C:\shared\pbem_chess\build.gradle'.
Included projects: [root project 'chess']
Parallel execution is an incubating feature.

> Configure project :
Evaluating root project 'chess' using build file 'C:\shared\pbem_chess\build.gradle'.
All projects evaluated.
Selected primary task 'run' from project :
Tasks to be executed: [task ':compileJava', task ':processResources', task ':classes', task ':run']
:compileJava (Thread[Daemon worker,5,main]) started.

> Task :compileJava
Build cache key for task ':compileJava' is 13b477d4b4c042298bb47a913e516d2f
Task ':compileJava' is not up-to-date because:
  Value of input property 'platform.name' has changed for task ':compileJava'
  Value of input property 'sourceCompatibility' has changed for task ':compileJava'
  Value of input property 'targetCompatibility' has changed for task ':compileJava'
All input files are considered out-of-date for incremental task ':compileJava'.
Compiling with JDK Java compiler API.
Note: C:\shared\pbem_chess\src\main\java\ru\vachok\pbem\chess\emails\MailWorksLocal.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Packing task ':compileJava'
:compileJava (Thread[Daemon worker,5,main]) completed. Took 3.683 secs.
:processResources (Thread[Task worker for ':' Thread 3,5,main]) started.

> Task :processResources NO-SOURCE
Skipping task ':processResources' as it has no source files and no previous output files.
:processResources (Thread[Task worker for ':' Thread 3,5,main]) completed. Took 0.072 secs.
:classes (Thread[Task worker for ':' Thread 2,5,main]) started.

> Task :classes
Skipping task ':classes' as it has no actions.
:classes (Thread[Task worker for ':' Thread 2,5,main]) completed. Took 0.022 secs.
:run (Thread[Task worker for ':' Thread 2,5,main]) started.

> Task :run
Caching disabled for task ':run': Caching has not been enabled for the task
Task ':run' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
Starting process 'command 'C:\Program Files\Java\jdk-9.0.4\bin\java.exe''. Working directory: C:\shared\pbem_chess Command: C:\Program Files\Java\jdk-9.0.4\bin\java.exe -Dfile.encoding=windows-1251 -Duser.country=US -Duser.language=en -Duser.variant -cp C:\shared\pbem_chess\build\classes\java\main;C:\shared\pbem_chess\build\resources\main;C:\shared\pbem_chess\lib\messenger-0.35.jar;C:\shared\pbem_chess\lib\mysqlandprop-0.31.jar;C:\Users\ikudryashov.EATMEAT\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.6\815893df5f31da2ece4040fe0a12fd44b577afaf\commons-io-2.6.jar;C:\Users\ikudryashov.EATMEAT\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-email\1.5\e8e677c6362eba14ff3c476ba63ccb83132dbd52\commons-email-1.5.jar;C:\Users\ikudryashov.EATMEAT\.gradle\caches\modules-2\files-2.1\javax.servlet\javax.servlet-api\3.1.0\3cd63d075497751784b2fa84be59432f4905bf7c\javax.servlet-api-3.1.0.jar;C:\Users\ikudryashov.EATMEAT\.gradle\caches\modules-2\files-2.1\com.sun.mail\javax.mail\1.5.6\ab5daef2f881c42c8e280cbe918ec4d7fdfd7efe\javax.mail-1.5.6.jar;C:\Users\ikudryashov.EATMEAT\.gradle\caches\modules-2\files-2.1\javax.activation\activation\1.1\e6cb541461c2834bdea3eb920f1884d1eb508b50\activation-1.1.jar ru.vachok.pbem.chess.StartMePChess
Successfully started process 'command 'C:\Program Files\Java\jdk-9.0.4\bin\java.exe''
INFO >>>>> typeName = [StartMePChess], title = [main ID 16], s = [Доброе утро!]

Jun 25, 2018 11:35:40 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
Jun 25, 2018 11:35:40 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
Jun 25, 2018 11:35:43 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
INFO >>>>> typeName = [AuthForChess], title = [PasswordAuthentication], s = [STARTS...]

Jun 25, 2018 11:35:43 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
Jun 25, 2018 11:35:43 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {charset=UTF-8, host=mail.chess.vachok.ru, From=bot@chess.vachok.ru, ssl=true}
Jun 25, 2018 11:35:43 AM ru.vachok.mysqlandprops.DbProperties getProps
WARNING: {pass=S15cQFO8kk50FKj, userName=bot@chess.vachok.ru}
INFO >>>>> typeName = [chess], title = [bot@chess.vachok.ru], s = [S15cQFO8kk50FKj]

DEBUG: JavaMail version 1.5.6
DEBUG: successfully loaded resource: /META-INF/javamail.default.providers
DEBUG: Tables of loaded providers
DEBUG: Providers Listed By Class Name: {com.sun.mail.smtp.SMTPSSLTransport=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], com.sun.mail.smtp.SMTPTransport=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle], com.sun.mail.imap.IMAPSSLStore=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], com.sun.mail.pop3.POP3SSLStore=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], com.sun.mail.imap.IMAPStore=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], com.sun.mail.pop3.POP3Store=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle]}
DEBUG: Providers Listed By Protocol: {imaps=javax.mail.Provider[STORE,imaps,com.sun.mail.imap.IMAPSSLStore,Oracle], imap=javax.mail.Provider[STORE,imap,com.sun.mail.imap.IMAPStore,Oracle], smtps=javax.mail.Provider[TRANSPORT,smtps,com.sun.mail.smtp.SMTPSSLTransport,Oracle], pop3=javax.mail.Provider[STORE,pop3,com.sun.mail.pop3.POP3Store,Oracle], pop3s=javax.mail.Provider[STORE,pop3s,com.sun.mail.pop3.POP3SSLStore,Oracle], smtp=javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]}
DEBUG: successfully loaded resource: /META-INF/javamail.default.address.map
DEBUG: getProvider() returning javax.mail.Provider[TRANSPORT,smtp,com.sun.mail.smtp.SMTPTransport,Oracle]
DEBUG SMTP: need username and password for authentication
DEBUG SMTP: protocolConnect returning false, host=mail.chess.vachok.ru, user=IKudryashov, password=<null>
DEBUG SMTP: useEhlo true, useAuth true
DEBUG SMTP: trying to connect to host "mail.chess.vachok.ru", port 465, isSSL false
220 server202.hosting.reg.ru ESMTP Exim 4.90_1 Mon, 25 Jun 2018 11:35:44 +0300
DEBUG SMTP: connected to host "mail.chess.vachok.ru", port: 465

EHLO a161.eatmeat.ru
250-server202.hosting.reg.ru Hello a161.eatmeat.ru [91.210.86.35]
250-SIZE 52428800
250-8BITMIME
250-PIPELINING
250-AUTH LOGIN PLAIN
250 HELP
DEBUG SMTP: Found extension "SIZE", arg "52428800"
DEBUG SMTP: Found extension "8BITMIME", arg ""
DEBUG SMTP: Found extension "PIPELINING", arg ""
DEBUG SMTP: Found extension "AUTH", arg "LOGIN PLAIN"
DEBUG SMTP: Found extension "HELP", arg ""
DEBUG SMTP: protocolConnect login, host=mail.chess.vachok.ru, user=bot@chess.vachok.ru, password=<non-null>
DEBUG SMTP: Attempt to authenticate using mechanisms: LOGIN PLAIN DIGEST-MD5 NTLM XOAUTH2 
DEBUG SMTP: Using mechanism LOGIN
DEBUG SMTP: AUTH LOGIN command trace suppressed
DEBUG SMTP: AUTH LOGIN succeeded
DEBUG SMTP: use8bit false
MAIL FROM:<bot@chess.vachok.ru>
250 OK
RCPT TO:<143500@gmail.com>
250 Accepted
DEBUG SMTP: Verified Addresses
DEBUG SMTP:   143500@gmail.com
DATA
354 Enter message, ending with "." on a line by itself
Date: Mon, 25 Jun 2018 11:35:43 +0300 (MSK)
From: bot@chess.vachok.ru
Reply-To: bot@chess.vachok.ru
To: 143500@gmail.com
Message-ID: <1489743810.0.1529915744025@a161.eatmeat.ru>
Subject: YOUR RESPONSE (2018-06-25T11:35:41.275130)
MIME-Version: 1.0
Content-Type: text/plain; charset=UTF-8
Content-Transfer-Encoding: 7bit

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<!--suppress ALL -->
<html>
<head>
    <title>Contents</title>
</head>
<body>
<a href="http://chess.vachok.ru/docs/" target=_blank>Documents</a>
<p>
    <a href="https://github.com/Vachok/pbem_chess" target=_blank>GitHub SRC</a>
<p>
    <a href="https://github.com/Vachok/pbem_chess/wiki/Build-Scan" target=_blank>Gradle SCANS</a>
</body>
</html>
.
250 OK id=1fXMyO-000324-CJ
DEBUG SMTP: message successfully delivered to mail server
QUIT
221 server202.hosting.reg.ru closing connection
:run (Thread[Task worker for ':' Thread 2,5,main]) completed. Took 6.018 secs.

BUILD SUCCESSFUL in 20s
2 actionable tasks: 2 executed
