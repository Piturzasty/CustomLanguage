# CustomLanguage

## Language Structure


```
{
    [return type] name([params]; [param2]; [param3])
    {

    }

    main()
    {
        instructions...

        [function identifier](a, b, c)

        // comment

        identifier : [return type] <- initial value
        foo : int <- 6

        567 : int <- 123
        123 : int <- 567

        ! : bool <- false
        
        567 <- int(~!)

        567 -> 123
        123 <- 567
        567 -> 567
        123 <- 123

        // arithmetic operations
        bar <- foo + 7

        foo + 7 -> bar

        if ([condition]) <= != >= > < ~
        {}
        elif
        {}
        else
        {}

        while [condition]
        {}

        foreach ([variable] in [collection]) {}
        foreach ([start] to [stop] : [interval]) {}
    }
}
```

## Usage
### 1. Generating Java classes with Visitor type

```
antlr4.jar CustomLexer.g4 CustomParser.g4 -o generated -package com.custom.language.antlr4.generated -visitor
```

