package cn.steven.demo.common;

import java.util.Map;
import java.util.Properties;

public class SystemProperties {

    /**
     *
     * <pre>
     *    {
     * 	"java.runtime.name": "OpenJDK Runtime Environment",
     * 	"sun.boot.library.path": "/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/amd64",
     * 	"java.vm.version": "25.275-b01",
     * 	"java.vm.vendor": "AdoptOpenJDK",
     * 	"java.vendor.url": "https://adoptopenjdk.net/",
     * 	"path.separator": ":",
     * 	"java.vm.name": "OpenJDK 64-Bit Server VM",
     * 	"file.encoding.pkg": "sun.io",
     * 	"user.country": "CN",
     * 	"sun.java.launcher": "SUN_STANDARD",
     * 	"sun.os.patch.level": "unknown",
     * 	"java.vm.specification.name": "Java Virtual Machine Specification",
     * 	"user.dir": "/data/home/luwei/work/github/tutorial/demo",
     * 	"java.runtime.version": "1.8.0_275-b01",
     * 	"java.awt.graphicsenv": "sun.awt.X11GraphicsEnvironment",
     * 	"java.endorsed.dirs": "/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/endorsed",
     * 	"os.arch": "amd64",
     * 	"java.io.tmpdir": "/tmp",
     * 	"line.separator": "\n",
     * 	"java.vm.specification.vendor": "Oracle Corporation",
     * 	"os.name": "Linux",
     * 	"sun.jnu.encoding": "UTF-8",
     * 	"java.library.path": "/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib",
     * 	"java.specification.name": "Java Platform API Specification",
     * 	"java.class.version": "52.0",
     * 	"sun.management.compiler": "HotSpot 64-Bit Tiered Compilers",
     * 	"os.version": "5.10.60-amd64-desktop",
     * 	"user.home": "/home/luwei",
     * 	"user.timezone": "Asia/Shanghai",
     * 	"java.awt.printerjob": "sun.print.PSPrinterJob",
     * 	"file.encoding": "UTF-8",
     * 	"java.specification.version": "1.8",
     * 	"java.class.path": "/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-launcher/1.7.2/junit-platform-launcher-1.7.2.jar:/data/home/luwei/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-engine/1.7.2/junit-platform-engine-1.7.2.jar:/data/home/luwei/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-commons/1.7.2/junit-platform-commons-1.7.2.jar:/opt/apps/idea-IU-203.5981.155/lib/idea_rt.jar:/opt/apps/idea-IU-203.5981.155/plugins/junit/lib/junit5-rt.jar:/opt/apps/idea-IU-203.5981.155/plugins/junit/lib/junit-rt.jar:/data/home/luwei/work/github/tutorial/demo/build/classes/java/test:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/charsets.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/cldrdata.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/dnsns.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/jaccess.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/localedata.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/nashorn.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunec.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunjce_provider.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunpkcs11.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/zipfs.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jce.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jfr.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jsse.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/management-agent.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/resources.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/rt.jar:/data/home/luwei/work/github/tutorial/demo/build/classes/java/main:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.12.4/jackson-databind-2.12.4.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter/5.7.2/62faa742964a9d8dab8fdb4a0eab7b01441c171f/junit-jupiter-5.7.2.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.mockito/mockito-junit-jupiter/3.9.0/871745ab6af5a269411ea3c1f99ced82ed079436/mockito-junit-jupiter-3.9.0.jar:/home/luwei/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.12.4/jackson-annotations-2.12.4.jar:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.12.4/jackson-core-2.12.4.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-params/5.7.2/685f832f8c54dd40100f646d61aca88ed9545421/junit-jupiter-params-5.7.2.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.mockito/mockito-core/3.9.0/b7573430aea743b26434b44f4f46272af613e660/mockito-core-3.9.0.jar:/home/luwei/.m2/repository/org/junit/platform/junit-platform-commons/1.7.2/junit-platform-commons-1.7.2.jar:/home/luwei/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/home/luwei/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/luwei/.m2/repository/net/bytebuddy/byte-buddy/1.10.22/byte-buddy-1.10.22.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/net.bytebuddy/byte-buddy-agent/1.10.22/b01df6b71a882b9fde5a608a26e641cd399a4d83/byte-buddy-agent-1.10.22.jar:/home/luwei/.m2/repository/org/objenesis/objenesis/3.2/objenesis-3.2.jar:/home/luwei/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar:/home/luwei/.m2/repository/org/junit/platform/junit-platform-engine/1.7.2/junit-platform-engine-1.7.2.jar:/opt/apps/idea-IU-203.5981.155/lib/idea_rt.jar",
     * 	"user.name": "luwei",
     * 	"java.vm.specification.version": "1.8",
     * 	"sun.java.command": "com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 cn.steven.demo.proxy.TargetJdkProxyTest,invoke",
     * 	"java.home": "/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre",
     * 	"sun.arch.data.model": "64",
     * 	"user.language": "zh",
     * 	"java.specification.vendor": "Oracle Corporation",
     * 	"awt.toolkit": "sun.awt.X11.XToolkit",
     * 	"java.vm.info": "mixed mode",
     * 	"java.version": "1.8.0_275",
     * 	"java.ext.dirs": "/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext:/usr/java/packages/lib/ext",
     * 	"sun.boot.class.path": "/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/resources.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/rt.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/sunrsasign.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jsse.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jce.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/charsets.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jfr.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/classes",
     * 	"java.vendor": "AdoptOpenJDK",
     * 	"file.separator": "/",
     * 	"java.vendor.url.bug": "https://github.com/AdoptOpenJDK/openjdk-support/issues",
     * 	"idea.test.cyclic.buffer.size": "1048576",
     * 	"sun.io.unicode.encoding": "UnicodeLittle",
     * 	"sun.cpu.endian": "little",
     * 	"sun.desktop": "gnome",
     * 	"sun.cpu.isalist": ""
     * }
     *
     * </pre>
     *
     *
     */
    public Properties getSystemProperties(){
        return System.getProperties();
    }

