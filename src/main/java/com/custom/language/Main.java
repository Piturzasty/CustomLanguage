package com.custom.language;

import com.custom.language.antlr4.CustomListener;
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

            /*
             * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
             */

//            ParseInfo parseInfo = parser.getParseInfo();
//            ParserRuleContext context = parser.getContext();
//            String text = context.getText();
//            final Grammar pg = Grammar.load(parserGrammarFileName, lg);
//            ANTLRFileStream input = new ANTLRFileStream(fileNameToParse);
//            LexerInterpreter lexEngine = pg.createLexerInterpreter(input);
//            CommonTokenStream tokens = new CommonTokenStream(lexEngine);
//            ParserInterpreter parser = pg.createParserInterpreter(tokens);
//            ParseTree t = parser.parse(pg.getRule(startRule).index);
//            ParserRuleContext context2 = parser.getContext();
            System.out.println("Parsed: " + parser.getTokenStream().getText());

            //System.out.println(parser.compilationUnit().fileContent().size());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}