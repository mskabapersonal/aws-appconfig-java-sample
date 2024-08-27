<a id="top"></a>

<p style="font-size: 24px;"><img src="./qct-icons/transform-logo.svg" style="margin-right: 15px; vertical-align: middle;"></img><b>Code Transformation Summary by Amazon Q </b></p>
<p><img src="./qct-icons/transform-variables-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Lines of code in your application: 610 <p>
<p><img src="./qct-icons/transform-clock-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Transformation duration: 14 min(s) <p>
<p><img src="./qct-icons/transform-dependencies-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned dependencies replaced: 6 of 9 <p>
<p><img src="./qct-icons/transform-dependencyAnalyzer-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Additional dependencies added: 5 <p>
<p><img src="./qct-icons/transform-smartStepInto-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned deprecated code instances replaced: 0 of 1 <p>
<p><img src="./qct-icons/transform-listFiles-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Files changed: 10 <p>
<p><img src="./qct-icons/transform-build-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Build status in Java 17: <span style="color: #00CC00">SUCCEEDED</span> <p>

### Table of Contents

1. <a href="#build-log-summary">Build log summary</a> 
1. <a href="#planned-dependencies-replaced">Planned dependencies replaced</a> 
1. <a href="#additional-dependencies-added">Additional dependencies added</a> 
1. <a href="#deprecated-code-replaced">Deprecated code replaced</a> 
1. <a href="#other-changes">Other changes</a> 
1. <a href="#all-files-changed">All files changed</a> 
1. <a href="#next-steps">Next steps</a> 


### Build log summary <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="build-log-summary"></a>

Amazon Q successfully built the upgraded code in Java 17. Here is a relevant snippet from the build log. To view the full build log, open [`buildCommandOutput.log`](./buildCommandOutput.log)

```
The Maven build compiled Java 17 source code, ran 7 tests without failures, errors or skips, built a JAR file, and repackaged it as a standalone executable JAR. The build was successful overall.
```


### Planned dependencies replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="planned-dependencies-replaced"></a>

Amazon Q updated the following dependencies that it identified in the transformation plan

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `jakarta.validation:jakarta.validation-api` | Added | - | 3.1.0 |
| `javax.validation:validation-api` | Removed | 2.0.1.Final | - |
| `junit:junit` | Removed | 4.13.1 | - |
| `org.mockito:mockito-all` | Removed | 1.10.19 | - |
| `org.mockito:mockito-core` | Added | - | - |
| `org.springframework.boot:spring-boot-starter-parent` | Updated | 2.0.5.RELEASE | 3.3.3 |

### Additional dependencies added <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="additional-dependencies-added"></a>

Amazon Q updated the following additional dependencies during the upgrade

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `org.apache.logging.log4j:log4j-api` | Updated | 2.13.3 | - |
| `org.apache.logging.log4j:log4j-core` | Updated | 2.13.3 | - |
| `org.apache.maven.plugins:maven-compiler-plugin` | Updated | 3.8.1 | - |
| `org.json:json` | Updated | 20200518 | 20240303 |
| `software.amazon.awssdk:bom` | Updated | 2.14.27 | 2.26.16 |

### Deprecated code replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="deprecated-code-replaced"></a>


Amazon Q replaced the following instances of deprecated code. An instance with 0 files changed
indicates Amazon Q wasn't able to replace the deprecated code.

| Deprecated code | Files changed |
|----------------|----------------|
| `java.util.Date.Date(int,int,int)` | 0 |



### Other changes <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="other-changes"></a>



### All files changed <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="all-files-changed"></a>

| File | Action |
|----------------|--------|
| [pom.xml](../pom.xml) | Updated |
| [src/main/java/com/amazonaws/samples/appconfig/movies/MoviesController.java](../src/main/java/com/amazonaws/samples/appconfig/movies/MoviesController.java) | Updated |
| [src/main/java/com/amazonaws/samples/appconfig/utils/Encoder.java](../src/main/java/com/amazonaws/samples/appconfig/utils/Encoder.java) | Updated |
| [src/main/java/com/amazonaws/samples/appconfig/utils/HTMLBuilder.java](../src/main/java/com/amazonaws/samples/appconfig/utils/HTMLBuilder.java) | Updated |
| [src/main/java/com/amazonaws/samples/appconfig/utils/Math.java](../src/main/java/com/amazonaws/samples/appconfig/utils/Math.java) | Updated |
| [src/main/java/com/amazonaws/samples/appconfig/utils/Security.java](../src/main/java/com/amazonaws/samples/appconfig/utils/Security.java) | Updated |
| [src/test/java/com/amazonaws/samples/appconfig/movies/MathTest.java](../src/test/java/com/amazonaws/samples/appconfig/movies/MathTest.java) | Updated |
| [src/test/java/com/amazonaws/samples/appconfig/movies/MockTest.java](../src/test/java/com/amazonaws/samples/appconfig/movies/MockTest.java) | Updated |
| [src/test/java/com/amazonaws/samples/appconfig/movies/MovieTest.java](../src/test/java/com/amazonaws/samples/appconfig/movies/MovieTest.java) | Updated |
| [src/test/java/com/amazonaws/samples/appconfig/movies/MoviesControllerTest.java](../src/test/java/com/amazonaws/samples/appconfig/movies/MoviesControllerTest.java) | Updated |

### Next steps <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="next-steps"></a>

1. Please review and accept the code changes using the diff viewer.If you are using a Private Repository, please ensure that updated dependencies are available.
1. 
1. In order to successfully verify these changes on your machine, you will need to change your project to Java 17. We verified the changes using [Amazon Corretto Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html
) build environment.
1. If this project uses Maven CheckStyle, Enforcer, FindBugs or SpotBugs plugins, Q Code Transformation will disable those plugins when we build the project to verify proposed upgrades.