    /**
     * <pre>
     *     {
     * 	"PATH": "/home/luwei/.yarn/bin:/opt/apps/node-v14.15.3-linux-x64/bin:/usr/local/bin:/usr/bin:/bin:/usr/local/games:/usr/games:/sbin:/usr/sbin",
     * 	"XAUTHORITY": "/home/luwei/.Xauthority",
     * 	"QT_LOGGING_RULES": "*.debug=false",
     * 	"XMODIFIERS": "@im=fcitx",
     * 	"GDMSESSION": "deepin",
     * 	"QT_IM_MODULE": "fcitx",
     * 	"GTK_IM_MODULE": "fcitx",
     * 	"XDG_SEAT_PATH": "/org/freedesktop/DisplayManager/Seat0",
     * 	"DBUS_SESSION_BUS_ADDRESS": "unix:path=/run/user/1000/bus",
     * 	"GNOME_KEYRING_CONTROL": "/home/luwei/.cache/keyring-DEQ3F1",
     * 	"LANG": "zh_CN.UTF-8",
     * 	"XDG_SESSION_TYPE": "x11",
     * 	"XDG_SESSION_ID": "2",
     * 	"XDG_CACHE_HOME": "/home/luwei/.cache",
     * 	"XDG_CURRENT_DESKTOP": "Deepin",
     * 	"DISPLAY": ":0",
     * 	"QT_LINUX_ACCESSIBILITY_ALWAYS_ON": "1",
     * 	"LOGNAME": "luwei",
     * 	"PWD": "/data/home/luwei/work/github/tutorial/demo",
     * 	"XDG_SESSION_CLASS": "user",
     * 	"LANGUAGE": "zh_CN",
     * 	"SHELL": "/bin/zsh",
     * 	"NODE_HOME": "/opt/apps/node-v14.15.3-linux-x64",
     * 	"XDG_DATA_HOME": "/home/luwei/.local/share",
     * 	"QT_DBL_CLICK_DIST": "15",
     * 	"GIO_LAUNCHED_DESKTOP_FILE": "/home/luwei/Desktop/idea.desktop",
     * 	"XDG_GREETER_DATA_DIR": "/var/lib/lightdm/data/luwei",
     * 	"DESKTOP_SESSION": "deepin",
     * 	"GPG_AGENT_INFO": "/run/user/1000/gnupg/S.gpg-agent:0:1",
     * 	"USER": "luwei",
     * 	"XDG_CONFIG_HOME": "/home/luwei/.config",
     * 	"GIO_LAUNCHED_DESKTOP_FILE_PID": "6515",
     * 	"QT_ACCESSIBILITY": "1",
     * 	"GNOME_DESKTOP_SESSION_ID": "this-is-deprecated",
     * 	"XDG_SEAT": "seat0",
     * 	"SSH_AUTH_SOCK": "/home/luwei/.cache/keyring-DEQ3F1/ssh",
     * 	"CLUTTER_IM_MODULE": "fcitx",
     * 	"XDG_SESSION_PATH": "/org/freedesktop/DisplayManager/Session0",
     * 	"XDG_RUNTIME_DIR": "/run/user/1000",
     * 	"XDG_SESSION_DESKTOP": "deepin",
     * 	"XDG_VTNR": "1",
     * 	"HOME": "/home/luwei"
     * }
     *
     * </pre>
     *
     */
    public Map<String, String> getEnv(){
       return  System.getenv();
    }

}
