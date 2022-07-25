<div id="top"></div>

<p align="center">
  <h1 align="center">yali4j</h1>

  <p align="center">
    Yet Another Lox Interpreter, written in Java.
  </p>
</p>

<div align="center">
  
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
  
</div>


<!-- ABOUT THE PROJECT -->
## About The Project

yali4j is just another Lox interpreter written in Java. Initially I wanted to claim that it's "a new programming language written in Java" because it sounds cooler :p, but it's not.

Lox is a programming language defined in Bob Nystrom's book, [Crafting Interpreters](http://craftinginterpreters.com/). It's a language created for learning purpose , and not used in real industry-standard environment like Java, Python, or any other major programming language does.

As for this interpreter, it's a tree-walking interpreter, which kicks up the core interpreter right after parsing is done, it walks through the AST while evaluating each node as it goes through. There's no compilation step, no bytecode generation, let alone machine code generation or any similar fancy stuff.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
- JDK 11 or above;
- Gradle.

### Build from source
1. Clone the repo and `cd` into the directory;
2. Run `gradle build`;
3. The resulting jar file is located in the `build/libs/yali4j-0.1.0.jar`;
4. Run the jar file by using:
   ```bash
   java -jar yali4j-0.1.0.jar
   ```
5. Test out the language by typing the following:
   ```bash
   print "Hello world!";
   ```

### Using Pre-built Binaries
1. Go to the [releases page](https://github.com/danilhendrasr/yali4j/releases);
2. Download any version you want to test out;
3. After download is finished, run the following command:
   ```bash
   java -jar yali4j-x.x.x-release-name.jar
   ```

   The above command will run yali4j in REPL mode. If you wanted to run a file, run the following command,
   ```
   java -jar yali4j-x.x.x-release-name.jar hello_world.lox
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See [LICENSE][license-url] for more information.


<!-- CONTACT -->
## Contact

[![Twitter][twitter-shield]][twitter-url] 
[![LinkedIn][linkedin-shield]][linkedin-url] 
[![Email][gmail-shield]][mail-url]


<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [craftinginterpreters.com](https://www.craftinginterpreters.com)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[repo-url]: (https://github.com/danilhendrasr/yali4j)
[stars-shield]: https://img.shields.io/github/stars/danilhendrasr/yali4j.svg?style=for-the-badge
[stars-url]: https://github.com/danilhendrasr/yali4j/stargazers
[issues-shield]: https://img.shields.io/github/issues/danilhendrasr/yali4j.svg?style=for-the-badge
[issues-url]: https://github.com/danilhendrasr/yali4j/issues
[license-shield]: https://img.shields.io/github/license/danilhendrasr/yali4j.svg?style=for-the-badge
[license-url]: https://github.com/danilhendrasr/yali4j/blob/main/LICENSE

[twitter-shield]: https://img.shields.io/badge/Twitter-1DA1F2.svg?style=for-the-badge&logo=twitter&logoColor=white
[twitter-url]: https://twitter.com/danilhendrasr
[linkedin-shield]: https://img.shields.io/badge/LinkedIn-0A66C2.svg?style=for-the-badge&logo=linkedin&logoColor=white
[linkedin-url]: https://linkedin.com/in/danilhendrasr
[gmail-shield]: https://img.shields.io/badge/Email-EA4335.svg?style=for-the-badge&logo=gmail&logoColor=white
[mail-url]: mailto:danilhendrasr@gmail.com
