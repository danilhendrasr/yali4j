<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->



<!-- PROJECT LOGO -->
<p align="center">
  <h1 align="center">YALIJA</h1>

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
    <li><a href="#usage">Usage</a></li>
    <li><a href="#project-status">Project Status</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

YALIJA stands for Yet Another Lox Interpreter written in Java. Initially I wanted to claim that it's "a new programming language written in Java" because it sounds cooler :p, but it's not.

Lox is a programming language defined in Bob Nystrom's book, [Crafting Interpreters](http://craftinginterpreters.com/). It's a language created for learning purpose only, and not used in real industry-standard environment like Java, Python, or any other major programming language does.

As for this interpreter, it's a tree-walking interpreter, which kicks up the core interpreter right after parsing is done, it walks through the AST while evaluating each node as it goes through. There's no compilation step, no bytecode generation, let alone machine code generation or any similar fancy stuff.
It's relatively slow performance-wise, but it's a great start for learning.

### Why I built this

I've always had this vague curiosity about how things works under the hood. Especially in software engineering, since we got all these amazing tools, frameworks,
and programming languages popping up every so often. And upon realizing that most of these tools are hand-crafted by programmers, it kind of provoked my
curiosity, and thus I decided to explore deeper.

I chose to start with learning how programming languages are made, since programming language is the very fundamental building block to every tool 
that exists today, and it's also the very thing every programmer used on day-to-day basis. Thankfully I stumbled upon Bob Nystrom's [craftinginterpreters.com](https://craftinginterpreters.com) which provide a very valuable guidance for free.

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

You need to have JDK 11 or above installed on your computer. There are many flavors of JDK and tutorials online to guide you if you don't know how to install it, 
you can simply google it. Or you can go to [here](https://www.oracle.com/java/technologies/javase-downloads.html) if you're not sure.

### Installation

_Will be updated soon._

<!-- USAGE EXAMPLES -->
## Usage

_Will be updated soon._

<!-- ROADMAP -->
## Project Status

Here's the status of the core components.
> (🏃‍♂️) means I'm working on it.

- [x] Scanner
- [ ] Parser (🏃‍♂️)
- [ ] Core interpreter (🏃‍♂️)


<!-- LICENSE -->
## License

Distributed under the MIT License. See [LICENSE](https://github.com/danilhendrasr/yalija/blob/main/LICENSE) for more information.


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
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/danilhendrasr/yalija/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/danilhendrasr/yalija/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/danilhendrasr
[product-screenshot]: images/screenshot.png
