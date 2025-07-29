package org.example.antlr4;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.example.antlr4.JavaParser;

import java.util.List;

public abstract class JavaParserBase extends Parser {

    public JavaParserBase(TokenStream input){
	super(input);
    }

    public boolean DoLastRecordComponent() {
	ParserRuleContext ctx = this.getContext();
	if (!(ctx instanceof JavaParser.RecordComponentListContext)) {
	    return true; // or throw if this is an unexpected state
	}

	JavaParser.RecordComponentListContext tctx = (JavaParser.RecordComponentListContext) ctx;
	List<JavaParser.RecordComponentContext> rcs = tctx.recordComponent();
	if (rcs.isEmpty()) return true;

	int count = rcs.size();
	for (int c = 0; c < count; ++c) {
	    JavaParser.RecordComponentContext rc = rcs.get(c);
	    if (rc.ELLIPSIS() != null && c + 1 < count)
		return false;
	}
	return true;
    }
}
