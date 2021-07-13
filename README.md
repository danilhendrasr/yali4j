# YALIJA

YALIJA stands for Yet Another Lox Interpreter written in Java. Initially I wanted to claim that it's "a new programming language written in Java" because it sounds cooler :p, 
but unfortunately it's not, I'm not the one making up the grammars and such, I'm just coding up the interpreter.

This interpreter is a tree-walking interpreter, that means the interpreter kicks up right after parsing is done and walks through the abstract syntax tree while evaluating each node as it goes through. 
There's no compilation step, no bytecode generation, let alone machine code generation or any similar fancy stuff.
It's slow performance-wise, but it's a great start for learning.

## Current Status
> (🏃‍♂️) means I'm working on it.

- [x] Scanner
- [ ] Parser (🏃‍♂️)
- [ ] Core interpreter (🏃‍♂️)

## I Never Heard of Lox
That's to be expected, Lox language is a language defined in Bob Nystrom's book, [Crafting Interpreters](http://craftinginterpreters.com/). It's just a language created for learning purpose, not to be used in real world like Java, Python, or any other major programming languages.
