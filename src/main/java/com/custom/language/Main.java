package com.custom.language;

import com.custom.language.antlr4.generated.CustomLexer;
import com.custom.language.antlr4.generated.CustomParser;
import com.custom.language.antlr4.generated.CustomParserBaseVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.io.InputStream;

class Variable {

}

/**
 * @author Tom Everett
 */
class Main {


    public static void main(String[] args) {
        System.out.println("Custom Language");
        try {
            parseFile("/example1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void parseFile(String resourceFileName) throws IOException {
        InputStream inputStream = Main.class.getResourceAsStream(resourceFileName);
        Lexer lexer = new CustomLexer(CharStreams.fromStream(inputStream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        CustomParser parser = new CustomParser(tokenStream);
        CustomParserBaseVisitor<Variable> variableVisitor = new CustomParserBaseVisitor<>();
        parser.compilationUnit().accept(variableVisitor);
//        System.out.println("Parsed: " + parser.getTokenStream().getText());
    }
}