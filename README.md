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


<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#features">Features</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

<!-- [![Product Name Screen Shot][product-screenshot]](https://example.com) -->

yali4j is just another Lox interpreter written in Java. Initially I wanted to claim that it's "a new programming language written in Java" because it sounds cooler :p, but it's not.

Lox is a programming language defined in Bob Nystrom's book, [Crafting Interpreters](http://craftinginterpreters.com/). It's a language created for learning purpose , and not used in real industry-standard environment like Java, Python, or any other major programming language does.

As for this interpreter, it's a tree-walking interpreter, which kicks up the core interpreter right after parsing is done, it walks through the AST while evaluating each node as it goes through. There's no compilation step, no bytecode generation, let alone machine code generation or any similar fancy stuff.

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

You need to have JDK 11 or later installed on your computer. There are many flavors of JDK and tutorials online to guide you if you don't know how to install it, 
you can simply google it. Or you can go [here](https://www.oracle.com/java/technologies/javase-downloads.html) if you're unsure.

### Installation

Go to the [releases page](https://github.com/danilhendrasr/yali4j/releases) and download the latest release's jar. Then run it in your terminal, with the following command,
```bash
java -jar yali4j-x.x.x-release-name.jar
```

The above command will run yali4j in REPL mode. If you wanted to run a file, run the following command,
```
java -jar yali4j-x.x.x-release-name.jar hello_world.lox
```

## Features

_Documentation coming up soon_


<!-- LICENSE -->
## License

Distributed under the MIT License. See [LICENSE](https://github.com/danilhendrasr/yali4j/blob/main/LICENSE) for more information.


<!-- CONTACT -->
## Contact

Danil Hendra Suryawan - danilhendrasr@gmail.com


<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [craftinginterpreters.com](https://www.craftinginterpreters.com)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/danilhendrasr/yali4j.svg?style=for-the-badge
[stars-url]: https://github.com/danilhendrasr/yali4j/stargazers
[issues-shield]: https://img.shields.io/github/issues/danilhendrasr/yali4j.svg?style=for-the-badge
[issues-url]: https://github.com/danilhendrasr/yali4j/issues
[license-shield]: https://img.shields.io/github/license/danilhendrasr/yali4j.svg?style=for-the-badge
[license-url]: https://github.com/danilhendrasr/yali4j/blob/main/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/danilhendrasr
[product-screenshot]: images/screenshot.png
