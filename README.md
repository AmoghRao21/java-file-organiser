# Java File Organizer

## Purpose
A Java implementation of the Bash script `[ -d "output" ] || { mkdir output && mv *.class output/ && echo "Done"; }`.

## How to Run
1. Compile: `javac logic1.java`
2. Execute: `java logic1`

## Bash vs. Java
| Bash Command          | Java Equivalent               |
|-----------------------|-------------------------------|
| `[ -d "output" ]`     | `Files.exists(outputDir)`     |
| `mkdir -p output`     | `Files.createDirectories()`   |
| `mv *.class output/`  | `Files.move()` + `DirectoryStream` |

# Included Interavtive CLI tool.
