#!/bin/bash
set -x

antlr4 CustomLexer.g4 CustomParser.g4 -o generated -package com.custom.language.antlr4.generated -visitor
