// $ANTLR 3.4 org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g 2013-05-30 14:16:10

	package org.wso2.siddhi.query.compiler;
	import org.wso2.siddhi.query.compiler.exception.SiddhiPraserException;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SiddhiQLGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int ANONYMOUS=4;
    public static final int ATTRIBUTE=5;
    public static final int BOOL_VAL=6;
    public static final int COLLECT=7;
    public static final int COMMENT=8;
    public static final int CONDITION=9;
    public static final int CONDITION_FUNCTION=10;
    public static final int CONSTANT=11;
    public static final int DEFINITION=12;
    public static final int EXTENSION=13;
    public static final int EXTENSION_FUNCTION=14;
    public static final int FILTER=15;
    public static final int FOLLOWED_BY=16;
    public static final int FUNCTION=17;
    public static final int HANDLERS=18;
    public static final int ID=19;
    public static final int ID_QUOTES=20;
    public static final int IN_ATTRIBUTE=21;
    public static final int IP=22;
    public static final int JOIN=23;
    public static final int LINE_COMMENT=24;
    public static final int NUM=25;
    public static final int NUM_SCI=26;
    public static final int OUT_ATTRIBUTE=27;
    public static final int OUT_ATTRIBUTES=28;
    public static final int OUT_STREAM=29;
    public static final int PARAMETERS=30;
    public static final int PATTERN=31;
    public static final int PATTERN_FULL=32;
    public static final int POSITIVE_DOUBLE_VAL=33;
    public static final int POSITIVE_FLOAT_VAL=34;
    public static final int POSITIVE_INT_VAL=35;
    public static final int POSITIVE_LONG_VAL=36;
    public static final int QUERY=37;
    public static final int REGEX=38;
    public static final int RETURN_QUERY=39;
    public static final int SEQUENCE=40;
    public static final int SEQUENCE_FULL=41;
    public static final int SIGNED_VAL=42;
    public static final int STREAM=43;
    public static final int STRING_VAL=44;
    public static final int TIME_EXP=45;
    public static final int TRANSFORM=46;
    public static final int WINDOW=47;
    public static final int WS=48;

      @Override
       public void emitErrorMessage(String errorMessage) {
         throw new SiddhiPraserException(errorMessage);
       }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SiddhiQLGrammarLexer() {} 
    public SiddhiQLGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SiddhiQLGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g"; }

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:19:7: ( '!=' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:19:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:20:7: ( '#' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:20:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:21:7: ( '%' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:21:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:22:7: ( '(' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:23:7: ( ')' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:24:7: ( '*' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:24:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:25:7: ( '+' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:26:7: ( ',' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:27:7: ( '-' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:28:7: ( '.' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:29:7: ( '/' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:29:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:30:7: ( ':' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:30:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:31:7: ( ';' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:31:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:32:7: ( '<' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:32:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:33:7: ( '<=' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:33:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:34:7: ( '=' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:35:7: ( '==' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:35:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:36:7: ( '>' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:36:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:37:7: ( '>=' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:37:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:38:7: ( '?' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:38:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:39:7: ( '@' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:39:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:40:7: ( '[' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:41:7: ( ']' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:42:7: ( 'all-events' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:42:9: 'all-events'
            {
            match("all-events"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:43:7: ( 'and' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:43:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:44:7: ( 'as' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:44:9: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:45:7: ( 'bool' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:45:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:46:7: ( 'by' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:46:9: 'by'
            {
            match("by"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:47:7: ( 'call' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:47:9: 'call'
            {
            match("call"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:48:7: ( 'contains' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:48:9: 'contains'
            {
            match("contains"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:49:7: ( 'current-events' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:49:9: 'current-events'
            {
            match("current-events"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:50:7: ( 'day' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:50:9: 'day'
            {
            match("day"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:51:7: ( 'days' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:51:9: 'days'
            {
            match("days"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:52:7: ( 'define' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:52:9: 'define'
            {
            match("define"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:53:7: ( 'double' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:53:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:54:7: ( 'every' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:54:9: 'every'
            {
            match("every"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:55:7: ( 'expired-events' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:55:9: 'expired-events'
            {
            match("expired-events"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:56:7: ( 'float' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:56:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:57:7: ( 'from' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:57:9: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:58:7: ( 'full' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:58:9: 'full'
            {
            match("full"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:59:7: ( 'group' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:59:9: 'group'
            {
            match("group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:60:7: ( 'having' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:60:9: 'having'
            {
            match("having"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:61:7: ( 'hour' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:61:9: 'hour'
            {
            match("hour"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:62:7: ( 'hours' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:62:9: 'hours'
            {
            match("hours"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:63:7: ( 'inner' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:63:9: 'inner'
            {
            match("inner"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:64:7: ( 'insert' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:64:9: 'insert'
            {
            match("insert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:65:7: ( 'instanceof' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:65:9: 'instanceof'
            {
            match("instanceof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:66:7: ( 'int' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:66:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:67:7: ( 'into' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:67:9: 'into'
            {
            match("into"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:68:7: ( 'join' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:68:9: 'join'
            {
            match("join"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:69:7: ( 'left' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:69:9: 'left'
            {
            match("left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:70:8: ( 'long' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:70:10: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:71:8: ( 'millisecond' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:71:10: 'millisecond'
            {
            match("millisecond"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:72:8: ( 'milliseconds' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:72:10: 'milliseconds'
            {
            match("milliseconds"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:73:8: ( 'min' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:73:10: 'min'
            {
            match("min"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:74:8: ( 'minute' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:74:10: 'minute'
            {
            match("minute"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:75:8: ( 'minutes' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:75:10: 'minutes'
            {
            match("minutes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:8: ( 'month' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:10: 'month'
            {
            match("month"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:77:8: ( 'months' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:77:10: 'months'
            {
            match("months"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:78:8: ( 'not' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:78:10: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:79:8: ( 'on' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:79:10: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:8: ( 'or' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:81:8: ( 'outer' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:81:10: 'outer'
            {
            match("outer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:82:8: ( 'return' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:82:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:83:8: ( 'right' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:83:10: 'right'
            {
            match("right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:8: ( 'sec' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:10: 'sec'
            {
            match("sec"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:85:8: ( 'second' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:85:10: 'second'
            {
            match("second"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:86:8: ( 'seconds' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:86:10: 'seconds'
            {
            match("seconds"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:87:8: ( 'stream' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:87:10: 'stream'
            {
            match("stream"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:88:8: ( 'string' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:88:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:8: ( 'transform' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:10: 'transform'
            {
            match("transform"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:90:8: ( 'unidirectional' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:90:10: 'unidirectional'
            {
            match("unidirectional"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:91:8: ( 'week' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:91:10: 'week'
            {
            match("week"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:92:8: ( 'weeks' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:92:10: 'weeks'
            {
            match("weeks"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:93:8: ( 'window' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:93:10: 'window'
            {
            match("window"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:94:8: ( 'within' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:94:10: 'within'
            {
            match("within"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:95:8: ( 'year' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:95:10: 'year'
            {
            match("year"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:96:8: ( 'years' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:96:10: 'years'
            {
            match("years"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "FOLLOWED_BY"
    public final void mFOLLOWED_BY() throws RecognitionException {
        try {
            int _type = FOLLOWED_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:163:2: ( '->' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:163:4: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOLLOWED_BY"

    // $ANTLR start "IP"
    public final void mIP() throws RecognitionException {
        try {
            int _type = IP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:435:4: ( POSITIVE_INT_VAL '.' POSITIVE_INT_VAL '.' POSITIVE_INT_VAL '.' POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:435:6: POSITIVE_INT_VAL '.' POSITIVE_INT_VAL '.' POSITIVE_INT_VAL '.' POSITIVE_INT_VAL
            {
            mPOSITIVE_INT_VAL(); 


            match('.'); 

            mPOSITIVE_INT_VAL(); 


            match('.'); 

            mPOSITIVE_INT_VAL(); 


            match('.'); 

            mPOSITIVE_INT_VAL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IP"

    // $ANTLR start "POSITIVE_INT_VAL"
    public final void mPOSITIVE_INT_VAL() throws RecognitionException {
        try {
            int _type = POSITIVE_INT_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:437:17: ( NUM ( 'I' | 'i' )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:437:20: NUM ( 'I' | 'i' )?
            {
            mNUM(); 


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:437:23: ( 'I' | 'i' )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case 'I':
                case 'i':
                    {
                    alt1=1;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
                    {
                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSITIVE_INT_VAL"

    // $ANTLR start "POSITIVE_LONG_VAL"
    public final void mPOSITIVE_LONG_VAL() throws RecognitionException {
        try {
            int _type = POSITIVE_LONG_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:439:18: ( NUM ( 'L' | 'l' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:439:21: NUM ( 'L' | 'l' )
            {
            mNUM(); 


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSITIVE_LONG_VAL"

    // $ANTLR start "POSITIVE_FLOAT_VAL"
    public final void mPOSITIVE_FLOAT_VAL() throws RecognitionException {
        try {
            int _type = POSITIVE_FLOAT_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:19: ( NUM ( '.' NUM )? ( NUM_SCI )? ( 'F' | 'f' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:22: NUM ( '.' NUM )? ( NUM_SCI )? ( 'F' | 'f' )
            {
            mNUM(); 


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:26: ( '.' NUM )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case '.':
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:27: '.' NUM
                    {
                    match('.'); 

                    mNUM(); 


                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:37: ( NUM_SCI )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case 'E':
                case 'e':
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:441:37: NUM_SCI
                    {
                    mNUM_SCI(); 


                    }
                    break;

            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSITIVE_FLOAT_VAL"

    // $ANTLR start "POSITIVE_DOUBLE_VAL"
    public final void mPOSITIVE_DOUBLE_VAL() throws RecognitionException {
        try {
            int _type = POSITIVE_DOUBLE_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:21: ( NUM ( '.' NUM ( NUM_SCI )? ( 'D' | 'd' )? | ( NUM_SCI )? ( 'D' | 'd' ) ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:23: NUM ( '.' NUM ( NUM_SCI )? ( 'D' | 'd' )? | ( NUM_SCI )? ( 'D' | 'd' ) )
            {
            mNUM(); 


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:27: ( '.' NUM ( NUM_SCI )? ( 'D' | 'd' )? | ( NUM_SCI )? ( 'D' | 'd' ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt7=1;
                }
                break;
            case 'D':
            case 'E':
            case 'd':
            case 'e':
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:28: '.' NUM ( NUM_SCI )? ( 'D' | 'd' )?
                    {
                    match('.'); 

                    mNUM(); 


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:36: ( NUM_SCI )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:36: NUM_SCI
                            {
                            mNUM_SCI(); 


                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:45: ( 'D' | 'd' )?
                    int alt5=2;
                    switch ( input.LA(1) ) {
                        case 'D':
                        case 'd':
                            {
                            alt5=1;
                            }
                            break;
                    }

                    switch (alt5) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:57: ( NUM_SCI )? ( 'D' | 'd' )
                    {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:57: ( NUM_SCI )?
                    int alt6=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt6=1;
                            }
                            break;
                    }

                    switch (alt6) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:443:57: NUM_SCI
                            {
                            mNUM_SCI(); 


                            }
                            break;

                    }


                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSITIVE_DOUBLE_VAL"

    // $ANTLR start "BOOL_VAL"
    public final void mBOOL_VAL() throws RecognitionException {
        try {
            int _type = BOOL_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:445:9: ( ( 'true' | 'false' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:445:11: ( 'true' | 'false' )
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:445:11: ( 'true' | 'false' )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt8=1;
                }
                break;
            case 'f':
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:445:12: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:445:19: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL_VAL"

    // $ANTLR start "ID_QUOTES"
    public final void mID_QUOTES() throws RecognitionException {
        try {
            int _type = ID_QUOTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:448:11: ( '`' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* '`' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:448:13: '`' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* '`'
            {
            match('`'); 

            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:448:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('`'); 

            setText(getText().substring(1, getText().length()-1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTES"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:450:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:450:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:450:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING_VAL"
    public final void mSTRING_VAL() throws RecognitionException {
        try {
            int _type = STRING_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:455:2: ( '\\'' (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' | '\\\"' ) )* '\\'' | '\"' (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            int alt13=2;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt13=1;
                }
                break;
            case '\"':
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:455:3: '\\'' (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' | '\\\"' ) )* '\\''
                    {
                    match('\''); 

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:455:8: (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\'' | '\\\"' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= ' ' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match('\''); 

                    setText(getText().substring(1, getText().length()-1));

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:456:3: '\"' (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
                    {
                    match('\"'); 

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:456:7: (~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= ' ' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match('\"'); 

                    setText(getText().substring(1, getText().length()-1));

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_VAL"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:459:13: ( ( '0' .. '9' )+ )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:459:15: ( '0' .. '9' )+
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:459:15: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "NUM_SCI"
    public final void mNUM_SCI() throws RecognitionException {
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:461:17: ( ( 'e' | 'E' ) ( '-' )? NUM )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:461:19: ( 'e' | 'E' ) ( '-' )? NUM
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:461:29: ( '-' )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case '-':
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:461:29: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            mNUM(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_SCI"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:465:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:465:7: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:468:5: ( '/*' ( . )* '*/' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:468:7: '/*' ( . )* '*/'
            {
            match("/*"); 



            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:468:12: ( . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:468:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:471:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:471:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:471:12: (~ ( '\\n' | '\\r' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:471:26: ( '\\r' )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case '\r':
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:471:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:8: ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | FOLLOWED_BY | IP | POSITIVE_INT_VAL | POSITIVE_LONG_VAL | POSITIVE_FLOAT_VAL | POSITIVE_DOUBLE_VAL | BOOL_VAL | ID_QUOTES | ID | STRING_VAL | WS | COMMENT | LINE_COMMENT )
        int alt19=91;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:10: T__49
                {
                mT__49(); 


                }
                break;
            case 2 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:16: T__50
                {
                mT__50(); 


                }
                break;
            case 3 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:22: T__51
                {
                mT__51(); 


                }
                break;
            case 4 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:28: T__52
                {
                mT__52(); 


                }
                break;
            case 5 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:34: T__53
                {
                mT__53(); 


                }
                break;
            case 6 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:40: T__54
                {
                mT__54(); 


                }
                break;
            case 7 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:46: T__55
                {
                mT__55(); 


                }
                break;
            case 8 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:52: T__56
                {
                mT__56(); 


                }
                break;
            case 9 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:58: T__57
                {
                mT__57(); 


                }
                break;
            case 10 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:64: T__58
                {
                mT__58(); 


                }
                break;
            case 11 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:70: T__59
                {
                mT__59(); 


                }
                break;
            case 12 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:76: T__60
                {
                mT__60(); 


                }
                break;
            case 13 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:82: T__61
                {
                mT__61(); 


                }
                break;
            case 14 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:88: T__62
                {
                mT__62(); 


                }
                break;
            case 15 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:94: T__63
                {
                mT__63(); 


                }
                break;
            case 16 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:100: T__64
                {
                mT__64(); 


                }
                break;
            case 17 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:106: T__65
                {
                mT__65(); 


                }
                break;
            case 18 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:112: T__66
                {
                mT__66(); 


                }
                break;
            case 19 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:118: T__67
                {
                mT__67(); 


                }
                break;
            case 20 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:124: T__68
                {
                mT__68(); 


                }
                break;
            case 21 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:130: T__69
                {
                mT__69(); 


                }
                break;
            case 22 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:136: T__70
                {
                mT__70(); 


                }
                break;
            case 23 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:142: T__71
                {
                mT__71(); 


                }
                break;
            case 24 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:148: T__72
                {
                mT__72(); 


                }
                break;
            case 25 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:154: T__73
                {
                mT__73(); 


                }
                break;
            case 26 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:160: T__74
                {
                mT__74(); 


                }
                break;
            case 27 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:166: T__75
                {
                mT__75(); 


                }
                break;
            case 28 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:172: T__76
                {
                mT__76(); 


                }
                break;
            case 29 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:178: T__77
                {
                mT__77(); 


                }
                break;
            case 30 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:184: T__78
                {
                mT__78(); 


                }
                break;
            case 31 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:190: T__79
                {
                mT__79(); 


                }
                break;
            case 32 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:196: T__80
                {
                mT__80(); 


                }
                break;
            case 33 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:202: T__81
                {
                mT__81(); 


                }
                break;
            case 34 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:208: T__82
                {
                mT__82(); 


                }
                break;
            case 35 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:214: T__83
                {
                mT__83(); 


                }
                break;
            case 36 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:220: T__84
                {
                mT__84(); 


                }
                break;
            case 37 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:226: T__85
                {
                mT__85(); 


                }
                break;
            case 38 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:232: T__86
                {
                mT__86(); 


                }
                break;
            case 39 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:238: T__87
                {
                mT__87(); 


                }
                break;
            case 40 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:244: T__88
                {
                mT__88(); 


                }
                break;
            case 41 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:250: T__89
                {
                mT__89(); 


                }
                break;
            case 42 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:256: T__90
                {
                mT__90(); 


                }
                break;
            case 43 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:262: T__91
                {
                mT__91(); 


                }
                break;
            case 44 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:268: T__92
                {
                mT__92(); 


                }
                break;
            case 45 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:274: T__93
                {
                mT__93(); 


                }
                break;
            case 46 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:280: T__94
                {
                mT__94(); 


                }
                break;
            case 47 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:286: T__95
                {
                mT__95(); 


                }
                break;
            case 48 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:292: T__96
                {
                mT__96(); 


                }
                break;
            case 49 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:298: T__97
                {
                mT__97(); 


                }
                break;
            case 50 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:304: T__98
                {
                mT__98(); 


                }
                break;
            case 51 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:310: T__99
                {
                mT__99(); 


                }
                break;
            case 52 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:316: T__100
                {
                mT__100(); 


                }
                break;
            case 53 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:323: T__101
                {
                mT__101(); 


                }
                break;
            case 54 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:330: T__102
                {
                mT__102(); 


                }
                break;
            case 55 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:337: T__103
                {
                mT__103(); 


                }
                break;
            case 56 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:344: T__104
                {
                mT__104(); 


                }
                break;
            case 57 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:351: T__105
                {
                mT__105(); 


                }
                break;
            case 58 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:358: T__106
                {
                mT__106(); 


                }
                break;
            case 59 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:365: T__107
                {
                mT__107(); 


                }
                break;
            case 60 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:372: T__108
                {
                mT__108(); 


                }
                break;
            case 61 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:379: T__109
                {
                mT__109(); 


                }
                break;
            case 62 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:386: T__110
                {
                mT__110(); 


                }
                break;
            case 63 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:393: T__111
                {
                mT__111(); 


                }
                break;
            case 64 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:400: T__112
                {
                mT__112(); 


                }
                break;
            case 65 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:407: T__113
                {
                mT__113(); 


                }
                break;
            case 66 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:414: T__114
                {
                mT__114(); 


                }
                break;
            case 67 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:421: T__115
                {
                mT__115(); 


                }
                break;
            case 68 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:428: T__116
                {
                mT__116(); 


                }
                break;
            case 69 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:435: T__117
                {
                mT__117(); 


                }
                break;
            case 70 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:442: T__118
                {
                mT__118(); 


                }
                break;
            case 71 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:449: T__119
                {
                mT__119(); 


                }
                break;
            case 72 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:456: T__120
                {
                mT__120(); 


                }
                break;
            case 73 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:463: T__121
                {
                mT__121(); 


                }
                break;
            case 74 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:470: T__122
                {
                mT__122(); 


                }
                break;
            case 75 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:477: T__123
                {
                mT__123(); 


                }
                break;
            case 76 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:484: T__124
                {
                mT__124(); 


                }
                break;
            case 77 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:491: T__125
                {
                mT__125(); 


                }
                break;
            case 78 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:498: T__126
                {
                mT__126(); 


                }
                break;
            case 79 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:505: FOLLOWED_BY
                {
                mFOLLOWED_BY(); 


                }
                break;
            case 80 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:517: IP
                {
                mIP(); 


                }
                break;
            case 81 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:520: POSITIVE_INT_VAL
                {
                mPOSITIVE_INT_VAL(); 


                }
                break;
            case 82 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:537: POSITIVE_LONG_VAL
                {
                mPOSITIVE_LONG_VAL(); 


                }
                break;
            case 83 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:555: POSITIVE_FLOAT_VAL
                {
                mPOSITIVE_FLOAT_VAL(); 


                }
                break;
            case 84 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:574: POSITIVE_DOUBLE_VAL
                {
                mPOSITIVE_DOUBLE_VAL(); 


                }
                break;
            case 85 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:594: BOOL_VAL
                {
                mBOOL_VAL(); 


                }
                break;
            case 86 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:603: ID_QUOTES
                {
                mID_QUOTES(); 


                }
                break;
            case 87 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:613: ID
                {
                mID(); 


                }
                break;
            case 88 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:616: STRING_VAL
                {
                mSTRING_VAL(); 


                }
                break;
            case 89 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:627: WS
                {
                mWS(); 


                }
                break;
            case 90 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:630: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 91 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:1:638: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\11\uffff\1\57\1\uffff\1\62\2\uffff\1\64\1\66\1\70\4\uffff\24\53"+
        "\1\140\17\uffff\2\53\1\151\1\53\1\153\26\53\1\u0085\1\u0086\12\53"+
        "\1\uffff\1\140\5\uffff\1\53\1\u0098\1\uffff\1\53\1\uffff\3\53\1"+
        "\u009e\15\53\1\u00ae\4\53\1\u00b4\1\53\1\u00b6\2\uffff\3\53\1\u00bb"+
        "\10\53\1\uffff\1\146\4\uffff\1\u00c6\1\u00c7\2\53\1\u00ca\1\uffff"+
        "\5\53\1\u00d0\1\u00d1\3\53\1\u00d6\3\53\1\u00da\1\uffff\1\u00db"+
        "\1\u00dc\1\u00dd\2\53\1\uffff\1\53\1\uffff\4\53\1\uffff\3\53\1\u00e8"+
        "\1\53\1\u00eb\2\53\1\u00ef\3\uffff\2\53\1\uffff\2\53\1\u00f6\1\53"+
        "\1\u00f8\2\uffff\1\u00e8\1\u00f9\1\53\1\u00fb\1\uffff\1\u00fc\2"+
        "\53\4\uffff\2\53\1\u0102\1\u0103\1\53\1\u0105\4\53\1\uffff\1\53"+
        "\1\u010b\1\uffff\2\53\1\u010e\2\uffff\1\146\2\53\1\u0111\1\u0112"+
        "\1\uffff\1\53\2\uffff\1\u0114\2\uffff\1\u0115\2\53\1\u0119\1\u011a"+
        "\2\uffff\1\u011b\1\uffff\1\u011d\1\u011e\1\u011f\2\53\1\uffff\1"+
        "\u0122\1\u0123\1\uffff\2\53\2\uffff\1\53\2\uffff\2\53\1\u0129\3"+
        "\uffff\1\u012a\3\uffff\2\53\2\uffff\1\u012d\2\uffff\2\53\2\uffff"+
        "\2\53\1\uffff\2\53\1\u0134\1\53\1\u0136\1\53\1\uffff\1\53\1\uffff"+
        "\1\u013a\1\53\1\u013c\1\uffff\1\53\1\uffff\1\53\1\u013f\1\uffff";
    static final String DFA19_eofS =
        "\u0140\uffff";
    static final String DFA19_minS =
        "\1\11\10\uffff\1\76\1\uffff\1\52\2\uffff\3\75\4\uffff\1\154\1\157"+
        "\2\141\1\166\1\141\1\162\1\141\1\156\1\157\1\145\1\151\1\157\1\156"+
        "\2\145\1\162\1\156\2\145\1\56\17\uffff\1\154\1\144\1\60\1\157\1"+
        "\60\1\154\1\156\1\162\1\171\1\146\1\165\1\145\1\160\2\157\2\154"+
        "\1\157\1\166\1\165\1\156\1\151\1\146\1\156\1\154\1\156\1\164\2\60"+
        "\2\164\1\147\1\143\1\162\1\141\1\151\1\145\1\156\1\141\1\uffff\1"+
        "\56\1\60\1\uffff\1\55\2\uffff\1\55\1\60\1\uffff\1\154\1\uffff\1"+
        "\154\1\164\1\162\1\60\1\151\1\142\1\162\1\151\1\141\1\155\1\154"+
        "\1\163\1\165\1\151\1\162\2\145\1\60\1\156\1\164\1\147\1\154\1\60"+
        "\1\164\1\60\2\uffff\1\145\1\165\1\150\1\60\1\145\1\156\1\145\1\144"+
        "\1\153\1\144\1\150\1\162\1\uffff\1\56\2\60\2\uffff\2\60\1\141\1"+
        "\145\1\60\1\uffff\1\156\1\154\1\171\1\162\1\164\2\60\1\145\1\160"+
        "\1\156\1\60\2\162\1\141\1\60\1\uffff\3\60\1\151\1\164\1\uffff\1"+
        "\150\1\uffff\2\162\1\164\1\156\1\uffff\1\141\1\156\1\163\1\60\1"+
        "\151\1\60\1\157\1\151\1\60\1\55\2\uffff\1\151\1\156\1\uffff\2\145"+
        "\1\60\1\145\1\60\2\uffff\2\60\1\147\1\60\1\uffff\1\60\1\164\1\156"+
        "\4\uffff\1\163\1\145\2\60\1\156\1\60\1\144\1\155\1\147\1\146\1\uffff"+
        "\1\162\1\60\1\uffff\1\167\1\156\1\60\1\uffff\2\60\1\156\1\164\2"+
        "\60\1\uffff\1\144\2\uffff\1\60\2\uffff\1\60\1\143\1\145\2\60\2\uffff"+
        "\1\60\1\uffff\3\60\1\157\1\145\1\uffff\2\60\1\uffff\1\163\1\55\2"+
        "\uffff\1\55\2\uffff\1\145\1\143\1\60\3\uffff\1\60\3\uffff\1\162"+
        "\1\143\2\uffff\1\60\2\uffff\2\157\2\uffff\1\155\1\164\1\uffff\1"+
        "\146\1\156\1\60\1\151\1\60\1\144\1\uffff\1\157\1\uffff\1\60\1\156"+
        "\1\60\1\uffff\1\141\1\uffff\1\154\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\172\10\uffff\1\76\1\uffff\1\57\2\uffff\3\75\4\uffff\1\163\1\171"+
        "\1\165\1\157\1\170\1\165\1\162\1\157\1\156\4\157\1\165\1\151\1\164"+
        "\1\162\1\156\1\151\1\145\1\154\17\uffff\1\154\1\144\1\172\1\157"+
        "\1\172\1\154\1\156\1\162\1\171\1\146\1\165\1\145\1\160\2\157\2\154"+
        "\1\157\1\166\1\165\1\164\1\151\1\146\3\156\1\164\2\172\2\164\1\147"+
        "\1\143\1\162\1\165\1\151\1\145\1\164\1\141\1\uffff\1\56\1\71\1\uffff"+
        "\1\71\2\uffff\1\55\1\172\1\uffff\1\154\1\uffff\1\154\1\164\1\162"+
        "\1\172\1\151\1\142\1\162\1\151\1\141\1\155\1\154\1\163\1\165\1\151"+
        "\1\162\1\145\1\164\1\172\1\156\1\164\1\147\1\154\1\172\1\164\1\172"+
        "\2\uffff\1\145\1\165\1\150\1\172\1\151\1\156\1\145\1\144\1\153\1"+
        "\144\1\150\1\162\1\uffff\1\151\1\71\1\146\2\uffff\2\172\1\141\1"+
        "\145\1\172\1\uffff\1\156\1\154\1\171\1\162\1\164\2\172\1\145\1\160"+
        "\1\156\1\172\2\162\1\141\1\172\1\uffff\3\172\1\151\1\164\1\uffff"+
        "\1\150\1\uffff\2\162\1\164\1\156\1\uffff\1\141\1\156\1\163\1\172"+
        "\1\151\1\172\1\157\1\151\1\172\1\71\2\uffff\1\151\1\156\1\uffff"+
        "\2\145\1\172\1\145\1\172\2\uffff\2\172\1\147\1\172\1\uffff\1\172"+
        "\1\164\1\156\4\uffff\1\163\1\145\2\172\1\156\1\172\1\144\1\155\1"+
        "\147\1\146\1\uffff\1\162\1\172\1\uffff\1\167\1\156\1\172\1\uffff"+
        "\1\71\1\146\1\156\1\164\2\172\1\uffff\1\144\2\uffff\1\172\2\uffff"+
        "\1\172\1\143\1\145\2\172\2\uffff\1\172\1\uffff\3\172\1\157\1\145"+
        "\1\uffff\2\172\1\uffff\1\163\1\55\2\uffff\1\55\2\uffff\1\145\1\143"+
        "\1\172\3\uffff\1\172\3\uffff\1\162\1\143\2\uffff\1\172\2\uffff\2"+
        "\157\2\uffff\1\155\1\164\1\uffff\1\146\1\156\1\172\1\151\1\172\1"+
        "\144\1\uffff\1\157\1\uffff\1\172\1\156\1\172\1\uffff\1\141\1\uffff"+
        "\1\154\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\uffff\1"+
        "\14\1\15\3\uffff\1\24\1\25\1\26\1\27\25\uffff\1\126\1\127\1\130"+
        "\1\131\1\117\1\11\1\132\1\133\1\13\1\17\1\16\1\21\1\20\1\23\1\22"+
        "\47\uffff\1\121\2\uffff\1\122\1\uffff\1\123\1\124\2\uffff\1\32\1"+
        "\uffff\1\34\31\uffff\1\75\1\76\14\uffff\1\120\3\uffff\1\30\1\31"+
        "\5\uffff\1\40\17\uffff\1\60\5\uffff\1\67\1\uffff\1\74\4\uffff\1"+
        "\102\12\uffff\1\33\1\35\2\uffff\1\41\5\uffff\1\47\1\50\4\uffff\1"+
        "\53\3\uffff\1\61\1\62\1\63\1\64\12\uffff\1\125\2\uffff\1\111\3\uffff"+
        "\1\115\6\uffff\1\44\1\uffff\1\46\1\51\1\uffff\1\54\1\55\5\uffff"+
        "\1\72\1\77\1\uffff\1\101\5\uffff\1\112\2\uffff\1\116\2\uffff\1\42"+
        "\1\43\1\uffff\1\52\1\56\3\uffff\1\70\1\73\1\100\1\uffff\1\103\1"+
        "\105\1\106\2\uffff\1\113\1\114\1\uffff\1\37\1\45\2\uffff\1\71\1"+
        "\104\2\uffff\1\36\6\uffff\1\107\1\uffff\1\57\3\uffff\1\65\1\uffff"+
        "\1\66\2\uffff\1\110";
    static final String DFA19_specialS =
        "\u0140\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\55\1\uffff\2\55\22\uffff\1\55\1\1\1\54\1\2\1\uffff\1\3\1"+
            "\uffff\1\54\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\51\1\14\1"+
            "\15\1\16\1\17\1\20\1\21\1\22\32\53\1\23\1\uffff\1\24\1\uffff"+
            "\1\53\1\52\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\53\1\37\1\40\1\41\1\42\2\53\1\43\1\44\1\45\1\46\1\53\1\47"+
            "\1\53\1\50\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\1\63",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\71\1\uffff\1\72\4\uffff\1\73",
            "\1\74\11\uffff\1\75",
            "\1\76\15\uffff\1\77\5\uffff\1\100",
            "\1\101\3\uffff\1\102\11\uffff\1\103",
            "\1\104\1\uffff\1\105",
            "\1\111\12\uffff\1\106\5\uffff\1\107\2\uffff\1\110",
            "\1\112",
            "\1\113\15\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117\11\uffff\1\120",
            "\1\121\5\uffff\1\122",
            "\1\123",
            "\1\124\3\uffff\1\125\2\uffff\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131\16\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135\3\uffff\1\136",
            "\1\137",
            "\1\142\1\uffff\12\51\12\uffff\1\146\1\144\1\145\2\uffff\1\141"+
            "\2\uffff\1\143\27\uffff\1\146\1\144\1\145\2\uffff\1\141\2\uffff"+
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\152",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173\4\uffff\1\174\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\23\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090\5\uffff\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\u0094",
            "",
            "\1\u0095\2\uffff\12\u0096",
            "",
            "",
            "\1\u0097",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u009d\7\53",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\16\uffff\1\u00ac",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u00ad\13"+
            "\53",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00b3\5\53",
            "\1\u00b5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u00ba\13"+
            "\53",
            "\1\u00bc\3\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u0093\1\uffff\12\u0094\13\uffff\1\u00c5\1\145\2\uffff\1"+
            "\u0093\33\uffff\1\u00c5\1\145\2\uffff\1\u0093",
            "\12\u0096",
            "\12\u0096\12\uffff\1\146\1\uffff\1\145\35\uffff\1\146\1\uffff"+
            "\1\145",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c8",
            "\1\u00c9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00d5\7\53",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00ea\7\53",
            "\1\u00ec",
            "\1\u00ed",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00ee\7\53",
            "\1\u00f0\2\uffff\12\u00f1",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fa",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0101\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0104",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u010c",
            "\1\u010d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\u00f1",
            "\12\u00f1\14\uffff\1\145\37\uffff\1\145",
            "\1\u010f",
            "\1\u0110",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0113",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0116",
            "\1\u0117",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0118\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u011c\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0120",
            "\1\u0121",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0124",
            "\1\u0125",
            "",
            "",
            "\1\u0126",
            "",
            "",
            "\1\u0127",
            "\1\u0128",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u012b",
            "\1\u012c",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0135",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0137",
            "",
            "\1\u0138",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0139\7\53",
            "\1\u013b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u013d",
            "",
            "\1\u013e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | FOLLOWED_BY | IP | POSITIVE_INT_VAL | POSITIVE_LONG_VAL | POSITIVE_FLOAT_VAL | POSITIVE_DOUBLE_VAL | BOOL_VAL | ID_QUOTES | ID | STRING_VAL | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}