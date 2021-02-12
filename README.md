# Gene Expression

## Introduction

Genes are part of chromosomes found in the nucleus of eukaryotes.
These genes encode structural protein information in chunks called
DNA.

Implement the basic mechanism how DNA translates to RNA (central dogma). 
Further, add functionality such, that the messenger RNA (mRNA) produces
a valid polypeptide chain (precursory protein).

The following Wikipedia article describes the process in more detail:
[Genetic code](https://en.wikipedia.org/wiki/Genetic_code)

DNA and RNA are quite similar in their molecular structure. However,
a thymine (T) nucleotide in the DNA strand is replaced by a uracil 
(U) nucleotide in the resulting RNA strand.

Once an mRNA strand is present, there are several ways how 
the nucleotide sequence is processed (open reading frame). Usually, a valid 
sequence starts with the codon (nucleotide triple) "UAG", and ends 
with either the codon "UAA" or "UAG" or "UGA". 

To test your code locally, refer to [this](http://www.molbiotools.com/randomsequencegenerator.html) 
site which generates synthetic DNA or RNA strands of arbitrary length. You can check
the resulting polypeptide chain of your code with the tool found [here.](https://web.expasy.org/translate/)

## Tasks

- Add the code necessary for transcription. Find the corresponding
  code section in the class RNApol.java. (level: **easy**)
  

- Add the code necessary for translation. Find the corresponding
  code section in the class Ribosome.java and add reading frame
  handling. (level: **intermediate**)
  