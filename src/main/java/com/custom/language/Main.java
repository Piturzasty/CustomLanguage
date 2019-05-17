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
            /*
             * get the input file as an InputStream
             */
            InputStream inputStream = Main.class.getResourceAsStream("/example1.txt");
            /*
             * make Lexer
             */
            Lexer lexer = new CustomLexer(CharStreams.fromStream(inputStream));
            /*
             * get a TokenStream on the Lexer
             */
            TokenStream tokenStream = new CommonTokenStream(lexer);
            /*
             * make a Parser on the token stream
             */
            CustomParser parser = new CustomParser(tokenStream);

            CustomParserBaseVisitor<Variable> variableVisitor = new CustomParserBaseVisitor<>();
            parser.compilationUnit().accept(variableVisitor);

            System.out.println("Parsed: " + parser.getTokenStream().getText());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}