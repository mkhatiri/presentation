ifeq ($(wildcard /usr/include/LaTeX.mk),/usr/include/LaTeX.mk)
include LaTeX.mk
else

DOC := slides
SHELL := /bin/bash

.PHONY: pdf clean realclean

all: pdf

pdf: $(DOC).pdf

$(DOC).pdf: $(DOC).tex
	pdflatex $<
	bibtex $(DOC)
	pdflatex $<
	pdflatex $<


clean:
	rm -f $(DOC).{aux,log,nav,out,snm,toc,vrb,ps,dvi,bbl,blg}

realclean: clean
	rm -f $(DOC).pdf

endif
