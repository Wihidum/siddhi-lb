// $ANTLR 3.4 org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g 2013-05-16 09:57:59

	package org.wso2.siddhi.query.compiler;
	import java.util.LinkedList;
	import org.wso2.siddhi.query.compiler.exception.SiddhiPraserException;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SiddhiQLGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABC", "ANONYMOUS", "ATTRIBUTE", "BOOL_VAL", "COLLECT", "COMMENT", "CONDITION", "CONDITION_FUNCTION", "CONSTANT", "DEFINITION", "EXTENSION", "EXTENSION_FUNCTION", "FILTER", "FOLLOWED_BY", "FUNCTION", "HANDLERS", "ID", "ID_QUOTES", "IN_ATTRIBUTE", "IP", "JOIN", "LINE_COMMENT", "NUM", "NUM_SCI", "OUT_ATTRIBUTE", "OUT_ATTRIBUTES", "OUT_STREAM", "PARAMETERS", "PATTERN", "PATTERN_FULL", "POSITIVE_DOUBLE_VAL", "POSITIVE_FLOAT_VAL", "POSITIVE_INT_VAL", "POSITIVE_LONG_VAL", "QUERY", "REGEX", "RETURN_QUERY", "SEQUENCE", "SEQUENCE_FULL", "SIGNED_VAL", "STREAM", "STRING_VAL", "TIME_EXP", "TRANSFORM", "WINDOW", "WS", "'!='", "'#'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'?'", "'@'", "'['", "']'", "'all-events'", "'and'", "'as'", "'bool'", "'by'", "'call'", "'contains'", "'current-events'", "'day'", "'days'", "'define'", "'double'", "'every'", "'expired-events'", "'float'", "'from'", "'full'", "'group'", "'having'", "'hour'", "'hours'", "'inner'", "'insert'", "'instanceof'", "'int'", "'into'", "'join'", "'left'", "'long'", "'millisecond'", "'milliseconds'", "'min'", "'minute'", "'minutes'", "'month'", "'months'", "'not'", "'on'", "'or'", "'outer'", "'return'", "'right'", "'sec'", "'second'", "'seconds'", "'stream'", "'string'", "'transform'", "'unidirectional'", "'week'", "'weeks'", "'window'", "'within'", "'year'", "'years'"
    };

    public static final int EOF=-1;
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
    public static final int T__127=127;
    public static final int ABC=4;
    public static final int ANONYMOUS=5;
    public static final int ATTRIBUTE=6;
    public static final int BOOL_VAL=7;
    public static final int COLLECT=8;
    public static final int COMMENT=9;
    public static final int CONDITION=10;
    public static final int CONDITION_FUNCTION=11;
    public static final int CONSTANT=12;
    public static final int DEFINITION=13;
    public static final int EXTENSION=14;
    public static final int EXTENSION_FUNCTION=15;
    public static final int FILTER=16;
    public static final int FOLLOWED_BY=17;
    public static final int FUNCTION=18;
    public static final int HANDLERS=19;
    public static final int ID=20;
    public static final int ID_QUOTES=21;
    public static final int IN_ATTRIBUTE=22;
    public static final int IP=23;
    public static final int JOIN=24;
    public static final int LINE_COMMENT=25;
    public static final int NUM=26;
    public static final int NUM_SCI=27;
    public static final int OUT_ATTRIBUTE=28;
    public static final int OUT_ATTRIBUTES=29;
    public static final int OUT_STREAM=30;
    public static final int PARAMETERS=31;
    public static final int PATTERN=32;
    public static final int PATTERN_FULL=33;
    public static final int POSITIVE_DOUBLE_VAL=34;
    public static final int POSITIVE_FLOAT_VAL=35;
    public static final int POSITIVE_INT_VAL=36;
    public static final int POSITIVE_LONG_VAL=37;
    public static final int QUERY=38;
    public static final int REGEX=39;
    public static final int RETURN_QUERY=40;
    public static final int SEQUENCE=41;
    public static final int SEQUENCE_FULL=42;
    public static final int SIGNED_VAL=43;
    public static final int STREAM=44;
    public static final int STRING_VAL=45;
    public static final int TIME_EXP=46;
    public static final int TRANSFORM=47;
    public static final int WINDOW=48;
    public static final int WS=49;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SiddhiQLGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SiddhiQLGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SiddhiQLGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g"; }


      @Override
      public void emitErrorMessage(String errorMessage) {
        throw new SiddhiPraserException(errorMessage);
      }


    public static class executionPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "executionPlan"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:75:1: executionPlan : ( definitionStream | query ) ( ';' ( definitionStream | query ) )* ( ';' )? -> ( ^( DEFINITION definitionStream ) )* ( query )* ;
    public final SiddhiQLGrammarParser.executionPlan_return executionPlan() throws RecognitionException {
        SiddhiQLGrammarParser.executionPlan_return retval = new SiddhiQLGrammarParser.executionPlan_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal3=null;
        Token char_literal6=null;
        SiddhiQLGrammarParser.definitionStream_return definitionStream1 =null;

        SiddhiQLGrammarParser.query_return query2 =null;

        SiddhiQLGrammarParser.definitionStream_return definitionStream4 =null;

        SiddhiQLGrammarParser.query_return query5 =null;


        CommonTree char_literal3_tree=null;
        CommonTree char_literal6_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_definitionStream=new RewriteRuleSubtreeStream(adaptor,"rule definitionStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:2: ( ( definitionStream | query ) ( ';' ( definitionStream | query ) )* ( ';' )? -> ( ^( DEFINITION definitionStream ) )* ( query )* )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:3: ( definitionStream | query ) ( ';' ( definitionStream | query ) )* ( ';' )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:3: ( definitionStream | query )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt1=1;
                }
                break;
            case 88:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:4: definitionStream
                    {
                    pushFollow(FOLLOW_definitionStream_in_executionPlan257);
                    definitionStream1=definitionStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definitionStream.add(definitionStream1.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:21: query
                    {
                    pushFollow(FOLLOW_query_in_executionPlan259);
                    query2=query();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_query.add(query2.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:28: ( ';' ( definitionStream | query ) )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    switch ( input.LA(2) ) {
                    case 83:
                    case 88:
                        {
                        alt3=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:29: ';' ( definitionStream | query )
            	    {
            	    char_literal3=(Token)match(input,62,FOLLOW_62_in_executionPlan263); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_62.add(char_literal3);


            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:33: ( definitionStream | query )
            	    int alt2=2;
            	    switch ( input.LA(1) ) {
            	    case 83:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:34: definitionStream
            	            {
            	            pushFollow(FOLLOW_definitionStream_in_executionPlan266);
            	            definitionStream4=definitionStream();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_definitionStream.add(definitionStream4.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:51: query
            	            {
            	            pushFollow(FOLLOW_query_in_executionPlan268);
            	            query5=query();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_query.add(query5.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:60: ( ';' )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case 62:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:60: ';'
                    {
                    char_literal6=(Token)match(input,62,FOLLOW_62_in_executionPlan273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal6);


                    }
                    break;

            }


            // AST REWRITE
            // elements: definitionStream, query
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:66: -> ( ^( DEFINITION definitionStream ) )* ( query )*
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:70: ( ^( DEFINITION definitionStream ) )*
                while ( stream_definitionStream.hasNext() ) {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:71: ^( DEFINITION definitionStream )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(DEFINITION, "DEFINITION")
                    , root_1);

                    adaptor.addChild(root_1, stream_definitionStream.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_definitionStream.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:76:105: ( query )*
                while ( stream_query.hasNext() ) {
                    adaptor.addChild(root_0, stream_query.nextTree());

                }
                stream_query.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "executionPlan"


    public static class definitionStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitionStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:79:1: definitionStream : 'define' 'stream' streamId ( '@' IP )? '(' attributeName type ( ',' attributeName type )* ')' -> ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) ;
    public final SiddhiQLGrammarParser.definitionStream_return definitionStream() throws RecognitionException {
        SiddhiQLGrammarParser.definitionStream_return retval = new SiddhiQLGrammarParser.definitionStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal7=null;
        Token string_literal8=null;
        Token char_literal10=null;
        Token IP11=null;
        Token char_literal12=null;
        Token char_literal15=null;
        Token char_literal18=null;
        SiddhiQLGrammarParser.streamId_return streamId9 =null;

        SiddhiQLGrammarParser.attributeName_return attributeName13 =null;

        SiddhiQLGrammarParser.type_return type14 =null;

        SiddhiQLGrammarParser.attributeName_return attributeName16 =null;

        SiddhiQLGrammarParser.type_return type17 =null;


        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree IP11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_IP=new RewriteRuleTokenStream(adaptor,"token IP");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:2: ( 'define' 'stream' streamId ( '@' IP )? '(' attributeName type ( ',' attributeName type )* ')' -> ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:3: 'define' 'stream' streamId ( '@' IP )? '(' attributeName type ( ',' attributeName type )* ')'
            {
            string_literal7=(Token)match(input,83,FOLLOW_83_in_definitionStream309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal7);


            string_literal8=(Token)match(input,118,FOLLOW_118_in_definitionStream311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(string_literal8);


            pushFollow(FOLLOW_streamId_in_definitionStream313);
            streamId9=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId9.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:30: ( '@' IP )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case 70:
                    {
                    alt5=1;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:31: '@' IP
                    {
                    char_literal10=(Token)match(input,70,FOLLOW_70_in_definitionStream316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal10);


                    IP11=(Token)match(input,IP,FOLLOW_IP_in_definitionStream318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IP.add(IP11);


                    }
                    break;

            }


            char_literal12=(Token)match(input,53,FOLLOW_53_in_definitionStream323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal12);


            pushFollow(FOLLOW_attributeName_in_definitionStream325);
            attributeName13=attributeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attributeName.add(attributeName13.getTree());

            pushFollow(FOLLOW_type_in_definitionStream327);
            type14=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type14.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:64: ( ',' attributeName type )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:65: ',' attributeName type
            	    {
            	    char_literal15=(Token)match(input,57,FOLLOW_57_in_definitionStream330); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal15);


            	    pushFollow(FOLLOW_attributeName_in_definitionStream332);
            	    attributeName16=attributeName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attributeName.add(attributeName16.getTree());

            	    pushFollow(FOLLOW_type_in_definitionStream334);
            	    type17=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type17.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal18=(Token)match(input,54,FOLLOW_54_in_definitionStream339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal18);


            // AST REWRITE
            // elements: IP, attributeName, streamId, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:96: -> ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:100: ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_streamId.nextNode(), root_1);

                if ( !(stream_attributeName.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attributeName.hasNext()||stream_type.hasNext() ) {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:113: ^( IN_ATTRIBUTE attributeName type )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(IN_ATTRIBUTE, "IN_ATTRIBUTE")
                    , root_2);

                    adaptor.addChild(root_2, stream_attributeName.nextTree());

                    adaptor.addChild(root_2, stream_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_attributeName.reset();
                stream_type.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:80:151: ( IP )?
                if ( stream_IP.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IP.nextNode()
                    );

                }
                stream_IP.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitionStream"


    public static class query_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:83:1: query : ( inputStream outputStream outputProjection -> ^( QUERY outputStream inputStream outputProjection ) | inputStream 'return' outputProjection -> ^( QUERY inputStream outputProjection ) );
    public final SiddhiQLGrammarParser.query_return query() throws RecognitionException {
        SiddhiQLGrammarParser.query_return retval = new SiddhiQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal23=null;
        SiddhiQLGrammarParser.inputStream_return inputStream19 =null;

        SiddhiQLGrammarParser.outputStream_return outputStream20 =null;

        SiddhiQLGrammarParser.outputProjection_return outputProjection21 =null;

        SiddhiQLGrammarParser.inputStream_return inputStream22 =null;

        SiddhiQLGrammarParser.outputProjection_return outputProjection24 =null;


        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_outputProjection=new RewriteRuleSubtreeStream(adaptor,"rule outputProjection");
        RewriteRuleSubtreeStream stream_inputStream=new RewriteRuleSubtreeStream(adaptor,"rule inputStream");
        RewriteRuleSubtreeStream stream_outputStream=new RewriteRuleSubtreeStream(adaptor,"rule outputStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:2: ( inputStream outputStream outputProjection -> ^( QUERY outputStream inputStream outputProjection ) | inputStream 'return' outputProjection -> ^( QUERY inputStream outputProjection ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 88:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred7_SiddhiQLGrammar()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:3: inputStream outputStream outputProjection
                    {
                    pushFollow(FOLLOW_inputStream_in_query373);
                    inputStream19=inputStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inputStream.add(inputStream19.getTree());

                    pushFollow(FOLLOW_outputStream_in_query375);
                    outputStream20=outputStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputStream.add(outputStream20.getTree());

                    pushFollow(FOLLOW_outputProjection_in_query377);
                    outputProjection21=outputProjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputProjection.add(outputProjection21.getTree());

                    // AST REWRITE
                    // elements: outputProjection, outputStream, inputStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:46: -> ^( QUERY outputStream inputStream outputProjection )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:50: ^( QUERY outputStream inputStream outputProjection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        adaptor.addChild(root_1, stream_outputStream.nextTree());

                        adaptor.addChild(root_1, stream_inputStream.nextTree());

                        adaptor.addChild(root_1, stream_outputProjection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:85:3: inputStream 'return' outputProjection
                    {
                    pushFollow(FOLLOW_inputStream_in_query396);
                    inputStream22=inputStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inputStream.add(inputStream22.getTree());

                    string_literal23=(Token)match(input,113,FOLLOW_113_in_query398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal23);


                    pushFollow(FOLLOW_outputProjection_in_query400);
                    outputProjection24=outputProjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputProjection.add(outputProjection24.getTree());

                    // AST REWRITE
                    // elements: outputProjection, inputStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:42: -> ^( QUERY inputStream outputProjection )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:85:46: ^( QUERY inputStream outputProjection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        adaptor.addChild(root_1, stream_inputStream.nextTree());

                        adaptor.addChild(root_1, stream_outputProjection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class outputStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:88:1: outputStream : 'insert' ( outputType )? 'into' streamId ( '@' IP )? -> ^( OUT_STREAM streamId ( outputType )? ( IP )? ) ;
    public final SiddhiQLGrammarParser.outputStream_return outputStream() throws RecognitionException {
        SiddhiQLGrammarParser.outputStream_return retval = new SiddhiQLGrammarParser.outputStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal25=null;
        Token string_literal27=null;
        Token char_literal29=null;
        Token IP30=null;
        SiddhiQLGrammarParser.outputType_return outputType26 =null;

        SiddhiQLGrammarParser.streamId_return streamId28 =null;


        CommonTree string_literal25_tree=null;
        CommonTree string_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree IP30_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_IP=new RewriteRuleTokenStream(adaptor,"token IP");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_outputType=new RewriteRuleSubtreeStream(adaptor,"rule outputType");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:2: ( 'insert' ( outputType )? 'into' streamId ( '@' IP )? -> ^( OUT_STREAM streamId ( outputType )? ( IP )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:3: 'insert' ( outputType )? 'into' streamId ( '@' IP )?
            {
            string_literal25=(Token)match(input,95,FOLLOW_95_in_outputStream423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(string_literal25);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:12: ( outputType )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case 73:
                case 80:
                case 86:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:12: outputType
                    {
                    pushFollow(FOLLOW_outputType_in_outputStream425);
                    outputType26=outputType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputType.add(outputType26.getTree());

                    }
                    break;

            }


            string_literal27=(Token)match(input,98,FOLLOW_98_in_outputStream428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal27);


            pushFollow(FOLLOW_streamId_in_outputStream430);
            streamId28=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId28.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:40: ( '@' IP )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case 70:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:41: '@' IP
                    {
                    char_literal29=(Token)match(input,70,FOLLOW_70_in_outputStream433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal29);


                    IP30=(Token)match(input,IP,FOLLOW_IP_in_outputStream435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IP.add(IP30);


                    }
                    break;

            }


            // AST REWRITE
            // elements: streamId, IP, outputType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:53: -> ^( OUT_STREAM streamId ( outputType )? ( IP )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:58: ^( OUT_STREAM streamId ( outputType )? ( IP )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OUT_STREAM, "OUT_STREAM")
                , root_1);

                adaptor.addChild(root_1, stream_streamId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:80: ( outputType )?
                if ( stream_outputType.hasNext() ) {
                    adaptor.addChild(root_1, stream_outputType.nextTree());

                }
                stream_outputType.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:92: ( IP )?
                if ( stream_IP.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IP.nextNode()
                    );

                }
                stream_IP.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outputStream"


    public static class outputType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputType"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:92:1: outputType : ( 'expired-events' | 'current-events' | 'all-events' );
    public final SiddhiQLGrammarParser.outputType_return outputType() throws RecognitionException {
        SiddhiQLGrammarParser.outputType_return retval = new SiddhiQLGrammarParser.outputType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set31=null;

        CommonTree set31_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:93:2: ( 'expired-events' | 'current-events' | 'all-events' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( input.LA(1)==73||input.LA(1)==80||input.LA(1)==86 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set31)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outputType"


    public static class inputStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:96:1: inputStream : 'from' ( sequenceFullStream -> ^( SEQUENCE_FULL sequenceFullStream ) | patternFullStream -> ^( PATTERN_FULL patternFullStream ) | joinStream -> ^( JOIN joinStream ) | windowStream -> windowStream | basicStream -> basicStream ) ;
    public final SiddhiQLGrammarParser.inputStream_return inputStream() throws RecognitionException {
        SiddhiQLGrammarParser.inputStream_return retval = new SiddhiQLGrammarParser.inputStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        SiddhiQLGrammarParser.sequenceFullStream_return sequenceFullStream33 =null;

        SiddhiQLGrammarParser.patternFullStream_return patternFullStream34 =null;

        SiddhiQLGrammarParser.joinStream_return joinStream35 =null;

        SiddhiQLGrammarParser.windowStream_return windowStream36 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream37 =null;


        CommonTree string_literal32_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_sequenceFullStream=new RewriteRuleSubtreeStream(adaptor,"rule sequenceFullStream");
        RewriteRuleSubtreeStream stream_windowStream=new RewriteRuleSubtreeStream(adaptor,"rule windowStream");
        RewriteRuleSubtreeStream stream_patternFullStream=new RewriteRuleSubtreeStream(adaptor,"rule patternFullStream");
        RewriteRuleSubtreeStream stream_basicStream=new RewriteRuleSubtreeStream(adaptor,"rule basicStream");
        RewriteRuleSubtreeStream stream_joinStream=new RewriteRuleSubtreeStream(adaptor,"rule joinStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:2: ( 'from' ( sequenceFullStream -> ^( SEQUENCE_FULL sequenceFullStream ) | patternFullStream -> ^( PATTERN_FULL patternFullStream ) | joinStream -> ^( JOIN joinStream ) | windowStream -> windowStream | basicStream -> basicStream ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:3: 'from' ( sequenceFullStream -> ^( SEQUENCE_FULL sequenceFullStream ) | patternFullStream -> ^( PATTERN_FULL patternFullStream ) | joinStream -> ^( JOIN joinStream ) | windowStream -> windowStream | basicStream -> basicStream )
            {
            string_literal32=(Token)match(input,88,FOLLOW_88_in_inputStream485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal32);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:10: ( sequenceFullStream -> ^( SEQUENCE_FULL sequenceFullStream ) | patternFullStream -> ^( PATTERN_FULL patternFullStream ) | joinStream -> ^( JOIN joinStream ) | windowStream -> windowStream | basicStream -> basicStream )
            int alt10=5;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred12_SiddhiQLGrammar()) ) {
                    alt10=1;
                }
                else if ( (synpred13_SiddhiQLGrammar()) ) {
                    alt10=2;
                }
                else if ( (synpred14_SiddhiQLGrammar()) ) {
                    alt10=3;
                }
                else if ( (synpred15_SiddhiQLGrammar()) ) {
                    alt10=4;
                }
                else if ( (true) ) {
                    alt10=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred13_SiddhiQLGrammar()) ) {
                    alt10=2;
                }
                else if ( (synpred14_SiddhiQLGrammar()) ) {
                    alt10=3;
                }
                else if ( (synpred15_SiddhiQLGrammar()) ) {
                    alt10=4;
                }
                else if ( (true) ) {
                    alt10=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case 85:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: sequenceFullStream
                    {
                    pushFollow(FOLLOW_sequenceFullStream_in_inputStream489);
                    sequenceFullStream33=sequenceFullStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequenceFullStream.add(sequenceFullStream33.getTree());

                    // AST REWRITE
                    // elements: sequenceFullStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:31: -> ^( SEQUENCE_FULL sequenceFullStream )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:34: ^( SEQUENCE_FULL sequenceFullStream )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SEQUENCE_FULL, "SEQUENCE_FULL")
                        , root_1);

                        adaptor.addChild(root_1, stream_sequenceFullStream.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:5: patternFullStream
                    {
                    pushFollow(FOLLOW_patternFullStream_in_inputStream503);
                    patternFullStream34=patternFullStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternFullStream.add(patternFullStream34.getTree());

                    // AST REWRITE
                    // elements: patternFullStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:23: -> ^( PATTERN_FULL patternFullStream )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:27: ^( PATTERN_FULL patternFullStream )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PATTERN_FULL, "PATTERN_FULL")
                        , root_1);

                        adaptor.addChild(root_1, stream_patternFullStream.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:5: joinStream
                    {
                    pushFollow(FOLLOW_joinStream_in_inputStream520);
                    joinStream35=joinStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_joinStream.add(joinStream35.getTree());

                    // AST REWRITE
                    // elements: joinStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:16: -> ^( JOIN joinStream )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:19: ^( JOIN joinStream )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(JOIN, "JOIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_joinStream.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:100:5: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_inputStream535);
                    windowStream36=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowStream.add(windowStream36.getTree());

                    // AST REWRITE
                    // elements: windowStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:18: -> windowStream
                    {
                        adaptor.addChild(root_0, stream_windowStream.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:101:5: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_inputStream545);
                    basicStream37=basicStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_basicStream.add(basicStream37.getTree());

                    // AST REWRITE
                    // elements: basicStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 101:18: -> basicStream
                    {
                        adaptor.addChild(root_0, stream_basicStream.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inputStream"


    public static class patternFullStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "patternFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:106:1: patternFullStream : ( '(' patternStream ')' ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) | patternStream ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) );
    public final SiddhiQLGrammarParser.patternFullStream_return patternFullStream() throws RecognitionException {
        SiddhiQLGrammarParser.patternFullStream_return retval = new SiddhiQLGrammarParser.patternFullStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        Token char_literal40=null;
        Token string_literal41=null;
        Token string_literal44=null;
        SiddhiQLGrammarParser.patternStream_return patternStream39 =null;

        SiddhiQLGrammarParser.time_return time42 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream43 =null;

        SiddhiQLGrammarParser.time_return time45 =null;


        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_patternStream=new RewriteRuleSubtreeStream(adaptor,"rule patternStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:2: ( '(' patternStream ')' ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) | patternStream ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt13=1;
                }
                break;
            case ID:
            case ID_QUOTES:
            case 85:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:3: '(' patternStream ')' ( 'within' time )?
                    {
                    char_literal38=(Token)match(input,53,FOLLOW_53_in_patternFullStream570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal38);


                    pushFollow(FOLLOW_patternStream_in_patternFullStream572);
                    patternStream39=patternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternStream.add(patternStream39.getTree());

                    char_literal40=(Token)match(input,54,FOLLOW_54_in_patternFullStream574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal40);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:25: ( 'within' time )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:26: 'within' time
                            {
                            string_literal41=(Token)match(input,125,FOLLOW_125_in_patternFullStream577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal41);


                            pushFollow(FOLLOW_time_in_patternFullStream579);
                            time42=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time42.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: patternStream, time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 107:42: -> ^( PATTERN patternStream ( time )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:46: ^( PATTERN patternStream ( time )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PATTERN, "PATTERN")
                        , root_1);

                        adaptor.addChild(root_1, stream_patternStream.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:72: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_1, stream_time.nextTree());

                        }
                        stream_time.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:3: patternStream ( 'within' time )?
                    {
                    pushFollow(FOLLOW_patternStream_in_patternFullStream601);
                    patternStream43=patternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternStream.add(patternStream43.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:18: ( 'within' time )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:19: 'within' time
                            {
                            string_literal44=(Token)match(input,125,FOLLOW_125_in_patternFullStream605); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal44);


                            pushFollow(FOLLOW_time_in_patternFullStream607);
                            time45=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time45.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: patternStream, time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 108:36: -> ^( PATTERN patternStream ( time )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:40: ^( PATTERN patternStream ( time )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PATTERN, "PATTERN")
                        , root_1);

                        adaptor.addChild(root_1, stream_patternStream.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:66: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_1, stream_time.nextTree());

                        }
                        stream_time.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "patternFullStream"


    public static class basicStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "basicStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:111:1: basicStream : rawStream ( transformHandler )? ( 'as' id )? -> ^( STREAM rawStream ( transformHandler )? ( id )? ) ;
    public final SiddhiQLGrammarParser.basicStream_return basicStream() throws RecognitionException {
        SiddhiQLGrammarParser.basicStream_return retval = new SiddhiQLGrammarParser.basicStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal48=null;
        SiddhiQLGrammarParser.rawStream_return rawStream46 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler47 =null;

        SiddhiQLGrammarParser.id_return id49 =null;


        CommonTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rawStream=new RewriteRuleSubtreeStream(adaptor,"rule rawStream");
        RewriteRuleSubtreeStream stream_transformHandler=new RewriteRuleSubtreeStream(adaptor,"rule transformHandler");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:2: ( rawStream ( transformHandler )? ( 'as' id )? -> ^( STREAM rawStream ( transformHandler )? ( id )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:4: rawStream ( transformHandler )? ( 'as' id )?
            {
            pushFollow(FOLLOW_rawStream_in_basicStream638);
            rawStream46=rawStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rawStream.add(rawStream46.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:14: ( transformHandler )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case 51:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:14: transformHandler
                    {
                    pushFollow(FOLLOW_transformHandler_in_basicStream640);
                    transformHandler47=transformHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler47.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:32: ( 'as' id )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case 75:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:33: 'as' id
                    {
                    string_literal48=(Token)match(input,75,FOLLOW_75_in_basicStream644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal48);


                    pushFollow(FOLLOW_id_in_basicStream646);
                    id49=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id49.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: rawStream, id, transformHandler
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:43: -> ^( STREAM rawStream ( transformHandler )? ( id )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:46: ^( STREAM rawStream ( transformHandler )? ( id )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STREAM, "STREAM")
                , root_1);

                adaptor.addChild(root_1, stream_rawStream.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:65: ( transformHandler )?
                if ( stream_transformHandler.hasNext() ) {
                    adaptor.addChild(root_1, stream_transformHandler.nextTree());

                }
                stream_transformHandler.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:84: ( id )?
                if ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "basicStream"


    public static class windowStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:115:1: windowStream : ( streamId ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )? -> ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | '(' returnQuery ')' ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )? -> ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) );
    public final SiddhiQLGrammarParser.windowStream_return windowStream() throws RecognitionException {
        SiddhiQLGrammarParser.windowStream_return retval = new SiddhiQLGrammarParser.windowStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token string_literal62=null;
        SiddhiQLGrammarParser.streamId_return streamId50 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler51 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler52 =null;

        SiddhiQLGrammarParser.windowHandler_return windowHandler53 =null;

        SiddhiQLGrammarParser.id_return id55 =null;

        SiddhiQLGrammarParser.returnQuery_return returnQuery57 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler59 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler60 =null;

        SiddhiQLGrammarParser.windowHandler_return windowHandler61 =null;

        SiddhiQLGrammarParser.id_return id63 =null;


        CommonTree string_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree string_literal62_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_filterHandler=new RewriteRuleSubtreeStream(adaptor,"rule filterHandler");
        RewriteRuleSubtreeStream stream_windowHandler=new RewriteRuleSubtreeStream(adaptor,"rule windowHandler");
        RewriteRuleSubtreeStream stream_returnQuery=new RewriteRuleSubtreeStream(adaptor,"rule returnQuery");
        RewriteRuleSubtreeStream stream_transformHandler=new RewriteRuleSubtreeStream(adaptor,"rule transformHandler");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:2: ( streamId ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )? -> ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | '(' returnQuery ')' ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )? -> ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt22=1;
                }
                break;
            case 53:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:4: streamId ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )?
                    {
                    pushFollow(FOLLOW_streamId_in_windowStream674);
                    streamId50=streamId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_streamId.add(streamId50.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:14: ( filterHandler )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt16=1;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:14: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream677);
                            filterHandler51=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler51.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:29: ( transformHandler )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case 51:
                            {
                            switch ( input.LA(2) ) {
                                case 120:
                                    {
                                    alt17=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:29: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream680);
                            transformHandler52=transformHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler52.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream683);
                    windowHandler53=windowHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowHandler.add(windowHandler53.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:61: ( 'as' id )?
                    int alt18=2;
                    switch ( input.LA(1) ) {
                        case 75:
                            {
                            alt18=1;
                            }
                            break;
                    }

                    switch (alt18) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:62: 'as' id
                            {
                            string_literal54=(Token)match(input,75,FOLLOW_75_in_windowStream686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal54);


                            pushFollow(FOLLOW_id_in_windowStream688);
                            id55=id();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id.add(id55.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: windowHandler, id, filterHandler, streamId, transformHandler
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:71: -> ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:74: ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STREAM, "STREAM")
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:83: ^( streamId ( filterHandler )? ( transformHandler )? windowHandler )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_streamId.nextNode(), root_2);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:95: ( filterHandler )?
                        if ( stream_filterHandler.hasNext() ) {
                            adaptor.addChild(root_2, stream_filterHandler.nextTree());

                        }
                        stream_filterHandler.reset();

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:110: ( transformHandler )?
                        if ( stream_transformHandler.hasNext() ) {
                            adaptor.addChild(root_2, stream_transformHandler.nextTree());

                        }
                        stream_transformHandler.reset();

                        adaptor.addChild(root_2, stream_windowHandler.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:144: ( id )?
                        if ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:4: '(' returnQuery ')' ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )?
                    {
                    char_literal56=(Token)match(input,53,FOLLOW_53_in_windowStream717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal56);


                    pushFollow(FOLLOW_returnQuery_in_windowStream719);
                    returnQuery57=returnQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_returnQuery.add(returnQuery57.getTree());

                    char_literal58=(Token)match(input,54,FOLLOW_54_in_windowStream721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal58);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:25: ( filterHandler )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:25: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream724);
                            filterHandler59=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler59.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:40: ( transformHandler )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case 51:
                            {
                            switch ( input.LA(2) ) {
                                case 120:
                                    {
                                    alt20=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:40: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream727);
                            transformHandler60=transformHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler60.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream730);
                    windowHandler61=windowHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowHandler.add(windowHandler61.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:72: ( 'as' id )?
                    int alt21=2;
                    switch ( input.LA(1) ) {
                        case 75:
                            {
                            alt21=1;
                            }
                            break;
                    }

                    switch (alt21) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:73: 'as' id
                            {
                            string_literal62=(Token)match(input,75,FOLLOW_75_in_windowStream733); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal62);


                            pushFollow(FOLLOW_id_in_windowStream735);
                            id63=id();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id.add(id63.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: id, windowHandler, transformHandler, filterHandler, returnQuery
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:84: -> ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:88: ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STREAM, "STREAM")
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:97: ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANONYMOUS, "ANONYMOUS")
                        , root_2);

                        adaptor.addChild(root_2, stream_returnQuery.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:124: ( filterHandler )?
                        if ( stream_filterHandler.hasNext() ) {
                            adaptor.addChild(root_2, stream_filterHandler.nextTree());

                        }
                        stream_filterHandler.reset();

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:139: ( transformHandler )?
                        if ( stream_transformHandler.hasNext() ) {
                            adaptor.addChild(root_2, stream_transformHandler.nextTree());

                        }
                        stream_transformHandler.reset();

                        adaptor.addChild(root_2, stream_windowHandler.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:173: ( id )?
                        if ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "windowStream"


    public static class rawStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rawStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:120:1: rawStream : ( streamId ( filterHandler )? -> ^( streamId ( filterHandler )? ) | '(' returnQuery ')' ( filterHandler )? -> ^( ANONYMOUS returnQuery ( filterHandler )? ) );
    public final SiddhiQLGrammarParser.rawStream_return rawStream() throws RecognitionException {
        SiddhiQLGrammarParser.rawStream_return retval = new SiddhiQLGrammarParser.rawStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        SiddhiQLGrammarParser.streamId_return streamId64 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler65 =null;

        SiddhiQLGrammarParser.returnQuery_return returnQuery67 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler69 =null;


        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_filterHandler=new RewriteRuleSubtreeStream(adaptor,"rule filterHandler");
        RewriteRuleSubtreeStream stream_returnQuery=new RewriteRuleSubtreeStream(adaptor,"rule returnQuery");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:2: ( streamId ( filterHandler )? -> ^( streamId ( filterHandler )? ) | '(' returnQuery ')' ( filterHandler )? -> ^( ANONYMOUS returnQuery ( filterHandler )? ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:4: streamId ( filterHandler )?
                    {
                    pushFollow(FOLLOW_streamId_in_rawStream777);
                    streamId64=streamId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_streamId.add(streamId64.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:14: ( filterHandler )?
                    int alt23=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt23=1;
                            }
                            break;
                    }

                    switch (alt23) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:14: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream780);
                            filterHandler65=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler65.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: streamId, filterHandler
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 121:31: -> ^( streamId ( filterHandler )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:34: ^( streamId ( filterHandler )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_streamId.nextNode(), root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:47: ( filterHandler )?
                        if ( stream_filterHandler.hasNext() ) {
                            adaptor.addChild(root_1, stream_filterHandler.nextTree());

                        }
                        stream_filterHandler.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:4: '(' returnQuery ')' ( filterHandler )?
                    {
                    char_literal66=(Token)match(input,53,FOLLOW_53_in_rawStream801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal66);


                    pushFollow(FOLLOW_returnQuery_in_rawStream803);
                    returnQuery67=returnQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_returnQuery.add(returnQuery67.getTree());

                    char_literal68=(Token)match(input,54,FOLLOW_54_in_rawStream805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal68);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:25: ( filterHandler )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:25: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream808);
                            filterHandler69=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler69.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: returnQuery, filterHandler
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 122:41: -> ^( ANONYMOUS returnQuery ( filterHandler )? )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:45: ^( ANONYMOUS returnQuery ( filterHandler )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANONYMOUS, "ANONYMOUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_returnQuery.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:70: ( filterHandler )?
                        if ( stream_filterHandler.hasNext() ) {
                            adaptor.addChild(root_1, stream_filterHandler.nextTree());

                        }
                        stream_filterHandler.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rawStream"


    public static class joinStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:125:1: joinStream : ( leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )? -> leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( 'on' condition )? ( 'within' time )? -> leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( 'on' condition )? ( 'within' time )? -> leftStream 'unidirectional' join rightStream ( condition )? ( time )? );
    public final SiddhiQLGrammarParser.joinStream_return joinStream() throws RecognitionException {
        SiddhiQLGrammarParser.joinStream_return retval = new SiddhiQLGrammarParser.joinStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal73=null;
        Token string_literal74=null;
        Token string_literal76=null;
        Token string_literal81=null;
        Token string_literal83=null;
        Token string_literal86=null;
        Token string_literal89=null;
        Token string_literal91=null;
        SiddhiQLGrammarParser.leftStream_return leftStream70 =null;

        SiddhiQLGrammarParser.join_return join71 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream72 =null;

        SiddhiQLGrammarParser.condition_return condition75 =null;

        SiddhiQLGrammarParser.time_return time77 =null;

        SiddhiQLGrammarParser.leftStream_return leftStream78 =null;

        SiddhiQLGrammarParser.join_return join79 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream80 =null;

        SiddhiQLGrammarParser.condition_return condition82 =null;

        SiddhiQLGrammarParser.time_return time84 =null;

        SiddhiQLGrammarParser.leftStream_return leftStream85 =null;

        SiddhiQLGrammarParser.join_return join87 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream88 =null;

        SiddhiQLGrammarParser.condition_return condition90 =null;

        SiddhiQLGrammarParser.time_return time92 =null;


        CommonTree string_literal73_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal91_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_join=new RewriteRuleSubtreeStream(adaptor,"rule join");
        RewriteRuleSubtreeStream stream_rightStream=new RewriteRuleSubtreeStream(adaptor,"rule rightStream");
        RewriteRuleSubtreeStream stream_leftStream=new RewriteRuleSubtreeStream(adaptor,"rule leftStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:2: ( leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )? -> leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( 'on' condition )? ( 'within' time )? -> leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( 'on' condition )? ( 'within' time )? -> leftStream 'unidirectional' join rightStream ( condition )? ( time )? )
            int alt32=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA32_1 = input.LA(2);

                if ( (synpred33_SiddhiQLGrammar()) ) {
                    alt32=1;
                }
                else if ( (synpred36_SiddhiQLGrammar()) ) {
                    alt32=2;
                }
                else if ( (true) ) {
                    alt32=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA32_2 = input.LA(2);

                if ( (synpred33_SiddhiQLGrammar()) ) {
                    alt32=1;
                }
                else if ( (synpred36_SiddhiQLGrammar()) ) {
                    alt32=2;
                }
                else if ( (true) ) {
                    alt32=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream834);
                    leftStream70=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream70.getTree());

                    pushFollow(FOLLOW_join_in_joinStream836);
                    join71=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join71.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream838);
                    rightStream72=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream72.getTree());

                    string_literal73=(Token)match(input,121,FOLLOW_121_in_joinStream840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal73);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:48: ( 'on' condition )?
                    int alt26=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt26=1;
                            }
                            break;
                    }

                    switch (alt26) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:49: 'on' condition
                            {
                            string_literal74=(Token)match(input,110,FOLLOW_110_in_joinStream843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal74);


                            pushFollow(FOLLOW_condition_in_joinStream845);
                            condition75=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition75.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:66: ( 'within' time )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:67: 'within' time
                            {
                            string_literal76=(Token)match(input,125,FOLLOW_125_in_joinStream850); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal76);


                            pushFollow(FOLLOW_time_in_joinStream852);
                            time77=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time77.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: join, condition, leftStream, rightStream, time, 121
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:83: -> leftStream join rightStream 'unidirectional' ( condition )? ( time )?
                    {
                        adaptor.addChild(root_0, stream_leftStream.nextTree());

                        adaptor.addChild(root_0, stream_join.nextTree());

                        adaptor.addChild(root_0, stream_rightStream.nextTree());

                        adaptor.addChild(root_0, 
                        stream_121.nextNode()
                        );

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:132: ( condition )?
                        if ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_0, stream_condition.nextTree());

                        }
                        stream_condition.reset();

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:143: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_0, stream_time.nextTree());

                        }
                        stream_time.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:3: leftStream join rightStream ( 'on' condition )? ( 'within' time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream875);
                    leftStream78=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream78.getTree());

                    pushFollow(FOLLOW_join_in_joinStream877);
                    join79=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join79.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream879);
                    rightStream80=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream80.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:31: ( 'on' condition )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt28=1;
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:32: 'on' condition
                            {
                            string_literal81=(Token)match(input,110,FOLLOW_110_in_joinStream882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal81);


                            pushFollow(FOLLOW_condition_in_joinStream884);
                            condition82=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition82.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:49: ( 'within' time )?
                    int alt29=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt29=1;
                            }
                            break;
                    }

                    switch (alt29) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:50: 'within' time
                            {
                            string_literal83=(Token)match(input,125,FOLLOW_125_in_joinStream889); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal83);


                            pushFollow(FOLLOW_time_in_joinStream891);
                            time84=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time84.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: rightStream, time, join, condition, leftStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 127:66: -> leftStream join rightStream ( condition )? ( time )?
                    {
                        adaptor.addChild(root_0, stream_leftStream.nextTree());

                        adaptor.addChild(root_0, stream_join.nextTree());

                        adaptor.addChild(root_0, stream_rightStream.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:99: ( condition )?
                        if ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_0, stream_condition.nextTree());

                        }
                        stream_condition.reset();

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:110: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_0, stream_time.nextTree());

                        }
                        stream_time.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:3: leftStream 'unidirectional' join rightStream ( 'on' condition )? ( 'within' time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream913);
                    leftStream85=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream85.getTree());

                    string_literal86=(Token)match(input,121,FOLLOW_121_in_joinStream915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal86);


                    pushFollow(FOLLOW_join_in_joinStream917);
                    join87=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join87.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream919);
                    rightStream88=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream88.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:48: ( 'on' condition )?
                    int alt30=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt30=1;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:49: 'on' condition
                            {
                            string_literal89=(Token)match(input,110,FOLLOW_110_in_joinStream922); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal89);


                            pushFollow(FOLLOW_condition_in_joinStream924);
                            condition90=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition90.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:66: ( 'within' time )?
                    int alt31=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt31=1;
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:67: 'within' time
                            {
                            string_literal91=(Token)match(input,125,FOLLOW_125_in_joinStream929); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal91);


                            pushFollow(FOLLOW_time_in_joinStream931);
                            time92=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time92.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: leftStream, rightStream, join, 121, condition, time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:83: -> leftStream 'unidirectional' join rightStream ( condition )? ( time )?
                    {
                        adaptor.addChild(root_0, stream_leftStream.nextTree());

                        adaptor.addChild(root_0, 
                        stream_121.nextNode()
                        );

                        adaptor.addChild(root_0, stream_join.nextTree());

                        adaptor.addChild(root_0, stream_rightStream.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:133: ( condition )?
                        if ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_0, stream_condition.nextTree());

                        }
                        stream_condition.reset();

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:144: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_0, stream_time.nextTree());

                        }
                        stream_time.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "joinStream"


    public static class leftStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:131:1: leftStream : ( windowStream | basicStream );
    public final SiddhiQLGrammarParser.leftStream_return leftStream() throws RecognitionException {
        SiddhiQLGrammarParser.leftStream_return retval = new SiddhiQLGrammarParser.leftStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.windowStream_return windowStream93 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream94 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:5: ( windowStream | basicStream )
            int alt33=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred39_SiddhiQLGrammar()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred39_SiddhiQLGrammar()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: windowStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_windowStream_in_leftStream966);
                    windowStream93=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, windowStream93.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:133:7: basicStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_basicStream_in_leftStream974);
                    basicStream94=basicStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, basicStream94.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftStream"


    public static class rightStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rightStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:136:1: rightStream : ( windowStream | basicStream );
    public final SiddhiQLGrammarParser.rightStream_return rightStream() throws RecognitionException {
        SiddhiQLGrammarParser.rightStream_return retval = new SiddhiQLGrammarParser.rightStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.windowStream_return windowStream95 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream96 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:5: ( windowStream | basicStream )
            int alt34=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA34_1 = input.LA(2);

                if ( (synpred40_SiddhiQLGrammar()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred40_SiddhiQLGrammar()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: windowStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_windowStream_in_rightStream992);
                    windowStream95=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, windowStream95.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:138:8: basicStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_basicStream_in_rightStream1001);
                    basicStream96=basicStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, basicStream96.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rightStream"


    public static class returnQuery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnQuery"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:141:1: returnQuery : inputStream 'return' outputProjection -> ^( RETURN_QUERY inputStream outputProjection ) ;
    public final SiddhiQLGrammarParser.returnQuery_return returnQuery() throws RecognitionException {
        SiddhiQLGrammarParser.returnQuery_return retval = new SiddhiQLGrammarParser.returnQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal98=null;
        SiddhiQLGrammarParser.inputStream_return inputStream97 =null;

        SiddhiQLGrammarParser.outputProjection_return outputProjection99 =null;


        CommonTree string_literal98_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_outputProjection=new RewriteRuleSubtreeStream(adaptor,"rule outputProjection");
        RewriteRuleSubtreeStream stream_inputStream=new RewriteRuleSubtreeStream(adaptor,"rule inputStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:142:2: ( inputStream 'return' outputProjection -> ^( RETURN_QUERY inputStream outputProjection ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:142:4: inputStream 'return' outputProjection
            {
            pushFollow(FOLLOW_inputStream_in_returnQuery1015);
            inputStream97=inputStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inputStream.add(inputStream97.getTree());

            string_literal98=(Token)match(input,113,FOLLOW_113_in_returnQuery1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal98);


            pushFollow(FOLLOW_outputProjection_in_returnQuery1019);
            outputProjection99=outputProjection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_outputProjection.add(outputProjection99.getTree());

            // AST REWRITE
            // elements: inputStream, outputProjection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:42: -> ^( RETURN_QUERY inputStream outputProjection )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:142:45: ^( RETURN_QUERY inputStream outputProjection )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETURN_QUERY, "RETURN_QUERY")
                , root_1);

                adaptor.addChild(root_1, stream_inputStream.nextTree());

                adaptor.addChild(root_1, stream_outputProjection.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnQuery"


    public static class patternStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "patternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:145:1: patternStream : ( patternItem ( FOLLOWED_BY patternStream )? -> patternItem ( patternStream )? | 'every' patternItem ( FOLLOWED_BY patternStream )? -> ^( 'every' patternItem ) ( patternStream )? | 'every' '(' nonEveryPatternStream ')' ( FOLLOWED_BY patternStream )? -> ^( 'every' nonEveryPatternStream ) ( patternStream )? );
    public final SiddhiQLGrammarParser.patternStream_return patternStream() throws RecognitionException {
        SiddhiQLGrammarParser.patternStream_return retval = new SiddhiQLGrammarParser.patternStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOLLOWED_BY101=null;
        Token string_literal103=null;
        Token FOLLOWED_BY105=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token FOLLOWED_BY111=null;
        SiddhiQLGrammarParser.patternItem_return patternItem100 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream102 =null;

        SiddhiQLGrammarParser.patternItem_return patternItem104 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream106 =null;

        SiddhiQLGrammarParser.nonEveryPatternStream_return nonEveryPatternStream109 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream112 =null;


        CommonTree FOLLOWED_BY101_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree FOLLOWED_BY105_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree FOLLOWED_BY111_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_FOLLOWED_BY=new RewriteRuleTokenStream(adaptor,"token FOLLOWED_BY");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_nonEveryPatternStream=new RewriteRuleSubtreeStream(adaptor,"rule nonEveryPatternStream");
        RewriteRuleSubtreeStream stream_patternStream=new RewriteRuleSubtreeStream(adaptor,"rule patternStream");
        RewriteRuleSubtreeStream stream_patternItem=new RewriteRuleSubtreeStream(adaptor,"rule patternItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:2: ( patternItem ( FOLLOWED_BY patternStream )? -> patternItem ( patternStream )? | 'every' patternItem ( FOLLOWED_BY patternStream )? -> ^( 'every' patternItem ) ( patternStream )? | 'every' '(' nonEveryPatternStream ')' ( FOLLOWED_BY patternStream )? -> ^( 'every' nonEveryPatternStream ) ( patternStream )? )
            int alt38=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt38=1;
                }
                break;
            case 85:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt38=3;
                    }
                    break;
                case ID:
                case ID_QUOTES:
                    {
                    alt38=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:4: patternItem ( FOLLOWED_BY patternStream )?
                    {
                    pushFollow(FOLLOW_patternItem_in_patternStream1041);
                    patternItem100=patternItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternItem.add(patternItem100.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:16: ( FOLLOWED_BY patternStream )?
                    int alt35=2;
                    switch ( input.LA(1) ) {
                        case FOLLOWED_BY:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    switch (alt35) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:18: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY101=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1045); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY101);


                            pushFollow(FOLLOW_patternStream_in_patternStream1047);
                            patternStream102=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream102.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: patternStream, patternItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:48: -> patternItem ( patternStream )?
                    {
                        adaptor.addChild(root_0, stream_patternItem.nextTree());

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:65: ( patternStream )?
                        if ( stream_patternStream.hasNext() ) {
                            adaptor.addChild(root_0, stream_patternStream.nextTree());

                        }
                        stream_patternStream.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:4: 'every' patternItem ( FOLLOWED_BY patternStream )?
                    {
                    string_literal103=(Token)match(input,85,FOLLOW_85_in_patternStream1065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal103);


                    pushFollow(FOLLOW_patternItem_in_patternStream1067);
                    patternItem104=patternItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternItem.add(patternItem104.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:24: ( FOLLOWED_BY patternStream )?
                    int alt36=2;
                    switch ( input.LA(1) ) {
                        case FOLLOWED_BY:
                            {
                            alt36=1;
                            }
                            break;
                    }

                    switch (alt36) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:26: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY105=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1071); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY105);


                            pushFollow(FOLLOW_patternStream_in_patternStream1073);
                            patternStream106=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream106.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 85, patternStream, patternItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 147:56: -> ^( 'every' patternItem ) ( patternStream )?
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:60: ^( 'every' patternItem )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_85.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_patternItem.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:86: ( patternStream )?
                        if ( stream_patternStream.hasNext() ) {
                            adaptor.addChild(root_0, stream_patternStream.nextTree());

                        }
                        stream_patternStream.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:4: 'every' '(' nonEveryPatternStream ')' ( FOLLOWED_BY patternStream )?
                    {
                    string_literal107=(Token)match(input,85,FOLLOW_85_in_patternStream1097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal107);


                    char_literal108=(Token)match(input,53,FOLLOW_53_in_patternStream1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal108);


                    pushFollow(FOLLOW_nonEveryPatternStream_in_patternStream1100);
                    nonEveryPatternStream109=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonEveryPatternStream.add(nonEveryPatternStream109.getTree());

                    char_literal110=(Token)match(input,54,FOLLOW_54_in_patternStream1101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal110);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:40: ( FOLLOWED_BY patternStream )?
                    int alt37=2;
                    switch ( input.LA(1) ) {
                        case FOLLOWED_BY:
                            {
                            alt37=1;
                            }
                            break;
                    }

                    switch (alt37) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:42: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY111=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1105); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY111);


                            pushFollow(FOLLOW_patternStream_in_patternStream1107);
                            patternStream112=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream112.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: nonEveryPatternStream, patternStream, 85
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 148:71: -> ^( 'every' nonEveryPatternStream ) ( patternStream )?
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:74: ^( 'every' nonEveryPatternStream )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_85.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_nonEveryPatternStream.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:111: ( patternStream )?
                        if ( stream_patternStream.hasNext() ) {
                            adaptor.addChild(root_0, stream_patternStream.nextTree());

                        }
                        stream_patternStream.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "patternStream"


    public static class nonEveryPatternStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonEveryPatternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:151:1: nonEveryPatternStream : patternItem ( FOLLOWED_BY nonEveryPatternStream )? -> patternItem ( nonEveryPatternStream )? ;
    public final SiddhiQLGrammarParser.nonEveryPatternStream_return nonEveryPatternStream() throws RecognitionException {
        SiddhiQLGrammarParser.nonEveryPatternStream_return retval = new SiddhiQLGrammarParser.nonEveryPatternStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOLLOWED_BY114=null;
        SiddhiQLGrammarParser.patternItem_return patternItem113 =null;

        SiddhiQLGrammarParser.nonEveryPatternStream_return nonEveryPatternStream115 =null;


        CommonTree FOLLOWED_BY114_tree=null;
        RewriteRuleTokenStream stream_FOLLOWED_BY=new RewriteRuleTokenStream(adaptor,"token FOLLOWED_BY");
        RewriteRuleSubtreeStream stream_nonEveryPatternStream=new RewriteRuleSubtreeStream(adaptor,"rule nonEveryPatternStream");
        RewriteRuleSubtreeStream stream_patternItem=new RewriteRuleSubtreeStream(adaptor,"rule patternItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:2: ( patternItem ( FOLLOWED_BY nonEveryPatternStream )? -> patternItem ( nonEveryPatternStream )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:4: patternItem ( FOLLOWED_BY nonEveryPatternStream )?
            {
            pushFollow(FOLLOW_patternItem_in_nonEveryPatternStream1136);
            patternItem113=patternItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_patternItem.add(patternItem113.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:17: ( FOLLOWED_BY nonEveryPatternStream )?
            int alt39=2;
            switch ( input.LA(1) ) {
                case FOLLOWED_BY:
                    {
                    alt39=1;
                    }
                    break;
            }

            switch (alt39) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:19: FOLLOWED_BY nonEveryPatternStream
                    {
                    FOLLOWED_BY114=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_nonEveryPatternStream1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY114);


                    pushFollow(FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream1143);
                    nonEveryPatternStream115=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonEveryPatternStream.add(nonEveryPatternStream115.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: nonEveryPatternStream, patternItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:57: -> patternItem ( nonEveryPatternStream )?
            {
                adaptor.addChild(root_0, stream_patternItem.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:73: ( nonEveryPatternStream )?
                if ( stream_nonEveryPatternStream.hasNext() ) {
                    adaptor.addChild(root_0, stream_nonEveryPatternStream.nextTree());

                }
                stream_nonEveryPatternStream.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonEveryPatternStream"


    public static class sequenceFullStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequenceFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:155:1: sequenceFullStream : sequenceStream ( 'within' time )? -> ^( SEQUENCE sequenceStream ( time )? ) ;
    public final SiddhiQLGrammarParser.sequenceFullStream_return sequenceFullStream() throws RecognitionException {
        SiddhiQLGrammarParser.sequenceFullStream_return retval = new SiddhiQLGrammarParser.sequenceFullStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal117=null;
        SiddhiQLGrammarParser.sequenceStream_return sequenceStream116 =null;

        SiddhiQLGrammarParser.time_return time118 =null;


        CommonTree string_literal117_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_sequenceStream=new RewriteRuleSubtreeStream(adaptor,"rule sequenceStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:2: ( sequenceStream ( 'within' time )? -> ^( SEQUENCE sequenceStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:3: sequenceStream ( 'within' time )?
            {
            pushFollow(FOLLOW_sequenceStream_in_sequenceFullStream1165);
            sequenceStream116=sequenceStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceStream.add(sequenceStream116.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:18: ( 'within' time )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case 125:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:19: 'within' time
                    {
                    string_literal117=(Token)match(input,125,FOLLOW_125_in_sequenceFullStream1168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal117);


                    pushFollow(FOLLOW_time_in_sequenceFullStream1170);
                    time118=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time118.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: time, sequenceStream
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:35: -> ^( SEQUENCE sequenceStream ( time )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:39: ^( SEQUENCE sequenceStream ( time )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SEQUENCE, "SEQUENCE")
                , root_1);

                adaptor.addChild(root_1, stream_sequenceStream.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:66: ( time )?
                if ( stream_time.hasNext() ) {
                    adaptor.addChild(root_1, stream_time.nextTree());

                }
                stream_time.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sequenceFullStream"


    public static class sequenceStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequenceStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:159:1: sequenceStream : sequenceItem ',' sequenceItem ( ',' sequenceItem )* -> ( sequenceItem )+ ;
    public final SiddhiQLGrammarParser.sequenceStream_return sequenceStream() throws RecognitionException {
        SiddhiQLGrammarParser.sequenceStream_return retval = new SiddhiQLGrammarParser.sequenceStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal120=null;
        Token char_literal122=null;
        SiddhiQLGrammarParser.sequenceItem_return sequenceItem119 =null;

        SiddhiQLGrammarParser.sequenceItem_return sequenceItem121 =null;

        SiddhiQLGrammarParser.sequenceItem_return sequenceItem123 =null;


        CommonTree char_literal120_tree=null;
        CommonTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_sequenceItem=new RewriteRuleSubtreeStream(adaptor,"rule sequenceItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:2: ( sequenceItem ',' sequenceItem ( ',' sequenceItem )* -> ( sequenceItem )+ )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:4: sequenceItem ',' sequenceItem ( ',' sequenceItem )*
            {
            pushFollow(FOLLOW_sequenceItem_in_sequenceStream1197);
            sequenceItem119=sequenceItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem119.getTree());

            char_literal120=(Token)match(input,57,FOLLOW_57_in_sequenceStream1199); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal120);


            pushFollow(FOLLOW_sequenceItem_in_sequenceStream1201);
            sequenceItem121=sequenceItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem121.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:35: ( ',' sequenceItem )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:36: ',' sequenceItem
            	    {
            	    char_literal122=(Token)match(input,57,FOLLOW_57_in_sequenceStream1205); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal122);


            	    pushFollow(FOLLOW_sequenceItem_in_sequenceStream1207);
            	    sequenceItem123=sequenceItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem123.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: sequenceItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 160:58: -> ( sequenceItem )+
            {
                if ( !(stream_sequenceItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sequenceItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_sequenceItem.nextTree());

                }
                stream_sequenceItem.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sequenceStream"


    public static class patternItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "patternItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:167:1: patternItem : ( itemStream 'and' ^ itemStream | itemStream 'or' ^ itemStream | itemStream '<' collect '>' -> ^( COLLECT itemStream collect ) | itemStream );
    public final SiddhiQLGrammarParser.patternItem_return patternItem() throws RecognitionException {
        SiddhiQLGrammarParser.patternItem_return retval = new SiddhiQLGrammarParser.patternItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal125=null;
        Token string_literal128=null;
        Token char_literal131=null;
        Token char_literal133=null;
        SiddhiQLGrammarParser.itemStream_return itemStream124 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream126 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream127 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream129 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream130 =null;

        SiddhiQLGrammarParser.collect_return collect132 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream134 =null;


        CommonTree string_literal125_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal133_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_itemStream=new RewriteRuleSubtreeStream(adaptor,"rule itemStream");
        RewriteRuleSubtreeStream stream_collect=new RewriteRuleSubtreeStream(adaptor,"rule collect");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:2: ( itemStream 'and' ^ itemStream | itemStream 'or' ^ itemStream | itemStream '<' collect '>' -> ^( COLLECT itemStream collect ) | itemStream )
            int alt42=4;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA42_1 = input.LA(2);

                if ( (synpred49_SiddhiQLGrammar()) ) {
                    alt42=1;
                }
                else if ( (synpred50_SiddhiQLGrammar()) ) {
                    alt42=2;
                }
                else if ( (synpred51_SiddhiQLGrammar()) ) {
                    alt42=3;
                }
                else if ( (true) ) {
                    alt42=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: itemStream 'and' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_patternItem1241);
                    itemStream124=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream124.getTree());

                    string_literal125=(Token)match(input,74,FOLLOW_74_in_patternItem1243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal125_tree = 
                    (CommonTree)adaptor.create(string_literal125)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal125_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_patternItem1246);
                    itemStream126=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream126.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: itemStream 'or' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_patternItem1251);
                    itemStream127=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream127.getTree());

                    string_literal128=(Token)match(input,111,FOLLOW_111_in_patternItem1253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal128_tree = 
                    (CommonTree)adaptor.create(string_literal128)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal128_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_patternItem1256);
                    itemStream129=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream129.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: itemStream '<' collect '>'
                    {
                    pushFollow(FOLLOW_itemStream_in_patternItem1261);
                    itemStream130=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_itemStream.add(itemStream130.getTree());

                    char_literal131=(Token)match(input,63,FOLLOW_63_in_patternItem1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal131);


                    pushFollow(FOLLOW_collect_in_patternItem1264);
                    collect132=collect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collect.add(collect132.getTree());

                    char_literal133=(Token)match(input,67,FOLLOW_67_in_patternItem1266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal133);


                    // AST REWRITE
                    // elements: collect, itemStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 170:30: -> ^( COLLECT itemStream collect )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:33: ^( COLLECT itemStream collect )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLLECT, "COLLECT")
                        , root_1);

                        adaptor.addChild(root_1, stream_itemStream.nextTree());

                        adaptor.addChild(root_1, stream_collect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:171:4: itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_patternItem1281);
                    itemStream134=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "patternItem"


    public static class sequenceItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequenceItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:174:1: sequenceItem : ( itemStream 'or' ^ itemStream | itemStream regex -> ^( REGEX itemStream regex ) | itemStream );
    public final SiddhiQLGrammarParser.sequenceItem_return sequenceItem() throws RecognitionException {
        SiddhiQLGrammarParser.sequenceItem_return retval = new SiddhiQLGrammarParser.sequenceItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal136=null;
        SiddhiQLGrammarParser.itemStream_return itemStream135 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream137 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream138 =null;

        SiddhiQLGrammarParser.regex_return regex139 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream140 =null;


        CommonTree string_literal136_tree=null;
        RewriteRuleSubtreeStream stream_itemStream=new RewriteRuleSubtreeStream(adaptor,"rule itemStream");
        RewriteRuleSubtreeStream stream_regex=new RewriteRuleSubtreeStream(adaptor,"rule regex");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:2: ( itemStream 'or' ^ itemStream | itemStream regex -> ^( REGEX itemStream regex ) | itemStream )
            int alt43=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA43_1 = input.LA(2);

                if ( (synpred52_SiddhiQLGrammar()) ) {
                    alt43=1;
                }
                else if ( (synpred53_SiddhiQLGrammar()) ) {
                    alt43=2;
                }
                else if ( (true) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: itemStream 'or' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_sequenceItem1292);
                    itemStream135=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream135.getTree());

                    string_literal136=(Token)match(input,111,FOLLOW_111_in_sequenceItem1294); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal136_tree = 
                    (CommonTree)adaptor.create(string_literal136)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal136_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_sequenceItem1297);
                    itemStream137=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream137.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: itemStream regex
                    {
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1302);
                    itemStream138=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_itemStream.add(itemStream138.getTree());

                    pushFollow(FOLLOW_regex_in_sequenceItem1304);
                    regex139=regex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_regex.add(regex139.getTree());

                    // AST REWRITE
                    // elements: regex, itemStream
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 176:21: -> ^( REGEX itemStream regex )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:24: ^( REGEX itemStream regex )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(REGEX, "REGEX")
                        , root_1);

                        adaptor.addChild(root_1, stream_itemStream.nextTree());

                        adaptor.addChild(root_1, stream_regex.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:177:4: itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_sequenceItem1319);
                    itemStream140=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream140.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sequenceItem"


    public static class itemStream_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "itemStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:180:1: itemStream : attributeName '=' rawStream -> ^( STREAM rawStream ( attributeName )? ) ;
    public final SiddhiQLGrammarParser.itemStream_return itemStream() throws RecognitionException {
        SiddhiQLGrammarParser.itemStream_return retval = new SiddhiQLGrammarParser.itemStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal142=null;
        SiddhiQLGrammarParser.attributeName_return attributeName141 =null;

        SiddhiQLGrammarParser.rawStream_return rawStream143 =null;


        CommonTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_rawStream=new RewriteRuleSubtreeStream(adaptor,"rule rawStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:2: ( attributeName '=' rawStream -> ^( STREAM rawStream ( attributeName )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:4: attributeName '=' rawStream
            {
            pushFollow(FOLLOW_attributeName_in_itemStream1330);
            attributeName141=attributeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attributeName.add(attributeName141.getTree());

            char_literal142=(Token)match(input,65,FOLLOW_65_in_itemStream1331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal142);


            pushFollow(FOLLOW_rawStream_in_itemStream1332);
            rawStream143=rawStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rawStream.add(rawStream143.getTree());

            // AST REWRITE
            // elements: attributeName, rawStream
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:31: -> ^( STREAM rawStream ( attributeName )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:36: ^( STREAM rawStream ( attributeName )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STREAM, "STREAM")
                , root_1);

                adaptor.addChild(root_1, stream_rawStream.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:55: ( attributeName )?
                if ( stream_attributeName.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributeName.nextTree());

                }
                stream_attributeName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "itemStream"


    public static class regex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regex"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:184:1: regex : ( '*' | '+' | '?' ) ( '?' )? ;
    public final SiddhiQLGrammarParser.regex_return regex() throws RecognitionException {
        SiddhiQLGrammarParser.regex_return retval = new SiddhiQLGrammarParser.regex_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set144=null;
        Token char_literal145=null;

        CommonTree set144_tree=null;
        CommonTree char_literal145_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:2: ( ( '*' | '+' | '?' ) ( '?' )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:4: ( '*' | '+' | '?' ) ( '?' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            set144=(Token)input.LT(1);

            if ( (input.LA(1) >= 55 && input.LA(1) <= 56)||input.LA(1)==69 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set144)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:18: ( '?' )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 69:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:18: '?'
                    {
                    char_literal145=(Token)match(input,69,FOLLOW_69_in_regex1365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = 
                    (CommonTree)adaptor.create(char_literal145)
                    ;
                    adaptor.addChild(root_0, char_literal145_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "regex"


    public static class outputProjection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputProjection"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:188:1: outputProjection : ( externalCall )? outputAttributeList ( groupBy )? ( having )? -> ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? ;
    public final SiddhiQLGrammarParser.outputProjection_return outputProjection() throws RecognitionException {
        SiddhiQLGrammarParser.outputProjection_return retval = new SiddhiQLGrammarParser.outputProjection_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.externalCall_return externalCall146 =null;

        SiddhiQLGrammarParser.outputAttributeList_return outputAttributeList147 =null;

        SiddhiQLGrammarParser.groupBy_return groupBy148 =null;

        SiddhiQLGrammarParser.having_return having149 =null;


        RewriteRuleSubtreeStream stream_groupBy=new RewriteRuleSubtreeStream(adaptor,"rule groupBy");
        RewriteRuleSubtreeStream stream_externalCall=new RewriteRuleSubtreeStream(adaptor,"rule externalCall");
        RewriteRuleSubtreeStream stream_outputAttributeList=new RewriteRuleSubtreeStream(adaptor,"rule outputAttributeList");
        RewriteRuleSubtreeStream stream_having=new RewriteRuleSubtreeStream(adaptor,"rule having");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:2: ( ( externalCall )? outputAttributeList ( groupBy )? ( having )? -> ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: ( externalCall )? outputAttributeList ( groupBy )? ( having )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: ( externalCall )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case 78:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: externalCall
                    {
                    pushFollow(FOLLOW_externalCall_in_outputProjection1377);
                    externalCall146=externalCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_externalCall.add(externalCall146.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_outputAttributeList_in_outputProjection1380);
            outputAttributeList147=outputAttributeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_outputAttributeList.add(outputAttributeList147.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:38: ( groupBy )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case 90:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:38: groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_outputProjection1382);
                    groupBy148=groupBy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupBy.add(groupBy148.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:47: ( having )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case 91:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:47: having
                    {
                    pushFollow(FOLLOW_having_in_outputProjection1385);
                    having149=having();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_having.add(having149.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: having, groupBy, externalCall, outputAttributeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:55: -> ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )?
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:59: ( externalCall )?
                if ( stream_externalCall.hasNext() ) {
                    adaptor.addChild(root_0, stream_externalCall.nextTree());

                }
                stream_externalCall.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:73: ^( OUT_ATTRIBUTES outputAttributeList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OUT_ATTRIBUTES, "OUT_ATTRIBUTES")
                , root_1);

                adaptor.addChild(root_1, stream_outputAttributeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:112: ( groupBy )?
                if ( stream_groupBy.hasNext() ) {
                    adaptor.addChild(root_0, stream_groupBy.nextTree());

                }
                stream_groupBy.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:121: ( having )?
                if ( stream_having.hasNext() ) {
                    adaptor.addChild(root_0, stream_having.nextTree());

                }
                stream_having.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outputProjection"


    public static class outputAttributeList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputAttributeList"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:192:1: outputAttributeList : ( '*' | outputItem ( ',' outputItem )* -> ( ^( OUT_ATTRIBUTE outputItem ) )+ | -> '*' );
    public final SiddhiQLGrammarParser.outputAttributeList_return outputAttributeList() throws RecognitionException {
        SiddhiQLGrammarParser.outputAttributeList_return retval = new SiddhiQLGrammarParser.outputAttributeList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        SiddhiQLGrammarParser.outputItem_return outputItem151 =null;

        SiddhiQLGrammarParser.outputItem_return outputItem153 =null;


        CommonTree char_literal150_tree=null;
        CommonTree char_literal152_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_outputItem=new RewriteRuleSubtreeStream(adaptor,"rule outputItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:193:2: ( '*' | outputItem ( ',' outputItem )* -> ( ^( OUT_ATTRIBUTE outputItem ) )+ | -> '*' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 54:
                case 62:
                case 90:
                case 91:
                    {
                    alt49=1;
                    }
                    break;
                case BOOL_VAL:
                case ID:
                case ID_QUOTES:
                case POSITIVE_DOUBLE_VAL:
                case POSITIVE_FLOAT_VAL:
                case POSITIVE_INT_VAL:
                case POSITIVE_LONG_VAL:
                case STRING_VAL:
                case 52:
                case 53:
                case 55:
                case 56:
                case 58:
                case 60:
                case 75:
                case 76:
                case 84:
                case 87:
                case 97:
                case 101:
                case 119:
                    {
                    alt49=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOL_VAL:
            case ID:
            case ID_QUOTES:
            case POSITIVE_DOUBLE_VAL:
            case POSITIVE_FLOAT_VAL:
            case POSITIVE_INT_VAL:
            case POSITIVE_LONG_VAL:
            case STRING_VAL:
            case 52:
            case 53:
            case 56:
            case 58:
            case 60:
            case 75:
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt49=2;
                }
                break;
            case EOF:
            case 54:
            case 62:
            case 90:
            case 91:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:193:3: '*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal150=(Token)match(input,55,FOLLOW_55_in_outputAttributeList1415); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal150_tree = 
                    (CommonTree)adaptor.create(char_literal150)
                    ;
                    adaptor.addChild(root_0, char_literal150_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:4: outputItem ( ',' outputItem )*
                    {
                    pushFollow(FOLLOW_outputItem_in_outputAttributeList1420);
                    outputItem151=outputItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputItem.add(outputItem151.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:15: ( ',' outputItem )*
                    loop48:
                    do {
                        int alt48=2;
                        switch ( input.LA(1) ) {
                        case 57:
                            {
                            alt48=1;
                            }
                            break;

                        }

                        switch (alt48) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:16: ',' outputItem
                    	    {
                    	    char_literal152=(Token)match(input,57,FOLLOW_57_in_outputAttributeList1423); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_57.add(char_literal152);


                    	    pushFollow(FOLLOW_outputItem_in_outputAttributeList1425);
                    	    outputItem153=outputItem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_outputItem.add(outputItem153.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: outputItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:33: -> ( ^( OUT_ATTRIBUTE outputItem ) )+
                    {
                        if ( !(stream_outputItem.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_outputItem.hasNext() ) {
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:37: ^( OUT_ATTRIBUTE outputItem )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot(
                            (CommonTree)adaptor.create(OUT_ATTRIBUTE, "OUT_ATTRIBUTE")
                            , root_1);

                            adaptor.addChild(root_1, stream_outputItem.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_outputItem.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:195:3: 
                    {
                    // AST REWRITE
                    // elements: 55
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 195:3: -> '*'
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(55, "55")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outputAttributeList"


    public static class outputItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:198:1: outputItem : ( extensionOutFunction 'as' id -> id extensionOutFunction | outFunction 'as' id -> outFunction id | expression 'as' id -> expression id | attributeVariable );
    public final SiddhiQLGrammarParser.outputItem_return outputItem() throws RecognitionException {
        SiddhiQLGrammarParser.outputItem_return retval = new SiddhiQLGrammarParser.outputItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal155=null;
        Token string_literal158=null;
        Token string_literal161=null;
        SiddhiQLGrammarParser.extensionOutFunction_return extensionOutFunction154 =null;

        SiddhiQLGrammarParser.id_return id156 =null;

        SiddhiQLGrammarParser.outFunction_return outFunction157 =null;

        SiddhiQLGrammarParser.id_return id159 =null;

        SiddhiQLGrammarParser.expression_return expression160 =null;

        SiddhiQLGrammarParser.id_return id162 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable163 =null;


        CommonTree string_literal155_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree string_literal161_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_extensionOutFunction=new RewriteRuleSubtreeStream(adaptor,"rule extensionOutFunction");
        RewriteRuleSubtreeStream stream_outFunction=new RewriteRuleSubtreeStream(adaptor,"rule outFunction");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:2: ( extensionOutFunction 'as' id -> id extensionOutFunction | outFunction 'as' id -> outFunction id | expression 'as' id -> expression id | attributeVariable )
            int alt50=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA50_1 = input.LA(2);

                if ( (synpred63_SiddhiQLGrammar()) ) {
                    alt50=1;
                }
                else if ( (synpred64_SiddhiQLGrammar()) ) {
                    alt50=2;
                }
                else if ( (synpred65_SiddhiQLGrammar()) ) {
                    alt50=3;
                }
                else if ( (true) ) {
                    alt50=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID_QUOTES:
                {
                int LA50_2 = input.LA(2);

                if ( (synpred63_SiddhiQLGrammar()) ) {
                    alt50=1;
                }
                else if ( (synpred65_SiddhiQLGrammar()) ) {
                    alt50=3;
                }
                else if ( (true) ) {
                    alt50=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOL_VAL:
            case POSITIVE_DOUBLE_VAL:
            case POSITIVE_FLOAT_VAL:
            case POSITIVE_INT_VAL:
            case POSITIVE_LONG_VAL:
            case STRING_VAL:
            case 52:
            case 53:
            case 55:
            case 56:
            case 58:
            case 60:
            case 75:
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }

            switch (alt50) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: extensionOutFunction 'as' id
                    {
                    pushFollow(FOLLOW_extensionOutFunction_in_outputItem1455);
                    extensionOutFunction154=extensionOutFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extensionOutFunction.add(extensionOutFunction154.getTree());

                    string_literal155=(Token)match(input,75,FOLLOW_75_in_outputItem1457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal155);


                    pushFollow(FOLLOW_id_in_outputItem1459);
                    id156=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id156.getTree());

                    // AST REWRITE
                    // elements: id, extensionOutFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 199:33: -> id extensionOutFunction
                    {
                        adaptor.addChild(root_0, stream_id.nextTree());

                        adaptor.addChild(root_0, stream_extensionOutFunction.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:200:4: outFunction 'as' id
                    {
                    pushFollow(FOLLOW_outFunction_in_outputItem1472);
                    outFunction157=outFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outFunction.add(outFunction157.getTree());

                    string_literal158=(Token)match(input,75,FOLLOW_75_in_outputItem1474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal158);


                    pushFollow(FOLLOW_id_in_outputItem1476);
                    id159=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id159.getTree());

                    // AST REWRITE
                    // elements: id, outFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:24: -> outFunction id
                    {
                        adaptor.addChild(root_0, stream_outFunction.nextTree());

                        adaptor.addChild(root_0, stream_id.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:201:4: expression 'as' id
                    {
                    pushFollow(FOLLOW_expression_in_outputItem1488);
                    expression160=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression160.getTree());

                    string_literal161=(Token)match(input,75,FOLLOW_75_in_outputItem1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal161);


                    pushFollow(FOLLOW_id_in_outputItem1493);
                    id162=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id162.getTree());

                    // AST REWRITE
                    // elements: id, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:25: -> expression id
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                        adaptor.addChild(root_0, stream_id.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:202:4: attributeVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_attributeVariable_in_outputItem1507);
                    attributeVariable163=attributeVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeVariable163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outputItem"


    public static class extensionOutFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extensionOutFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:205:1: extensionOutFunction : extensionId ':' functionId '(' ( parameters )? ')' -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) ;
    public final SiddhiQLGrammarParser.extensionOutFunction_return extensionOutFunction() throws RecognitionException {
        SiddhiQLGrammarParser.extensionOutFunction_return retval = new SiddhiQLGrammarParser.extensionOutFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal165=null;
        Token char_literal167=null;
        Token char_literal169=null;
        SiddhiQLGrammarParser.extensionId_return extensionId164 =null;

        SiddhiQLGrammarParser.functionId_return functionId166 =null;

        SiddhiQLGrammarParser.parameters_return parameters168 =null;


        CommonTree char_literal165_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_extensionId=new RewriteRuleSubtreeStream(adaptor,"rule extensionId");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_functionId=new RewriteRuleSubtreeStream(adaptor,"rule functionId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:2: ( extensionId ':' functionId '(' ( parameters )? ')' -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:4: extensionId ':' functionId '(' ( parameters )? ')'
            {
            pushFollow(FOLLOW_extensionId_in_extensionOutFunction1518);
            extensionId164=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId164.getTree());

            char_literal165=(Token)match(input,61,FOLLOW_61_in_extensionOutFunction1520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal165);


            pushFollow(FOLLOW_functionId_in_extensionOutFunction1522);
            functionId166=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId166.getTree());

            char_literal167=(Token)match(input,53,FOLLOW_53_in_extensionOutFunction1525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal167);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: ( parameters )?
            int alt51=2;
            switch ( input.LA(1) ) {
                case BOOL_VAL:
                case ID:
                case ID_QUOTES:
                case POSITIVE_DOUBLE_VAL:
                case POSITIVE_FLOAT_VAL:
                case POSITIVE_INT_VAL:
                case POSITIVE_LONG_VAL:
                case STRING_VAL:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                case 76:
                case 84:
                case 87:
                case 97:
                case 101:
                case 119:
                    {
                    alt51=1;
                    }
                    break;
                case 54:
                    {
                    int LA51_2 = input.LA(2);

                    if ( (synpred66_SiddhiQLGrammar()) ) {
                        alt51=1;
                    }
                    }
                    break;
            }

            switch (alt51) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_extensionOutFunction1527);
                    parameters168=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters168.getTree());

                    }
                    break;

            }


            char_literal169=(Token)match(input,54,FOLLOW_54_in_extensionOutFunction1530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal169);


            // AST REWRITE
            // elements: functionId, parameters, extensionId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 206:52: -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:55: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXTENSION_FUNCTION, "EXTENSION_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_extensionId.nextTree());

                adaptor.addChild(root_1, stream_functionId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:100: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensionOutFunction"


    public static class outFunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:209:1: outFunction : ID '(' ( parameters )? ')' -> ^( FUNCTION ID ( parameters )? ) ;
    public final SiddhiQLGrammarParser.outFunction_return outFunction() throws RecognitionException {
        SiddhiQLGrammarParser.outFunction_return retval = new SiddhiQLGrammarParser.outFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        SiddhiQLGrammarParser.parameters_return parameters172 =null;


        CommonTree ID170_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree char_literal173_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:2: ( ID '(' ( parameters )? ')' -> ^( FUNCTION ID ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:4: ID '(' ( parameters )? ')'
            {
            ID170=(Token)match(input,ID,FOLLOW_ID_in_outFunction1555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID170);


            char_literal171=(Token)match(input,53,FOLLOW_53_in_outFunction1557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal171);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: ( parameters )?
            int alt52=2;
            switch ( input.LA(1) ) {
                case BOOL_VAL:
                case ID:
                case ID_QUOTES:
                case POSITIVE_DOUBLE_VAL:
                case POSITIVE_FLOAT_VAL:
                case POSITIVE_INT_VAL:
                case POSITIVE_LONG_VAL:
                case STRING_VAL:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                case 76:
                case 84:
                case 87:
                case 97:
                case 101:
                case 119:
                    {
                    alt52=1;
                    }
                    break;
                case 54:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (synpred67_SiddhiQLGrammar()) ) {
                        alt52=1;
                    }
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_outFunction1559);
                    parameters172=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters172.getTree());

                    }
                    break;

            }


            char_literal173=(Token)match(input,54,FOLLOW_54_in_outFunction1562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal173);


            // AST REWRITE
            // elements: ID, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 210:27: -> ^( FUNCTION ID ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:30: ^( FUNCTION ID ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:45: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outFunction"


    public static class groupBy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupBy"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:213:1: groupBy : 'group' 'by' attributeVariable ( ',' attributeVariable )* -> ^( 'group' ( attributeVariable )+ ) ;
    public final SiddhiQLGrammarParser.groupBy_return groupBy() throws RecognitionException {
        SiddhiQLGrammarParser.groupBy_return retval = new SiddhiQLGrammarParser.groupBy_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal174=null;
        Token string_literal175=null;
        Token char_literal177=null;
        SiddhiQLGrammarParser.attributeVariable_return attributeVariable176 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable178 =null;


        CommonTree string_literal174_tree=null;
        CommonTree string_literal175_tree=null;
        CommonTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_attributeVariable=new RewriteRuleSubtreeStream(adaptor,"rule attributeVariable");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:2: ( 'group' 'by' attributeVariable ( ',' attributeVariable )* -> ^( 'group' ( attributeVariable )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:4: 'group' 'by' attributeVariable ( ',' attributeVariable )*
            {
            string_literal174=(Token)match(input,90,FOLLOW_90_in_groupBy1585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(string_literal174);


            string_literal175=(Token)match(input,77,FOLLOW_77_in_groupBy1587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal175);


            pushFollow(FOLLOW_attributeVariable_in_groupBy1589);
            attributeVariable176=attributeVariable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attributeVariable.add(attributeVariable176.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:35: ( ',' attributeVariable )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:36: ',' attributeVariable
            	    {
            	    char_literal177=(Token)match(input,57,FOLLOW_57_in_groupBy1592); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal177);


            	    pushFollow(FOLLOW_attributeVariable_in_groupBy1594);
            	    attributeVariable178=attributeVariable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attributeVariable.add(attributeVariable178.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // AST REWRITE
            // elements: 90, attributeVariable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 214:61: -> ^( 'group' ( attributeVariable )+ )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:66: ^( 'group' ( attributeVariable )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_90.nextNode()
                , root_1);

                if ( !(stream_attributeVariable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attributeVariable.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributeVariable.nextTree());

                }
                stream_attributeVariable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupBy"


    public static class having_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "having"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:217:1: having : 'having' condition -> ^( 'having' condition ) ;
    public final SiddhiQLGrammarParser.having_return having() throws RecognitionException {
        SiddhiQLGrammarParser.having_return retval = new SiddhiQLGrammarParser.having_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal179=null;
        SiddhiQLGrammarParser.condition_return condition180 =null;


        CommonTree string_literal179_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:218:2: ( 'having' condition -> ^( 'having' condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:218:4: 'having' condition
            {
            string_literal179=(Token)match(input,91,FOLLOW_91_in_having1619); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(string_literal179);


            pushFollow(FOLLOW_condition_in_having1621);
            condition180=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition180.getTree());

            // AST REWRITE
            // elements: condition, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:24: -> ^( 'having' condition )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:218:27: ^( 'having' condition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_91.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "having"


    public static class externalCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "externalCall"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:221:1: externalCall : 'call' ID '(' ( parameters )? ')' -> ^( 'call' ^( ID ( parameters )? ) ) ;
    public final SiddhiQLGrammarParser.externalCall_return externalCall() throws RecognitionException {
        SiddhiQLGrammarParser.externalCall_return retval = new SiddhiQLGrammarParser.externalCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal181=null;
        Token ID182=null;
        Token char_literal183=null;
        Token char_literal185=null;
        SiddhiQLGrammarParser.parameters_return parameters184 =null;


        CommonTree string_literal181_tree=null;
        CommonTree ID182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal185_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:2: ( 'call' ID '(' ( parameters )? ')' -> ^( 'call' ^( ID ( parameters )? ) ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:4: 'call' ID '(' ( parameters )? ')'
            {
            string_literal181=(Token)match(input,78,FOLLOW_78_in_externalCall1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal181);


            ID182=(Token)match(input,ID,FOLLOW_ID_in_externalCall1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID182);


            char_literal183=(Token)match(input,53,FOLLOW_53_in_externalCall1645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal183);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: ( parameters )?
            int alt54=2;
            switch ( input.LA(1) ) {
                case BOOL_VAL:
                case ID:
                case ID_QUOTES:
                case POSITIVE_DOUBLE_VAL:
                case POSITIVE_FLOAT_VAL:
                case POSITIVE_INT_VAL:
                case POSITIVE_LONG_VAL:
                case STRING_VAL:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                case 76:
                case 84:
                case 87:
                case 97:
                case 101:
                case 119:
                    {
                    alt54=1;
                    }
                    break;
                case 54:
                    {
                    int LA54_2 = input.LA(2);

                    if ( (synpred69_SiddhiQLGrammar()) ) {
                        alt54=1;
                    }
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_externalCall1647);
                    parameters184=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters184.getTree());

                    }
                    break;

            }


            char_literal185=(Token)match(input,54,FOLLOW_54_in_externalCall1650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal185);


            // AST REWRITE
            // elements: 78, parameters, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:35: -> ^( 'call' ^( ID ( parameters )? ) )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:39: ^( 'call' ^( ID ( parameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_78.nextNode()
                , root_1);

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:49: ^( ID ( parameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_ID.nextNode()
                , root_2);

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:54: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "externalCall"


    public static class filterHandler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filterHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:225:1: filterHandler : '[' condition ']' -> ^( FILTER condition ) ;
    public final SiddhiQLGrammarParser.filterHandler_return filterHandler() throws RecognitionException {
        SiddhiQLGrammarParser.filterHandler_return retval = new SiddhiQLGrammarParser.filterHandler_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal186=null;
        Token char_literal188=null;
        SiddhiQLGrammarParser.condition_return condition187 =null;


        CommonTree char_literal186_tree=null;
        CommonTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:226:2: ( '[' condition ']' -> ^( FILTER condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:226:4: '[' condition ']'
            {
            char_literal186=(Token)match(input,71,FOLLOW_71_in_filterHandler1677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal186);


            pushFollow(FOLLOW_condition_in_filterHandler1679);
            condition187=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition187.getTree());

            char_literal188=(Token)match(input,72,FOLLOW_72_in_filterHandler1681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal188);


            // AST REWRITE
            // elements: condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:23: -> ^( FILTER condition )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:226:29: ^( FILTER condition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FILTER, "FILTER")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filterHandler"


    public static class transformHandler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transformHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:229:1: transformHandler : '#' transform '.' extensibleId ( '(' ( parameters )? ')' )? -> ^( TRANSFORM extensibleId ( parameters )? ) ;
    public final SiddhiQLGrammarParser.transformHandler_return transformHandler() throws RecognitionException {
        SiddhiQLGrammarParser.transformHandler_return retval = new SiddhiQLGrammarParser.transformHandler_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal193=null;
        Token char_literal195=null;
        SiddhiQLGrammarParser.transform_return transform190 =null;

        SiddhiQLGrammarParser.extensibleId_return extensibleId192 =null;

        SiddhiQLGrammarParser.parameters_return parameters194 =null;


        CommonTree char_literal189_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_transform=new RewriteRuleSubtreeStream(adaptor,"rule transform");
        RewriteRuleSubtreeStream stream_extensibleId=new RewriteRuleSubtreeStream(adaptor,"rule extensibleId");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:2: ( '#' transform '.' extensibleId ( '(' ( parameters )? ')' )? -> ^( TRANSFORM extensibleId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:4: '#' transform '.' extensibleId ( '(' ( parameters )? ')' )?
            {
            char_literal189=(Token)match(input,51,FOLLOW_51_in_transformHandler1705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal189);


            pushFollow(FOLLOW_transform_in_transformHandler1707);
            transform190=transform();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_transform.add(transform190.getTree());

            char_literal191=(Token)match(input,59,FOLLOW_59_in_transformHandler1709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal191);


            pushFollow(FOLLOW_extensibleId_in_transformHandler1711);
            extensibleId192=extensibleId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensibleId.add(extensibleId192.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:36: ( '(' ( parameters )? ')' )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt56=1;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:37: '(' ( parameters )? ')'
                    {
                    char_literal193=(Token)match(input,53,FOLLOW_53_in_transformHandler1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal193);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: ( parameters )?
                    int alt55=2;
                    switch ( input.LA(1) ) {
                        case BOOL_VAL:
                        case ID:
                        case ID_QUOTES:
                        case POSITIVE_DOUBLE_VAL:
                        case POSITIVE_FLOAT_VAL:
                        case POSITIVE_INT_VAL:
                        case POSITIVE_LONG_VAL:
                        case STRING_VAL:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 60:
                        case 76:
                        case 84:
                        case 87:
                        case 97:
                        case 101:
                        case 119:
                            {
                            alt55=1;
                            }
                            break;
                        case 54:
                            {
                            int LA55_2 = input.LA(2);

                            if ( (synpred70_SiddhiQLGrammar()) ) {
                                alt55=1;
                            }
                            }
                            break;
                    }

                    switch (alt55) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_transformHandler1717);
                            parameters194=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters194.getTree());

                            }
                            break;

                    }


                    char_literal195=(Token)match(input,54,FOLLOW_54_in_transformHandler1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal195);


                    }
                    break;

            }


            // AST REWRITE
            // elements: extensibleId, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 230:60: -> ^( TRANSFORM extensibleId ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:65: ^( TRANSFORM extensibleId ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TRANSFORM, "TRANSFORM")
                , root_1);

                adaptor.addChild(root_1, stream_extensibleId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:91: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transformHandler"


    public static class windowHandler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "windowHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:233:1: windowHandler : '#' window '.' extensibleId ( '(' ( parameters )? ')' )? -> ^( WINDOW extensibleId ( parameters )? ) ;
    public final SiddhiQLGrammarParser.windowHandler_return windowHandler() throws RecognitionException {
        SiddhiQLGrammarParser.windowHandler_return retval = new SiddhiQLGrammarParser.windowHandler_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal196=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal202=null;
        SiddhiQLGrammarParser.window_return window197 =null;

        SiddhiQLGrammarParser.extensibleId_return extensibleId199 =null;

        SiddhiQLGrammarParser.parameters_return parameters201 =null;


        CommonTree char_literal196_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree char_literal202_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_window=new RewriteRuleSubtreeStream(adaptor,"rule window");
        RewriteRuleSubtreeStream stream_extensibleId=new RewriteRuleSubtreeStream(adaptor,"rule extensibleId");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:2: ( '#' window '.' extensibleId ( '(' ( parameters )? ')' )? -> ^( WINDOW extensibleId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:4: '#' window '.' extensibleId ( '(' ( parameters )? ')' )?
            {
            char_literal196=(Token)match(input,51,FOLLOW_51_in_windowHandler1748); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal196);


            pushFollow(FOLLOW_window_in_windowHandler1750);
            window197=window();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_window.add(window197.getTree());

            char_literal198=(Token)match(input,59,FOLLOW_59_in_windowHandler1753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal198);


            pushFollow(FOLLOW_extensibleId_in_windowHandler1755);
            extensibleId199=extensibleId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensibleId.add(extensibleId199.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:34: ( '(' ( parameters )? ')' )?
            int alt58=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt58=1;
                    }
                    break;
            }

            switch (alt58) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:35: '(' ( parameters )? ')'
                    {
                    char_literal200=(Token)match(input,53,FOLLOW_53_in_windowHandler1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal200);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: ( parameters )?
                    int alt57=2;
                    switch ( input.LA(1) ) {
                        case BOOL_VAL:
                        case ID:
                        case ID_QUOTES:
                        case POSITIVE_DOUBLE_VAL:
                        case POSITIVE_FLOAT_VAL:
                        case POSITIVE_INT_VAL:
                        case POSITIVE_LONG_VAL:
                        case STRING_VAL:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 60:
                        case 76:
                        case 84:
                        case 87:
                        case 97:
                        case 101:
                        case 119:
                            {
                            alt57=1;
                            }
                            break;
                        case 54:
                            {
                            int LA57_2 = input.LA(2);

                            if ( (synpred72_SiddhiQLGrammar()) ) {
                                alt57=1;
                            }
                            }
                            break;
                    }

                    switch (alt57) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_windowHandler1761);
                            parameters201=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters201.getTree());

                            }
                            break;

                    }


                    char_literal202=(Token)match(input,54,FOLLOW_54_in_windowHandler1764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal202);


                    }
                    break;

            }


            // AST REWRITE
            // elements: parameters, extensibleId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:58: -> ^( WINDOW extensibleId ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:63: ^( WINDOW extensibleId ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WINDOW, "WINDOW")
                , root_1);

                adaptor.addChild(root_1, stream_extensibleId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:86: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "windowHandler"


    public static class extensibleId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extensibleId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:237:1: extensibleId : ( extensionId ':' functionId -> ^( EXTENSION extensionId functionId ) | id );
    public final SiddhiQLGrammarParser.extensibleId_return extensibleId() throws RecognitionException {
        SiddhiQLGrammarParser.extensibleId_return retval = new SiddhiQLGrammarParser.extensibleId_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal204=null;
        SiddhiQLGrammarParser.extensionId_return extensionId203 =null;

        SiddhiQLGrammarParser.functionId_return functionId205 =null;

        SiddhiQLGrammarParser.id_return id206 =null;


        CommonTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_extensionId=new RewriteRuleSubtreeStream(adaptor,"rule extensionId");
        RewriteRuleSubtreeStream stream_functionId=new RewriteRuleSubtreeStream(adaptor,"rule functionId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:238:2: ( extensionId ':' functionId -> ^( EXTENSION extensionId functionId ) | id )
            int alt59=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt59=1;
                    }
                    break;
                case EOF:
                case 51:
                case 53:
                case 75:
                case 89:
                case 94:
                case 95:
                case 99:
                case 100:
                case 110:
                case 112:
                case 113:
                case 114:
                case 121:
                case 125:
                    {
                    alt59=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:238:4: extensionId ':' functionId
                    {
                    pushFollow(FOLLOW_extensionId_in_extensibleId1792);
                    extensionId203=extensionId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extensionId.add(extensionId203.getTree());

                    char_literal204=(Token)match(input,61,FOLLOW_61_in_extensibleId1794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal204);


                    pushFollow(FOLLOW_functionId_in_extensibleId1796);
                    functionId205=functionId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionId.add(functionId205.getTree());

                    // AST REWRITE
                    // elements: extensionId, functionId
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:31: -> ^( EXTENSION extensionId functionId )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:238:35: ^( EXTENSION extensionId functionId )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXTENSION, "EXTENSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_extensionId.nextTree());

                        adaptor.addChild(root_1, stream_functionId.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:239:4: id
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_id_in_extensibleId1814);
                    id206=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id206.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensibleId"


    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:242:1: parameters : parameter ( ',' parameter )* -> ^( PARAMETERS ( parameter )+ ) ;
    public final SiddhiQLGrammarParser.parameters_return parameters() throws RecognitionException {
        SiddhiQLGrammarParser.parameters_return retval = new SiddhiQLGrammarParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal208=null;
        SiddhiQLGrammarParser.parameter_return parameter207 =null;

        SiddhiQLGrammarParser.parameter_return parameter209 =null;


        CommonTree char_literal208_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:2: ( parameter ( ',' parameter )* -> ^( PARAMETERS ( parameter )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:4: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameters1825);
            parameter207=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter207.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:14: ( ',' parameter )*
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt60=1;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:15: ',' parameter
            	    {
            	    char_literal208=(Token)match(input,57,FOLLOW_57_in_parameters1828); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal208);


            	    pushFollow(FOLLOW_parameter_in_parameters1830);
            	    parameter209=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter209.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:32: -> ^( PARAMETERS ( parameter )+ )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:36: ^( PARAMETERS ( parameter )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETERS, "PARAMETERS")
                , root_1);

                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class time_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:246:1: time : constant ;
    public final SiddhiQLGrammarParser.time_return time() throws RecognitionException {
        SiddhiQLGrammarParser.time_return retval = new SiddhiQLGrammarParser.time_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.constant_return constant210 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:247:2: ( constant )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:247:4: constant
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_constant_in_time1854);
            constant210=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant210.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time"


    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:250:1: parameter : expression ;
    public final SiddhiQLGrammarParser.parameter_return parameter() throws RecognitionException {
        SiddhiQLGrammarParser.parameter_return retval = new SiddhiQLGrammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.expression_return expression211 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:251:2: ( expression )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:251:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_parameter1866);
            expression211=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression211.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class collect_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "collect"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:254:1: collect : ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd );
    public final SiddhiQLGrammarParser.collect_return collect() throws RecognitionException {
        SiddhiQLGrammarParser.collect_return retval = new SiddhiQLGrammarParser.collect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal213=null;
        Token char_literal216=null;
        Token char_literal217=null;
        SiddhiQLGrammarParser.countStart_return countStart212 =null;

        SiddhiQLGrammarParser.countEnd_return countEnd214 =null;

        SiddhiQLGrammarParser.countStart_return countStart215 =null;

        SiddhiQLGrammarParser.countEnd_return countEnd218 =null;

        SiddhiQLGrammarParser.countStartAndEnd_return countStartAndEnd219 =null;


        CommonTree char_literal213_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal217_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:255:2: ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd )
            int alt61=4;
            switch ( input.LA(1) ) {
            case POSITIVE_INT_VAL:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    switch ( input.LA(3) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt61=1;
                        }
                        break;
                    case 67:
                        {
                        alt61=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case 67:
                    {
                    alt61=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }

                }
                break;
            case 61:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:255:4: countStart ':' countEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStart_in_collect1877);
                    countStart212=countStart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStart212.getTree());

                    char_literal213=(Token)match(input,61,FOLLOW_61_in_collect1879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal213_tree = 
                    (CommonTree)adaptor.create(char_literal213)
                    ;
                    adaptor.addChild(root_0, char_literal213_tree);
                    }

                    pushFollow(FOLLOW_countEnd_in_collect1881);
                    countEnd214=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countEnd214.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:256:4: countStart ':'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStart_in_collect1886);
                    countStart215=countStart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStart215.getTree());

                    char_literal216=(Token)match(input,61,FOLLOW_61_in_collect1888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal216_tree = 
                    (CommonTree)adaptor.create(char_literal216)
                    ;
                    adaptor.addChild(root_0, char_literal216_tree);
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:257:4: ':' countEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal217=(Token)match(input,61,FOLLOW_61_in_collect1893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal217_tree = 
                    (CommonTree)adaptor.create(char_literal217)
                    ;
                    adaptor.addChild(root_0, char_literal217_tree);
                    }

                    pushFollow(FOLLOW_countEnd_in_collect1895);
                    countEnd218=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countEnd218.getTree());

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:258:4: countStartAndEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStartAndEnd_in_collect1900);
                    countStartAndEnd219=countStartAndEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStartAndEnd219.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "collect"


    public static class countStart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "countStart"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:261:1: countStart : POSITIVE_INT_VAL ;
    public final SiddhiQLGrammarParser.countStart_return countStart() throws RecognitionException {
        SiddhiQLGrammarParser.countStart_return retval = new SiddhiQLGrammarParser.countStart_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL220=null;

        CommonTree POSITIVE_INT_VAL220_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:261:12: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:261:13: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL220=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStart1909); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL220_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL220)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL220_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "countStart"


    public static class countEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "countEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:263:1: countEnd : POSITIVE_INT_VAL ;
    public final SiddhiQLGrammarParser.countEnd_return countEnd() throws RecognitionException {
        SiddhiQLGrammarParser.countEnd_return retval = new SiddhiQLGrammarParser.countEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL221=null;

        CommonTree POSITIVE_INT_VAL221_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:263:10: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:263:11: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL221=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countEnd1916); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL221_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL221)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL221_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "countEnd"


    public static class countStartAndEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "countStartAndEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:265:1: countStartAndEnd : POSITIVE_INT_VAL ;
    public final SiddhiQLGrammarParser.countStartAndEnd_return countStartAndEnd() throws RecognitionException {
        SiddhiQLGrammarParser.countStartAndEnd_return retval = new SiddhiQLGrammarParser.countStartAndEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL222=null;

        CommonTree POSITIVE_INT_VAL222_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:265:18: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:265:19: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL222=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL222_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL222)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL222_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "countStartAndEnd"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:269:1: condition : conditionExpression -> ^( CONDITION conditionExpression ) ;
    public final SiddhiQLGrammarParser.condition_return condition() throws RecognitionException {
        SiddhiQLGrammarParser.condition_return retval = new SiddhiQLGrammarParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression223 =null;


        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:270:2: ( conditionExpression -> ^( CONDITION conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:270:3: conditionExpression
            {
            pushFollow(FOLLOW_conditionExpression_in_condition1933);
            conditionExpression223=conditionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression223.getTree());

            // AST REWRITE
            // elements: conditionExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 270:24: -> ^( CONDITION conditionExpression )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:270:27: ^( CONDITION conditionExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                adaptor.addChild(root_1, stream_conditionExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class conditionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:273:1: conditionExpression : andCondition ( 'or' ^ conditionExpression )? ;
    public final SiddhiQLGrammarParser.conditionExpression_return conditionExpression() throws RecognitionException {
        SiddhiQLGrammarParser.conditionExpression_return retval = new SiddhiQLGrammarParser.conditionExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal225=null;
        SiddhiQLGrammarParser.andCondition_return andCondition224 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression226 =null;


        CommonTree string_literal225_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:5: ( andCondition ( 'or' ^ conditionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:7: andCondition ( 'or' ^ conditionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_andCondition_in_conditionExpression1956);
            andCondition224=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andCondition224.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:20: ( 'or' ^ conditionExpression )?
            int alt62=2;
            switch ( input.LA(1) ) {
                case 111:
                    {
                    int LA62_1 = input.LA(2);

                    if ( (synpred79_SiddhiQLGrammar()) ) {
                        alt62=1;
                    }
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: 'or' ^ conditionExpression
                    {
                    string_literal225=(Token)match(input,111,FOLLOW_111_in_conditionExpression1959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal225_tree = 
                    (CommonTree)adaptor.create(string_literal225)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal225_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1962);
                    conditionExpression226=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionExpression226.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionExpression"


    public static class andCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andCondition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:277:1: andCondition : compareCondition ( 'and' ^ conditionExpression )? ;
    public final SiddhiQLGrammarParser.andCondition_return andCondition() throws RecognitionException {
        SiddhiQLGrammarParser.andCondition_return retval = new SiddhiQLGrammarParser.andCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal228=null;
        SiddhiQLGrammarParser.compareCondition_return compareCondition227 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression229 =null;


        CommonTree string_literal228_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:2: ( compareCondition ( 'and' ^ conditionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:4: compareCondition ( 'and' ^ conditionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_compareCondition_in_andCondition1976);
            compareCondition227=compareCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compareCondition227.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:21: ( 'and' ^ conditionExpression )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case 74:
                    {
                    alt63=1;
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:22: 'and' ^ conditionExpression
                    {
                    string_literal228=(Token)match(input,74,FOLLOW_74_in_andCondition1979); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal228_tree = 
                    (CommonTree)adaptor.create(string_literal228)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal228_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionExpression_in_andCondition1982);
                    conditionExpression229=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionExpression229.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andCondition"


    public static class compareCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compareCondition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:281:1: compareCondition : ( expression compareOperation ^ expression | boolVal | '(' conditionExpression ')' -> conditionExpression | notCondition | extensionCondition );
    public final SiddhiQLGrammarParser.compareCondition_return compareCondition() throws RecognitionException {
        SiddhiQLGrammarParser.compareCondition_return retval = new SiddhiQLGrammarParser.compareCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal234=null;
        Token char_literal236=null;
        SiddhiQLGrammarParser.expression_return expression230 =null;

        SiddhiQLGrammarParser.compareOperation_return compareOperation231 =null;

        SiddhiQLGrammarParser.expression_return expression232 =null;

        SiddhiQLGrammarParser.boolVal_return boolVal233 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression235 =null;

        SiddhiQLGrammarParser.notCondition_return notCondition237 =null;

        SiddhiQLGrammarParser.extensionCondition_return extensionCondition238 =null;


        CommonTree char_literal234_tree=null;
        CommonTree char_literal236_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:2: ( expression compareOperation ^ expression | boolVal | '(' conditionExpression ')' -> conditionExpression | notCondition | extensionCondition )
            int alt64=5;
            switch ( input.LA(1) ) {
            case POSITIVE_DOUBLE_VAL:
            case POSITIVE_FLOAT_VAL:
            case POSITIVE_INT_VAL:
            case POSITIVE_LONG_VAL:
            case STRING_VAL:
            case 50:
            case 52:
            case 55:
            case 56:
            case 58:
            case 60:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 76:
            case 79:
            case 84:
            case 87:
            case 96:
            case 97:
            case 101:
            case 119:
                {
                alt64=1;
                }
                break;
            case BOOL_VAL:
                {
                int LA64_6 = input.LA(2);

                if ( (synpred81_SiddhiQLGrammar()) ) {
                    alt64=1;
                }
                else if ( (synpred82_SiddhiQLGrammar()) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 6, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case ID_QUOTES:
                {
                int LA64_13 = input.LA(2);

                if ( (synpred81_SiddhiQLGrammar()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 13, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA64_15 = input.LA(2);

                if ( (synpred81_SiddhiQLGrammar()) ) {
                    alt64=1;
                }
                else if ( (synpred83_SiddhiQLGrammar()) ) {
                    alt64=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 15, input);

                    throw nvae;

                }
                }
                break;
            case 109:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: expression compareOperation ^ expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_compareCondition1994);
                    expression230=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression230.getTree());

                    pushFollow(FOLLOW_compareOperation_in_compareCondition1996);
                    compareOperation231=compareOperation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(compareOperation231.getTree(), root_0);

                    pushFollow(FOLLOW_expression_in_compareCondition1999);
                    expression232=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression232.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: boolVal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolVal_in_compareCondition2003);
                    boolVal233=boolVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolVal233.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: '(' conditionExpression ')'
                    {
                    char_literal234=(Token)match(input,53,FOLLOW_53_in_compareCondition2010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal234);


                    pushFollow(FOLLOW_conditionExpression_in_compareCondition2011);
                    conditionExpression235=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression235.getTree());

                    char_literal236=(Token)match(input,54,FOLLOW_54_in_compareCondition2013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal236);


                    // AST REWRITE
                    // elements: conditionExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 284:33: -> conditionExpression
                    {
                        adaptor.addChild(root_0, stream_conditionExpression.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:285:6: notCondition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_notCondition_in_compareCondition2024);
                    notCondition237=notCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notCondition237.getTree());

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:286:6: extensionCondition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_extensionCondition_in_compareCondition2031);
                    extensionCondition238=extensionCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extensionCondition238.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compareCondition"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:289:1: expression : minusExpression ( '+' ^ expression )? ;
    public final SiddhiQLGrammarParser.expression_return expression() throws RecognitionException {
        SiddhiQLGrammarParser.expression_return retval = new SiddhiQLGrammarParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal240=null;
        SiddhiQLGrammarParser.minusExpression_return minusExpression239 =null;

        SiddhiQLGrammarParser.expression_return expression241 =null;


        CommonTree char_literal240_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:5: ( minusExpression ( '+' ^ expression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:6: minusExpression ( '+' ^ expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_minusExpression_in_expression2044);
            minusExpression239=minusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, minusExpression239.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:22: ( '+' ^ expression )?
            int alt65=2;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt65=1;
                    }
                    break;
            }

            switch (alt65) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:23: '+' ^ expression
                    {
                    char_literal240=(Token)match(input,56,FOLLOW_56_in_expression2047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = 
                    (CommonTree)adaptor.create(char_literal240)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal240_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_expression2050);
                    expression241=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class minusExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minusExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:293:1: minusExpression : multiplyExpression ( '-' ^ minusExpression )? ;
    public final SiddhiQLGrammarParser.minusExpression_return minusExpression() throws RecognitionException {
        SiddhiQLGrammarParser.minusExpression_return retval = new SiddhiQLGrammarParser.minusExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal243=null;
        SiddhiQLGrammarParser.multiplyExpression_return multiplyExpression242 =null;

        SiddhiQLGrammarParser.minusExpression_return minusExpression244 =null;


        CommonTree char_literal243_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:5: ( multiplyExpression ( '-' ^ minusExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:6: multiplyExpression ( '-' ^ minusExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplyExpression_in_minusExpression2068);
            multiplyExpression242=multiplyExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression242.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:25: ( '-' ^ minusExpression )?
            int alt66=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt66=1;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:26: '-' ^ minusExpression
                    {
                    char_literal243=(Token)match(input,58,FOLLOW_58_in_minusExpression2071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = 
                    (CommonTree)adaptor.create(char_literal243)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal243_tree, root_0);
                    }

                    pushFollow(FOLLOW_minusExpression_in_minusExpression2074);
                    minusExpression244=minusExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, minusExpression244.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minusExpression"


    public static class multiplyExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplyExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:297:1: multiplyExpression : divisionExpression ( '*' ^ multiplyExpression )? ;
    public final SiddhiQLGrammarParser.multiplyExpression_return multiplyExpression() throws RecognitionException {
        SiddhiQLGrammarParser.multiplyExpression_return retval = new SiddhiQLGrammarParser.multiplyExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal246=null;
        SiddhiQLGrammarParser.divisionExpression_return divisionExpression245 =null;

        SiddhiQLGrammarParser.multiplyExpression_return multiplyExpression247 =null;


        CommonTree char_literal246_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:5: ( divisionExpression ( '*' ^ multiplyExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:6: divisionExpression ( '*' ^ multiplyExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_divisionExpression_in_multiplyExpression2092);
            divisionExpression245=divisionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, divisionExpression245.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:25: ( '*' ^ multiplyExpression )?
            int alt67=2;
            switch ( input.LA(1) ) {
                case 55:
                    {
                    alt67=1;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:26: '*' ^ multiplyExpression
                    {
                    char_literal246=(Token)match(input,55,FOLLOW_55_in_multiplyExpression2095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal246_tree = 
                    (CommonTree)adaptor.create(char_literal246)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal246_tree, root_0);
                    }

                    pushFollow(FOLLOW_multiplyExpression_in_multiplyExpression2098);
                    multiplyExpression247=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression247.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyExpression"


    public static class divisionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "divisionExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:301:1: divisionExpression : modExpression ( '/' ^ divisionExpression )? ;
    public final SiddhiQLGrammarParser.divisionExpression_return divisionExpression() throws RecognitionException {
        SiddhiQLGrammarParser.divisionExpression_return retval = new SiddhiQLGrammarParser.divisionExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal249=null;
        SiddhiQLGrammarParser.modExpression_return modExpression248 =null;

        SiddhiQLGrammarParser.divisionExpression_return divisionExpression250 =null;


        CommonTree char_literal249_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:5: ( modExpression ( '/' ^ divisionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:6: modExpression ( '/' ^ divisionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_modExpression_in_divisionExpression2116);
            modExpression248=modExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modExpression248.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:20: ( '/' ^ divisionExpression )?
            int alt68=2;
            switch ( input.LA(1) ) {
                case 60:
                    {
                    alt68=1;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:21: '/' ^ divisionExpression
                    {
                    char_literal249=(Token)match(input,60,FOLLOW_60_in_divisionExpression2119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal249_tree = 
                    (CommonTree)adaptor.create(char_literal249)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal249_tree, root_0);
                    }

                    pushFollow(FOLLOW_divisionExpression_in_divisionExpression2122);
                    divisionExpression250=divisionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, divisionExpression250.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "divisionExpression"


    public static class modExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:305:1: modExpression : valueExpression ( '%' ^ modExpression )? ;
    public final SiddhiQLGrammarParser.modExpression_return modExpression() throws RecognitionException {
        SiddhiQLGrammarParser.modExpression_return retval = new SiddhiQLGrammarParser.modExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal252=null;
        SiddhiQLGrammarParser.valueExpression_return valueExpression251 =null;

        SiddhiQLGrammarParser.modExpression_return modExpression253 =null;


        CommonTree char_literal252_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:5: ( valueExpression ( '%' ^ modExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:6: valueExpression ( '%' ^ modExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_valueExpression_in_modExpression2140);
            valueExpression251=valueExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueExpression251.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:22: ( '%' ^ modExpression )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case 52:
                    {
                    alt69=1;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:23: '%' ^ modExpression
                    {
                    char_literal252=(Token)match(input,52,FOLLOW_52_in_modExpression2143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal252_tree = 
                    (CommonTree)adaptor.create(char_literal252)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal252_tree, root_0);
                    }

                    pushFollow(FOLLOW_modExpression_in_modExpression2146);
                    modExpression253=modExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modExpression253.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modExpression"


    public static class valueExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valueExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:309:1: valueExpression : ( constant | attributeVariable | type | '(' expression ')' -> expression | extensionExpression );
    public final SiddhiQLGrammarParser.valueExpression_return valueExpression() throws RecognitionException {
        SiddhiQLGrammarParser.valueExpression_return retval = new SiddhiQLGrammarParser.valueExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal257=null;
        Token char_literal259=null;
        SiddhiQLGrammarParser.constant_return constant254 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable255 =null;

        SiddhiQLGrammarParser.type_return type256 =null;

        SiddhiQLGrammarParser.expression_return expression258 =null;

        SiddhiQLGrammarParser.extensionExpression_return extensionExpression260 =null;


        CommonTree char_literal257_tree=null;
        CommonTree char_literal259_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:310:5: ( constant | attributeVariable | type | '(' expression ')' -> expression | extensionExpression )
            int alt70=5;
            switch ( input.LA(1) ) {
            case EOF:
            case BOOL_VAL:
            case POSITIVE_DOUBLE_VAL:
            case POSITIVE_FLOAT_VAL:
            case POSITIVE_INT_VAL:
            case POSITIVE_LONG_VAL:
            case STRING_VAL:
            case 50:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 62:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 72:
            case 74:
            case 75:
            case 79:
            case 95:
            case 96:
            case 111:
            case 113:
            case 125:
                {
                alt70=1;
                }
                break;
            case ID:
            case ID_QUOTES:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 50:
                case 52:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 62:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 71:
                case 72:
                case 74:
                case 75:
                case 79:
                case 95:
                case 96:
                case 111:
                case 113:
                case 125:
                    {
                    alt70=2;
                    }
                    break;
                case 61:
                    {
                    alt70=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;

                }

                }
                break;
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt70=3;
                }
                break;
            case 53:
                {
                alt70=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:310:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_valueExpression2165);
                    constant254=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant254.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:311:7: attributeVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_attributeVariable_in_valueExpression2173);
                    attributeVariable255=attributeVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeVariable255.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:312:7: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_valueExpression2181);
                    type256=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type256.getTree());

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:313:7: '(' expression ')'
                    {
                    char_literal257=(Token)match(input,53,FOLLOW_53_in_valueExpression2189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal257);


                    pushFollow(FOLLOW_expression_in_valueExpression2190);
                    expression258=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression258.getTree());

                    char_literal259=(Token)match(input,54,FOLLOW_54_in_valueExpression2192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal259);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 313:25: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:314:7: extensionExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_extensionExpression_in_valueExpression2204);
                    extensionExpression260=extensionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extensionExpression260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "valueExpression"


    public static class notCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notCondition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:317:1: notCondition : 'not' '(' conditionExpression ')' -> ^( 'not' conditionExpression ) ;
    public final SiddhiQLGrammarParser.notCondition_return notCondition() throws RecognitionException {
        SiddhiQLGrammarParser.notCondition_return retval = new SiddhiQLGrammarParser.notCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal261=null;
        Token char_literal262=null;
        Token char_literal264=null;
        SiddhiQLGrammarParser.conditionExpression_return conditionExpression263 =null;


        CommonTree string_literal261_tree=null;
        CommonTree char_literal262_tree=null;
        CommonTree char_literal264_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:318:2: ( 'not' '(' conditionExpression ')' -> ^( 'not' conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:318:3: 'not' '(' conditionExpression ')'
            {
            string_literal261=(Token)match(input,109,FOLLOW_109_in_notCondition2217); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal261);


            char_literal262=(Token)match(input,53,FOLLOW_53_in_notCondition2219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal262);


            pushFollow(FOLLOW_conditionExpression_in_notCondition2220);
            conditionExpression263=conditionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression263.getTree());

            char_literal264=(Token)match(input,54,FOLLOW_54_in_notCondition2221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal264);


            // AST REWRITE
            // elements: conditionExpression, 109
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 318:35: -> ^( 'not' conditionExpression )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:318:39: ^( 'not' conditionExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_109.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_conditionExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notCondition"


    public static class extensionCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extensionCondition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:321:1: extensionCondition : extensionId ':' functionId ( '(' ( parameters )? ')' )? -> ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) ;
    public final SiddhiQLGrammarParser.extensionCondition_return extensionCondition() throws RecognitionException {
        SiddhiQLGrammarParser.extensionCondition_return retval = new SiddhiQLGrammarParser.extensionCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal266=null;
        Token char_literal268=null;
        Token char_literal270=null;
        SiddhiQLGrammarParser.extensionId_return extensionId265 =null;

        SiddhiQLGrammarParser.functionId_return functionId267 =null;

        SiddhiQLGrammarParser.parameters_return parameters269 =null;


        CommonTree char_literal266_tree=null;
        CommonTree char_literal268_tree=null;
        CommonTree char_literal270_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_extensionId=new RewriteRuleSubtreeStream(adaptor,"rule extensionId");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_functionId=new RewriteRuleSubtreeStream(adaptor,"rule functionId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:5: ( extensionId ':' functionId ( '(' ( parameters )? ')' )? -> ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:9: extensionId ':' functionId ( '(' ( parameters )? ')' )?
            {
            pushFollow(FOLLOW_extensionId_in_extensionCondition2246);
            extensionId265=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId265.getTree());

            char_literal266=(Token)match(input,61,FOLLOW_61_in_extensionCondition2248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal266);


            pushFollow(FOLLOW_functionId_in_extensionCondition2250);
            functionId267=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId267.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:37: ( '(' ( parameters )? ')' )?
            int alt72=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt72=1;
                    }
                    break;
            }

            switch (alt72) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:38: '(' ( parameters )? ')'
                    {
                    char_literal268=(Token)match(input,53,FOLLOW_53_in_extensionCondition2254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal268);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: ( parameters )?
                    int alt71=2;
                    switch ( input.LA(1) ) {
                        case BOOL_VAL:
                        case ID:
                        case ID_QUOTES:
                        case POSITIVE_DOUBLE_VAL:
                        case POSITIVE_FLOAT_VAL:
                        case POSITIVE_INT_VAL:
                        case POSITIVE_LONG_VAL:
                        case STRING_VAL:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 60:
                        case 76:
                        case 84:
                        case 87:
                        case 97:
                        case 101:
                        case 119:
                            {
                            alt71=1;
                            }
                            break;
                        case 54:
                            {
                            int LA71_2 = input.LA(2);

                            if ( (synpred94_SiddhiQLGrammar()) ) {
                                alt71=1;
                            }
                            }
                            break;
                    }

                    switch (alt71) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_extensionCondition2256);
                            parameters269=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters269.getTree());

                            }
                            break;

                    }


                    char_literal270=(Token)match(input,54,FOLLOW_54_in_extensionCondition2259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal270);


                    }
                    break;

            }


            // AST REWRITE
            // elements: parameters, extensionId, functionId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 322:61: -> ^( CONDITION_FUNCTION extensionId functionId ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:66: ^( CONDITION_FUNCTION extensionId functionId ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION_FUNCTION, "CONDITION_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_extensionId.nextTree());

                adaptor.addChild(root_1, stream_functionId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:111: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensionCondition"


    public static class extensionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extensionExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:325:1: extensionExpression : extensionId ':' functionId ( '(' ( parameters )? ')' )? -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) ;
    public final SiddhiQLGrammarParser.extensionExpression_return extensionExpression() throws RecognitionException {
        SiddhiQLGrammarParser.extensionExpression_return retval = new SiddhiQLGrammarParser.extensionExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        Token char_literal276=null;
        SiddhiQLGrammarParser.extensionId_return extensionId271 =null;

        SiddhiQLGrammarParser.functionId_return functionId273 =null;

        SiddhiQLGrammarParser.parameters_return parameters275 =null;


        CommonTree char_literal272_tree=null;
        CommonTree char_literal274_tree=null;
        CommonTree char_literal276_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_extensionId=new RewriteRuleSubtreeStream(adaptor,"rule extensionId");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_functionId=new RewriteRuleSubtreeStream(adaptor,"rule functionId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:5: ( extensionId ':' functionId ( '(' ( parameters )? ')' )? -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:9: extensionId ':' functionId ( '(' ( parameters )? ')' )?
            {
            pushFollow(FOLLOW_extensionId_in_extensionExpression2297);
            extensionId271=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId271.getTree());

            char_literal272=(Token)match(input,61,FOLLOW_61_in_extensionExpression2299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal272);


            pushFollow(FOLLOW_functionId_in_extensionExpression2301);
            functionId273=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId273.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:37: ( '(' ( parameters )? ')' )?
            int alt74=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt74=1;
                    }
                    break;
            }

            switch (alt74) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:38: '(' ( parameters )? ')'
                    {
                    char_literal274=(Token)match(input,53,FOLLOW_53_in_extensionExpression2305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal274);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: ( parameters )?
                    int alt73=2;
                    switch ( input.LA(1) ) {
                        case BOOL_VAL:
                        case ID:
                        case ID_QUOTES:
                        case POSITIVE_DOUBLE_VAL:
                        case POSITIVE_FLOAT_VAL:
                        case POSITIVE_INT_VAL:
                        case POSITIVE_LONG_VAL:
                        case STRING_VAL:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 60:
                        case 76:
                        case 84:
                        case 87:
                        case 97:
                        case 101:
                        case 119:
                            {
                            alt73=1;
                            }
                            break;
                        case 54:
                            {
                            int LA73_2 = input.LA(2);

                            if ( (synpred96_SiddhiQLGrammar()) ) {
                                alt73=1;
                            }
                            }
                            break;
                    }

                    switch (alt73) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_extensionExpression2307);
                            parameters275=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters275.getTree());

                            }
                            break;

                    }


                    char_literal276=(Token)match(input,54,FOLLOW_54_in_extensionExpression2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal276);


                    }
                    break;

            }


            // AST REWRITE
            // elements: extensionId, parameters, functionId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 326:61: -> ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:66: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXTENSION_FUNCTION, "EXTENSION_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_extensionId.nextTree());

                adaptor.addChild(root_1, stream_functionId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:111: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensionExpression"


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:331:1: constant : ( intVal -> ^( CONSTANT intVal ) | longVal -> ^( CONSTANT longVal ) | floatVal -> ^( CONSTANT floatVal ) | doubleVal -> ^( CONSTANT doubleVal ) | boolVal -> ^( CONSTANT boolVal ) | stringVal -> ^( CONSTANT stringVal ) | timeExpr -> ^( CONSTANT timeExpr ) );
    public final SiddhiQLGrammarParser.constant_return constant() throws RecognitionException {
        SiddhiQLGrammarParser.constant_return retval = new SiddhiQLGrammarParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.intVal_return intVal277 =null;

        SiddhiQLGrammarParser.longVal_return longVal278 =null;

        SiddhiQLGrammarParser.floatVal_return floatVal279 =null;

        SiddhiQLGrammarParser.doubleVal_return doubleVal280 =null;

        SiddhiQLGrammarParser.boolVal_return boolVal281 =null;

        SiddhiQLGrammarParser.stringVal_return stringVal282 =null;

        SiddhiQLGrammarParser.timeExpr_return timeExpr283 =null;


        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_boolVal=new RewriteRuleSubtreeStream(adaptor,"rule boolVal");
        RewriteRuleSubtreeStream stream_floatVal=new RewriteRuleSubtreeStream(adaptor,"rule floatVal");
        RewriteRuleSubtreeStream stream_longVal=new RewriteRuleSubtreeStream(adaptor,"rule longVal");
        RewriteRuleSubtreeStream stream_doubleVal=new RewriteRuleSubtreeStream(adaptor,"rule doubleVal");
        RewriteRuleSubtreeStream stream_intVal=new RewriteRuleSubtreeStream(adaptor,"rule intVal");
        RewriteRuleSubtreeStream stream_stringVal=new RewriteRuleSubtreeStream(adaptor,"rule stringVal");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:2: ( intVal -> ^( CONSTANT intVal ) | longVal -> ^( CONSTANT longVal ) | floatVal -> ^( CONSTANT floatVal ) | doubleVal -> ^( CONSTANT doubleVal ) | boolVal -> ^( CONSTANT boolVal ) | stringVal -> ^( CONSTANT stringVal ) | timeExpr -> ^( CONSTANT timeExpr ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                int LA75_1 = input.LA(2);

                if ( (synpred98_SiddhiQLGrammar()) ) {
                    alt75=1;
                }
                else if ( (synpred99_SiddhiQLGrammar()) ) {
                    alt75=2;
                }
                else if ( (synpred100_SiddhiQLGrammar()) ) {
                    alt75=3;
                }
                else if ( (synpred101_SiddhiQLGrammar()) ) {
                    alt75=4;
                }
                else if ( (true) ) {
                    alt75=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }
                }
                break;
            case POSITIVE_INT_VAL:
                {
                switch ( input.LA(2) ) {
                case 81:
                case 82:
                case 92:
                case 93:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 115:
                case 116:
                case 117:
                case 122:
                case 123:
                case 126:
                case 127:
                    {
                    alt75=7;
                    }
                    break;
                case EOF:
                case 50:
                case 52:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                case 62:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 72:
                case 74:
                case 75:
                case 79:
                case 95:
                case 96:
                case 111:
                case 113:
                case 125:
                    {
                    alt75=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;

                }

                }
                break;
            case POSITIVE_LONG_VAL:
                {
                alt75=2;
                }
                break;
            case POSITIVE_FLOAT_VAL:
                {
                alt75=3;
                }
                break;
            case POSITIVE_DOUBLE_VAL:
                {
                alt75=4;
                }
                break;
            case BOOL_VAL:
                {
                alt75=5;
                }
                break;
            case STRING_VAL:
                {
                alt75=6;
                }
                break;
            case EOF:
            case 50:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 60:
            case 62:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 72:
            case 74:
            case 75:
            case 79:
            case 95:
            case 96:
            case 111:
            case 113:
            case 125:
                {
                alt75=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: intVal
                    {
                    pushFollow(FOLLOW_intVal_in_constant2344);
                    intVal277=intVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_intVal.add(intVal277.getTree());

                    // AST REWRITE
                    // elements: intVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 332:10: -> ^( CONSTANT intVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:13: ^( CONSTANT intVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_intVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:3: longVal
                    {
                    pushFollow(FOLLOW_longVal_in_constant2357);
                    longVal278=longVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_longVal.add(longVal278.getTree());

                    // AST REWRITE
                    // elements: longVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 333:11: -> ^( CONSTANT longVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:14: ^( CONSTANT longVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_longVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:3: floatVal
                    {
                    pushFollow(FOLLOW_floatVal_in_constant2370);
                    floatVal279=floatVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_floatVal.add(floatVal279.getTree());

                    // AST REWRITE
                    // elements: floatVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 334:13: -> ^( CONSTANT floatVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:16: ^( CONSTANT floatVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_floatVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:3: doubleVal
                    {
                    pushFollow(FOLLOW_doubleVal_in_constant2384);
                    doubleVal280=doubleVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleVal.add(doubleVal280.getTree());

                    // AST REWRITE
                    // elements: doubleVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:13: -> ^( CONSTANT doubleVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:16: ^( CONSTANT doubleVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_doubleVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:336:3: boolVal
                    {
                    pushFollow(FOLLOW_boolVal_in_constant2397);
                    boolVal281=boolVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolVal.add(boolVal281.getTree());

                    // AST REWRITE
                    // elements: boolVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 336:11: -> ^( CONSTANT boolVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:336:14: ^( CONSTANT boolVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:337:3: stringVal
                    {
                    pushFollow(FOLLOW_stringVal_in_constant2410);
                    stringVal282=stringVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringVal.add(stringVal282.getTree());

                    // AST REWRITE
                    // elements: stringVal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:13: -> ^( CONSTANT stringVal )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:337:16: ^( CONSTANT stringVal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_stringVal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:338:3: timeExpr
                    {
                    pushFollow(FOLLOW_timeExpr_in_constant2423);
                    timeExpr283=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr283.getTree());

                    // AST REWRITE
                    // elements: timeExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 338:14: -> ^( CONSTANT timeExpr )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:338:17: ^( CONSTANT timeExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSTANT, "CONSTANT")
                        , root_1);

                        adaptor.addChild(root_1, stream_timeExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class streamId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "streamId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:341:1: streamId : id ;
    public final SiddhiQLGrammarParser.streamId_return streamId() throws RecognitionException {
        SiddhiQLGrammarParser.streamId_return retval = new SiddhiQLGrammarParser.streamId_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.id_return id284 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:341:9: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:341:11: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_streamId2443);
            id284=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id284.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamId"


    public static class attributeVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeVariable"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:343:1: attributeVariable : ( streamPositionAttributeName | streamAttributeName | attributeName );
    public final SiddhiQLGrammarParser.attributeVariable_return attributeVariable() throws RecognitionException {
        SiddhiQLGrammarParser.attributeVariable_return retval = new SiddhiQLGrammarParser.attributeVariable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.streamPositionAttributeName_return streamPositionAttributeName285 =null;

        SiddhiQLGrammarParser.streamAttributeName_return streamAttributeName286 =null;

        SiddhiQLGrammarParser.attributeName_return attributeName287 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:2: ( streamPositionAttributeName | streamAttributeName | attributeName )
            int alt76=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    alt76=1;
                    }
                    break;
                case 59:
                    {
                    alt76=2;
                    }
                    break;
                case EOF:
                case 50:
                case 52:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                case 62:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 72:
                case 74:
                case 75:
                case 79:
                case 90:
                case 91:
                case 95:
                case 96:
                case 111:
                case 113:
                case 125:
                    {
                    alt76=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:3: streamPositionAttributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_streamPositionAttributeName_in_attributeVariable2451);
                    streamPositionAttributeName285=streamPositionAttributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, streamPositionAttributeName285.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:31: streamAttributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_streamAttributeName_in_attributeVariable2453);
                    streamAttributeName286=streamAttributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, streamAttributeName286.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:51: attributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_attributeName_in_attributeVariable2455);
                    attributeName287=attributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeName287.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributeVariable"


    public static class streamPositionAttributeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "streamPositionAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:346:1: streamPositionAttributeName : streamId '[' POSITIVE_INT_VAL ']' '.' id -> ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) ;
    public final SiddhiQLGrammarParser.streamPositionAttributeName_return streamPositionAttributeName() throws RecognitionException {
        SiddhiQLGrammarParser.streamPositionAttributeName_return retval = new SiddhiQLGrammarParser.streamPositionAttributeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal289=null;
        Token POSITIVE_INT_VAL290=null;
        Token char_literal291=null;
        Token char_literal292=null;
        SiddhiQLGrammarParser.streamId_return streamId288 =null;

        SiddhiQLGrammarParser.id_return id293 =null;


        CommonTree char_literal289_tree=null;
        CommonTree POSITIVE_INT_VAL290_tree=null;
        CommonTree char_literal291_tree=null;
        CommonTree char_literal292_tree=null;
        RewriteRuleTokenStream stream_POSITIVE_INT_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INT_VAL");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:347:2: ( streamId '[' POSITIVE_INT_VAL ']' '.' id -> ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:347:3: streamId '[' POSITIVE_INT_VAL ']' '.' id
            {
            pushFollow(FOLLOW_streamId_in_streamPositionAttributeName2463);
            streamId288=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId288.getTree());

            char_literal289=(Token)match(input,71,FOLLOW_71_in_streamPositionAttributeName2465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal289);


            POSITIVE_INT_VAL290=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_INT_VAL.add(POSITIVE_INT_VAL290);


            char_literal291=(Token)match(input,72,FOLLOW_72_in_streamPositionAttributeName2467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal291);


            char_literal292=(Token)match(input,59,FOLLOW_59_in_streamPositionAttributeName2468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal292);


            pushFollow(FOLLOW_id_in_streamPositionAttributeName2470);
            id293=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id293.getTree());

            // AST REWRITE
            // elements: id, POSITIVE_INT_VAL, streamId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 347:41: -> ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:347:45: ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                , root_1);

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:347:58: ^( streamId POSITIVE_INT_VAL )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_streamId.nextNode(), root_2);

                adaptor.addChild(root_2, 
                stream_POSITIVE_INT_VAL.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamPositionAttributeName"


    public static class streamAttributeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "streamAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:350:1: streamAttributeName : streamId '.' id -> ^( ATTRIBUTE streamId id ) ;
    public final SiddhiQLGrammarParser.streamAttributeName_return streamAttributeName() throws RecognitionException {
        SiddhiQLGrammarParser.streamAttributeName_return retval = new SiddhiQLGrammarParser.streamAttributeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal295=null;
        SiddhiQLGrammarParser.streamId_return streamId294 =null;

        SiddhiQLGrammarParser.id_return id296 =null;


        CommonTree char_literal295_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:351:2: ( streamId '.' id -> ^( ATTRIBUTE streamId id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:351:4: streamId '.' id
            {
            pushFollow(FOLLOW_streamId_in_streamAttributeName2497);
            streamId294=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId294.getTree());

            char_literal295=(Token)match(input,59,FOLLOW_59_in_streamAttributeName2499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal295);


            pushFollow(FOLLOW_id_in_streamAttributeName2501);
            id296=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id296.getTree());

            // AST REWRITE
            // elements: streamId, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 351:21: -> ^( ATTRIBUTE streamId id )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:351:25: ^( ATTRIBUTE streamId id )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                , root_1);

                adaptor.addChild(root_1, stream_streamId.nextTree());

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamAttributeName"


    public static class attributeName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:354:1: attributeName : id -> ^( ATTRIBUTE id ) ;
    public final SiddhiQLGrammarParser.attributeName_return attributeName() throws RecognitionException {
        SiddhiQLGrammarParser.attributeName_return retval = new SiddhiQLGrammarParser.attributeName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.id_return id297 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:355:2: ( id -> ^( ATTRIBUTE id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:355:4: id
            {
            pushFollow(FOLLOW_id_in_attributeName2525);
            id297=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id297.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:8: -> ^( ATTRIBUTE id )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:355:12: ^( ATTRIBUTE id )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributeName"


    public static class join_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:358:1: join : ( 'left' 'outer' 'join' -> ^( 'join' ^( 'outer' 'left' ) ) | 'right' 'outer' 'join' -> ^( 'join' ^( 'outer' 'right' ) ) | 'full' 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'inner' 'join' -> ^( 'join' 'inner' ) | 'join' -> ^( 'join' 'inner' ) );
    public final SiddhiQLGrammarParser.join_return join() throws RecognitionException {
        SiddhiQLGrammarParser.join_return retval = new SiddhiQLGrammarParser.join_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal298=null;
        Token string_literal299=null;
        Token string_literal300=null;
        Token string_literal301=null;
        Token string_literal302=null;
        Token string_literal303=null;
        Token string_literal304=null;
        Token string_literal305=null;
        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token string_literal310=null;
        Token string_literal311=null;

        CommonTree string_literal298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:2: ( 'left' 'outer' 'join' -> ^( 'join' ^( 'outer' 'left' ) ) | 'right' 'outer' 'join' -> ^( 'join' ^( 'outer' 'right' ) ) | 'full' 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'inner' 'join' -> ^( 'join' 'inner' ) | 'join' -> ^( 'join' 'inner' ) )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt77=1;
                }
                break;
            case 114:
                {
                alt77=2;
                }
                break;
            case 89:
                {
                alt77=3;
                }
                break;
            case 112:
                {
                alt77=4;
                }
                break;
            case 94:
                {
                alt77=5;
                }
                break;
            case 99:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:4: 'left' 'outer' 'join'
                    {
                    string_literal298=(Token)match(input,100,FOLLOW_100_in_join2547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_100.add(string_literal298);


                    string_literal299=(Token)match(input,112,FOLLOW_112_in_join2548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal299);


                    string_literal300=(Token)match(input,99,FOLLOW_99_in_join2550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal300);


                    // AST REWRITE
                    // elements: 99, 100, 112
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 359:25: -> ^( 'join' ^( 'outer' 'left' ) )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:29: ^( 'join' ^( 'outer' 'left' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:38: ^( 'outer' 'left' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_112.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_100.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:360:4: 'right' 'outer' 'join'
                    {
                    string_literal301=(Token)match(input,114,FOLLOW_114_in_join2568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal301);


                    string_literal302=(Token)match(input,112,FOLLOW_112_in_join2570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal302);


                    string_literal303=(Token)match(input,99,FOLLOW_99_in_join2572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal303);


                    // AST REWRITE
                    // elements: 112, 114, 99
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 360:27: -> ^( 'join' ^( 'outer' 'right' ) )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:360:30: ^( 'join' ^( 'outer' 'right' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:360:39: ^( 'outer' 'right' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_112.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_114.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:361:4: 'full' 'outer' 'join'
                    {
                    string_literal304=(Token)match(input,89,FOLLOW_89_in_join2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(string_literal304);


                    string_literal305=(Token)match(input,112,FOLLOW_112_in_join2590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal305);


                    string_literal306=(Token)match(input,99,FOLLOW_99_in_join2592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal306);


                    // AST REWRITE
                    // elements: 99, 89, 112
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:25: -> ^( 'join' ^( 'outer' 'full' ) )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:361:28: ^( 'join' ^( 'outer' 'full' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:361:37: ^( 'outer' 'full' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_112.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_89.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:362:4: 'outer' 'join'
                    {
                    string_literal307=(Token)match(input,112,FOLLOW_112_in_join2609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal307);


                    string_literal308=(Token)match(input,99,FOLLOW_99_in_join2611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal308);


                    // AST REWRITE
                    // elements: 112, 89, 99
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:20: -> ^( 'join' ^( 'outer' 'full' ) )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:362:23: ^( 'join' ^( 'outer' 'full' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:362:32: ^( 'outer' 'full' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_112.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        (CommonTree)adaptor.create(89, "89")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:363:4: 'inner' 'join'
                    {
                    string_literal309=(Token)match(input,94,FOLLOW_94_in_join2629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal309);


                    string_literal310=(Token)match(input,99,FOLLOW_99_in_join2631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal310);


                    // AST REWRITE
                    // elements: 94, 99
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 363:20: -> ^( 'join' 'inner' )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:363:23: ^( 'join' 'inner' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_94.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:364:5: 'join'
                    {
                    string_literal311=(Token)match(input,99,FOLLOW_99_in_join2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal311);


                    // AST REWRITE
                    // elements: 99, 94
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:12: -> ^( 'join' 'inner' )
                    {
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:364:15: ^( 'join' 'inner' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(94, "94")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join"


    public static class window_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "window"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:367:1: window : 'window' ;
    public final SiddhiQLGrammarParser.window_return window() throws RecognitionException {
        SiddhiQLGrammarParser.window_return retval = new SiddhiQLGrammarParser.window_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal312=null;

        CommonTree string_literal312_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:368:5: ( 'window' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:368:7: 'window'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal312=(Token)match(input,124,FOLLOW_124_in_window2668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal312_tree = 
            (CommonTree)adaptor.create(string_literal312)
            ;
            adaptor.addChild(root_0, string_literal312_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "window"


    public static class transform_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transform"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:371:1: transform : 'transform' ;
    public final SiddhiQLGrammarParser.transform_return transform() throws RecognitionException {
        SiddhiQLGrammarParser.transform_return retval = new SiddhiQLGrammarParser.transform_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal313=null;

        CommonTree string_literal313_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:372:5: ( 'transform' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:372:7: 'transform'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal313=(Token)match(input,120,FOLLOW_120_in_transform2685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal313_tree = 
            (CommonTree)adaptor.create(string_literal313)
            ;
            adaptor.addChild(root_0, string_literal313_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transform"


    public static class compareOperation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compareOperation"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:375:1: compareOperation : ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' );
    public final SiddhiQLGrammarParser.compareOperation_return compareOperation() throws RecognitionException {
        SiddhiQLGrammarParser.compareOperation_return retval = new SiddhiQLGrammarParser.compareOperation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set314=null;

        CommonTree set314_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:376:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set314=(Token)input.LT(1);

            if ( input.LA(1)==50||(input.LA(1) >= 63 && input.LA(1) <= 64)||(input.LA(1) >= 66 && input.LA(1) <= 68)||input.LA(1)==79||input.LA(1)==96 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set314)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compareOperation"


    public static class id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:379:1: id : ( ID | ID_QUOTES );
    public final SiddhiQLGrammarParser.id_return id() throws RecognitionException {
        SiddhiQLGrammarParser.id_return retval = new SiddhiQLGrammarParser.id_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set315=null;

        CommonTree set315_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:379:3: ( ID | ID_QUOTES )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set315=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= ID_QUOTES) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set315)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class timeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeExpr"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:381:1: timeExpr : ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? -> ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) ;
    public final SiddhiQLGrammarParser.timeExpr_return timeExpr() throws RecognitionException {
        SiddhiQLGrammarParser.timeExpr_return retval = new SiddhiQLGrammarParser.timeExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.yearValue_return yearValue316 =null;

        SiddhiQLGrammarParser.monthValue_return monthValue317 =null;

        SiddhiQLGrammarParser.weekValue_return weekValue318 =null;

        SiddhiQLGrammarParser.dayValue_return dayValue319 =null;

        SiddhiQLGrammarParser.hourValue_return hourValue320 =null;

        SiddhiQLGrammarParser.minuteValue_return minuteValue321 =null;

        SiddhiQLGrammarParser.secondValue_return secondValue322 =null;

        SiddhiQLGrammarParser.milliSecondValue_return milliSecondValue323 =null;


        RewriteRuleSubtreeStream stream_monthValue=new RewriteRuleSubtreeStream(adaptor,"rule monthValue");
        RewriteRuleSubtreeStream stream_minuteValue=new RewriteRuleSubtreeStream(adaptor,"rule minuteValue");
        RewriteRuleSubtreeStream stream_weekValue=new RewriteRuleSubtreeStream(adaptor,"rule weekValue");
        RewriteRuleSubtreeStream stream_dayValue=new RewriteRuleSubtreeStream(adaptor,"rule dayValue");
        RewriteRuleSubtreeStream stream_yearValue=new RewriteRuleSubtreeStream(adaptor,"rule yearValue");
        RewriteRuleSubtreeStream stream_milliSecondValue=new RewriteRuleSubtreeStream(adaptor,"rule milliSecondValue");
        RewriteRuleSubtreeStream stream_secondValue=new RewriteRuleSubtreeStream(adaptor,"rule secondValue");
        RewriteRuleSubtreeStream stream_hourValue=new RewriteRuleSubtreeStream(adaptor,"rule hourValue");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:5: ( ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? -> ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:7: ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:7: ( yearValue )?
            int alt78=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 126:
                        case 127:
                            {
                            alt78=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:8: yearValue
                    {
                    pushFollow(FOLLOW_yearValue_in_timeExpr2745);
                    yearValue316=yearValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearValue.add(yearValue316.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:20: ( monthValue )?
            int alt79=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 107:
                        case 108:
                            {
                            alt79=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt79) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:21: monthValue
                    {
                    pushFollow(FOLLOW_monthValue_in_timeExpr2750);
                    monthValue317=monthValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_monthValue.add(monthValue317.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:34: ( weekValue )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 122:
                        case 123:
                            {
                            alt80=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:35: weekValue
                    {
                    pushFollow(FOLLOW_weekValue_in_timeExpr2755);
                    weekValue318=weekValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_weekValue.add(weekValue318.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:47: ( dayValue )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 81:
                        case 82:
                            {
                            alt81=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:48: dayValue
                    {
                    pushFollow(FOLLOW_dayValue_in_timeExpr2760);
                    dayValue319=dayValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayValue.add(dayValue319.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:59: ( hourValue )?
            int alt82=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 92:
                        case 93:
                            {
                            alt82=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt82) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:60: hourValue
                    {
                    pushFollow(FOLLOW_hourValue_in_timeExpr2765);
                    hourValue320=hourValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hourValue.add(hourValue320.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:72: ( minuteValue )?
            int alt83=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 104:
                        case 105:
                        case 106:
                            {
                            alt83=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt83) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:73: minuteValue
                    {
                    pushFollow(FOLLOW_minuteValue_in_timeExpr2770);
                    minuteValue321=minuteValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minuteValue.add(minuteValue321.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:87: ( secondValue )?
            int alt84=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 115:
                        case 116:
                        case 117:
                            {
                            alt84=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt84) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:88: secondValue
                    {
                    pushFollow(FOLLOW_secondValue_in_timeExpr2775);
                    secondValue322=secondValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_secondValue.add(secondValue322.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:103: ( milliSecondValue )?
            int alt85=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    alt85=1;
                    }
                    break;
            }

            switch (alt85) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:104: milliSecondValue
                    {
                    pushFollow(FOLLOW_milliSecondValue_in_timeExpr2781);
                    milliSecondValue323=milliSecondValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_milliSecondValue.add(milliSecondValue323.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: dayValue, monthValue, weekValue, secondValue, yearValue, milliSecondValue, hourValue, minuteValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 383:2: -> ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:5: ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIME_EXP, "TIME_EXP")
                , root_1);

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:16: ( yearValue )?
                if ( stream_yearValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_yearValue.nextTree());

                }
                stream_yearValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:27: ( monthValue )?
                if ( stream_monthValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_monthValue.nextTree());

                }
                stream_monthValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:39: ( weekValue )?
                if ( stream_weekValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_weekValue.nextTree());

                }
                stream_weekValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:50: ( dayValue )?
                if ( stream_dayValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_dayValue.nextTree());

                }
                stream_dayValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:60: ( hourValue )?
                if ( stream_hourValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_hourValue.nextTree());

                }
                stream_hourValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:71: ( minuteValue )?
                if ( stream_minuteValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_minuteValue.nextTree());

                }
                stream_minuteValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:84: ( secondValue )?
                if ( stream_secondValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_secondValue.nextTree());

                }
                stream_secondValue.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:383:97: ( milliSecondValue )?
                if ( stream_milliSecondValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_milliSecondValue.nextTree());

                }
                stream_milliSecondValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "timeExpr"


    public static class yearValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "yearValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:386:1: yearValue : POSITIVE_INT_VAL ( 'years' | 'year' ) ;
    public final SiddhiQLGrammarParser.yearValue_return yearValue() throws RecognitionException {
        SiddhiQLGrammarParser.yearValue_return retval = new SiddhiQLGrammarParser.yearValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL324=null;
        Token set325=null;

        CommonTree POSITIVE_INT_VAL324_tree=null;
        CommonTree set325_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:387:2: ( POSITIVE_INT_VAL ( 'years' | 'year' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:387:4: POSITIVE_INT_VAL ( 'years' | 'year' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL324=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_yearValue2827); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL324_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL324)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL324_tree);
            }

            set325=(Token)input.LT(1);

            if ( (input.LA(1) >= 126 && input.LA(1) <= 127) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set325)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "yearValue"


    public static class monthValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "monthValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:390:1: monthValue : POSITIVE_INT_VAL ( 'months' | 'month' ) ;
    public final SiddhiQLGrammarParser.monthValue_return monthValue() throws RecognitionException {
        SiddhiQLGrammarParser.monthValue_return retval = new SiddhiQLGrammarParser.monthValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL326=null;
        Token set327=null;

        CommonTree POSITIVE_INT_VAL326_tree=null;
        CommonTree set327_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:391:2: ( POSITIVE_INT_VAL ( 'months' | 'month' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:391:4: POSITIVE_INT_VAL ( 'months' | 'month' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL326=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_monthValue2847); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL326_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL326)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL326_tree);
            }

            set327=(Token)input.LT(1);

            if ( (input.LA(1) >= 107 && input.LA(1) <= 108) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set327)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "monthValue"


    public static class weekValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "weekValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:394:1: weekValue : POSITIVE_INT_VAL ( 'weeks' | 'week' ) ;
    public final SiddhiQLGrammarParser.weekValue_return weekValue() throws RecognitionException {
        SiddhiQLGrammarParser.weekValue_return retval = new SiddhiQLGrammarParser.weekValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL328=null;
        Token set329=null;

        CommonTree POSITIVE_INT_VAL328_tree=null;
        CommonTree set329_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:395:2: ( POSITIVE_INT_VAL ( 'weeks' | 'week' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:395:4: POSITIVE_INT_VAL ( 'weeks' | 'week' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL328=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_weekValue2867); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL328_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL328)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL328_tree);
            }

            set329=(Token)input.LT(1);

            if ( (input.LA(1) >= 122 && input.LA(1) <= 123) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set329)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "weekValue"


    public static class dayValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:398:1: dayValue : POSITIVE_INT_VAL ( 'days' | 'day' ) ;
    public final SiddhiQLGrammarParser.dayValue_return dayValue() throws RecognitionException {
        SiddhiQLGrammarParser.dayValue_return retval = new SiddhiQLGrammarParser.dayValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL330=null;
        Token set331=null;

        CommonTree POSITIVE_INT_VAL330_tree=null;
        CommonTree set331_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:399:2: ( POSITIVE_INT_VAL ( 'days' | 'day' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:399:4: POSITIVE_INT_VAL ( 'days' | 'day' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL330=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_dayValue2887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL330_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL330)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL330_tree);
            }

            set331=(Token)input.LT(1);

            if ( (input.LA(1) >= 81 && input.LA(1) <= 82) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set331)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dayValue"


    public static class hourValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hourValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:402:1: hourValue : POSITIVE_INT_VAL ( 'hours' | 'hour' ) ;
    public final SiddhiQLGrammarParser.hourValue_return hourValue() throws RecognitionException {
        SiddhiQLGrammarParser.hourValue_return retval = new SiddhiQLGrammarParser.hourValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL332=null;
        Token set333=null;

        CommonTree POSITIVE_INT_VAL332_tree=null;
        CommonTree set333_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:403:2: ( POSITIVE_INT_VAL ( 'hours' | 'hour' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:403:4: POSITIVE_INT_VAL ( 'hours' | 'hour' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL332=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_hourValue2907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL332_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL332)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL332_tree);
            }

            set333=(Token)input.LT(1);

            if ( (input.LA(1) >= 92 && input.LA(1) <= 93) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set333)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hourValue"


    public static class minuteValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minuteValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:406:1: minuteValue : POSITIVE_INT_VAL ( 'minutes' | 'min' | 'minute' ) ;
    public final SiddhiQLGrammarParser.minuteValue_return minuteValue() throws RecognitionException {
        SiddhiQLGrammarParser.minuteValue_return retval = new SiddhiQLGrammarParser.minuteValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL334=null;
        Token set335=null;

        CommonTree POSITIVE_INT_VAL334_tree=null;
        CommonTree set335_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:407:2: ( POSITIVE_INT_VAL ( 'minutes' | 'min' | 'minute' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:407:4: POSITIVE_INT_VAL ( 'minutes' | 'min' | 'minute' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL334=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_minuteValue2930); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL334_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL334)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL334_tree);
            }

            set335=(Token)input.LT(1);

            if ( (input.LA(1) >= 104 && input.LA(1) <= 106) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set335)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minuteValue"


    public static class secondValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "secondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:410:1: secondValue : POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) ;
    public final SiddhiQLGrammarParser.secondValue_return secondValue() throws RecognitionException {
        SiddhiQLGrammarParser.secondValue_return retval = new SiddhiQLGrammarParser.secondValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL336=null;
        Token set337=null;

        CommonTree POSITIVE_INT_VAL336_tree=null;
        CommonTree set337_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:411:2: ( POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:411:4: POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL336=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_secondValue2958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL336_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL336)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL336_tree);
            }

            set337=(Token)input.LT(1);

            if ( (input.LA(1) >= 115 && input.LA(1) <= 117) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set337)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "secondValue"


    public static class milliSecondValue_return extends ParserRuleReturnScope {
        public long value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "milliSecondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:414:1: milliSecondValue returns [long value] : POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) ;
    public final SiddhiQLGrammarParser.milliSecondValue_return milliSecondValue() throws RecognitionException {
        SiddhiQLGrammarParser.milliSecondValue_return retval = new SiddhiQLGrammarParser.milliSecondValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POSITIVE_INT_VAL338=null;
        Token set339=null;

        CommonTree POSITIVE_INT_VAL338_tree=null;
        CommonTree set339_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:415:2: ( POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:415:4: POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL338=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2988); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL338_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL338)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL338_tree);
            }

            set339=(Token)input.LT(1);

            if ( (input.LA(1) >= 102 && input.LA(1) <= 103) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set339)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "milliSecondValue"


    public static class intVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:1: intVal : ( '-' )? POSITIVE_INT_VAL -> ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) ;
    public final SiddhiQLGrammarParser.intVal_return intVal() throws RecognitionException {
        SiddhiQLGrammarParser.intVal_return retval = new SiddhiQLGrammarParser.intVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal340=null;
        Token POSITIVE_INT_VAL341=null;

        CommonTree char_literal340_tree=null;
        CommonTree POSITIVE_INT_VAL341_tree=null;
        RewriteRuleTokenStream stream_POSITIVE_INT_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INT_VAL");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:7: ( ( '-' )? POSITIVE_INT_VAL -> ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: ( '-' )? POSITIVE_INT_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: ( '-' )?
            int alt86=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt86=1;
                    }
                    break;
            }

            switch (alt86) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: '-'
                    {
                    char_literal340=(Token)match(input,58,FOLLOW_58_in_intVal3009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal340);


                    }
                    break;

            }


            POSITIVE_INT_VAL341=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_intVal3012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_INT_VAL.add(POSITIVE_INT_VAL341);


            // AST REWRITE
            // elements: 58, POSITIVE_INT_VAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:31: -> ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:34: ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGNED_VAL, "SIGNED_VAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_POSITIVE_INT_VAL.nextNode()
                );

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:65: ( '-' )?
                if ( stream_58.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_58.nextNode()
                    );

                }
                stream_58.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intVal"


    public static class longVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "longVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:1: longVal : ( '-' )? POSITIVE_LONG_VAL -> ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) ;
    public final SiddhiQLGrammarParser.longVal_return longVal() throws RecognitionException {
        SiddhiQLGrammarParser.longVal_return retval = new SiddhiQLGrammarParser.longVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal342=null;
        Token POSITIVE_LONG_VAL343=null;

        CommonTree char_literal342_tree=null;
        CommonTree POSITIVE_LONG_VAL343_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_POSITIVE_LONG_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_LONG_VAL");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:8: ( ( '-' )? POSITIVE_LONG_VAL -> ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: ( '-' )? POSITIVE_LONG_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: ( '-' )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt87=1;
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: '-'
                    {
                    char_literal342=(Token)match(input,58,FOLLOW_58_in_longVal3031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal342);


                    }
                    break;

            }


            POSITIVE_LONG_VAL343=(Token)match(input,POSITIVE_LONG_VAL,FOLLOW_POSITIVE_LONG_VAL_in_longVal3034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_LONG_VAL.add(POSITIVE_LONG_VAL343);


            // AST REWRITE
            // elements: POSITIVE_LONG_VAL, 58
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 420:33: -> ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:36: ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGNED_VAL, "SIGNED_VAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_POSITIVE_LONG_VAL.nextNode()
                );

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:68: ( '-' )?
                if ( stream_58.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_58.nextNode()
                    );

                }
                stream_58.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "longVal"


    public static class floatVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floatVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:1: floatVal : ( '-' )? POSITIVE_FLOAT_VAL -> ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) ;
    public final SiddhiQLGrammarParser.floatVal_return floatVal() throws RecognitionException {
        SiddhiQLGrammarParser.floatVal_return retval = new SiddhiQLGrammarParser.floatVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal344=null;
        Token POSITIVE_FLOAT_VAL345=null;

        CommonTree char_literal344_tree=null;
        CommonTree POSITIVE_FLOAT_VAL345_tree=null;
        RewriteRuleTokenStream stream_POSITIVE_FLOAT_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_FLOAT_VAL");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:9: ( ( '-' )? POSITIVE_FLOAT_VAL -> ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: ( '-' )? POSITIVE_FLOAT_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: ( '-' )?
            int alt88=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt88=1;
                    }
                    break;
            }

            switch (alt88) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: '-'
                    {
                    char_literal344=(Token)match(input,58,FOLLOW_58_in_floatVal3053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal344);


                    }
                    break;

            }


            POSITIVE_FLOAT_VAL345=(Token)match(input,POSITIVE_FLOAT_VAL,FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_FLOAT_VAL.add(POSITIVE_FLOAT_VAL345);


            // AST REWRITE
            // elements: 58, POSITIVE_FLOAT_VAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 422:35: -> ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:38: ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGNED_VAL, "SIGNED_VAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_POSITIVE_FLOAT_VAL.nextNode()
                );

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:71: ( '-' )?
                if ( stream_58.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_58.nextNode()
                    );

                }
                stream_58.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "floatVal"


    public static class doubleVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doubleVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:1: doubleVal : ( '-' )? POSITIVE_DOUBLE_VAL -> ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) ;
    public final SiddhiQLGrammarParser.doubleVal_return doubleVal() throws RecognitionException {
        SiddhiQLGrammarParser.doubleVal_return retval = new SiddhiQLGrammarParser.doubleVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal346=null;
        Token POSITIVE_DOUBLE_VAL347=null;

        CommonTree char_literal346_tree=null;
        CommonTree POSITIVE_DOUBLE_VAL347_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_POSITIVE_DOUBLE_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_DOUBLE_VAL");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:10: ( ( '-' )? POSITIVE_DOUBLE_VAL -> ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: ( '-' )? POSITIVE_DOUBLE_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: ( '-' )?
            int alt89=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt89=1;
                    }
                    break;
            }

            switch (alt89) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: '-'
                    {
                    char_literal346=(Token)match(input,58,FOLLOW_58_in_doubleVal3075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal346);


                    }
                    break;

            }


            POSITIVE_DOUBLE_VAL347=(Token)match(input,POSITIVE_DOUBLE_VAL,FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_DOUBLE_VAL.add(POSITIVE_DOUBLE_VAL347);


            // AST REWRITE
            // elements: 58, POSITIVE_DOUBLE_VAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 424:37: -> ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:40: ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIGNED_VAL, "SIGNED_VAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_POSITIVE_DOUBLE_VAL.nextNode()
                );

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:74: ( '-' )?
                if ( stream_58.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_58.nextNode()
                    );

                }
                stream_58.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doubleVal"


    public static class boolVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:426:1: boolVal : BOOL_VAL ;
    public final SiddhiQLGrammarParser.boolVal_return boolVal() throws RecognitionException {
        SiddhiQLGrammarParser.boolVal_return retval = new SiddhiQLGrammarParser.boolVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOL_VAL348=null;

        CommonTree BOOL_VAL348_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:426:8: ( BOOL_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:426:10: BOOL_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            BOOL_VAL348=(Token)match(input,BOOL_VAL,FOLLOW_BOOL_VAL_in_boolVal3097); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOL_VAL348_tree = 
            (CommonTree)adaptor.create(BOOL_VAL348)
            ;
            adaptor.addChild(root_0, BOOL_VAL348_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolVal"


    public static class extensionId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extensionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:428:1: extensionId : id ;
    public final SiddhiQLGrammarParser.extensionId_return extensionId() throws RecognitionException {
        SiddhiQLGrammarParser.extensionId_return retval = new SiddhiQLGrammarParser.extensionId_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.id_return id349 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:428:12: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:428:14: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_extensionId3104);
            id349=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id349.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensionId"


    public static class functionId_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:430:1: functionId : id ;
    public final SiddhiQLGrammarParser.functionId_return functionId() throws RecognitionException {
        SiddhiQLGrammarParser.functionId_return retval = new SiddhiQLGrammarParser.functionId_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SiddhiQLGrammarParser.id_return id350 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:430:11: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:430:13: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_functionId3111);
            id350=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id350.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionId"


    public static class stringVal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:432:1: stringVal : STRING_VAL ;
    public final SiddhiQLGrammarParser.stringVal_return stringVal() throws RecognitionException {
        SiddhiQLGrammarParser.stringVal_return retval = new SiddhiQLGrammarParser.stringVal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_VAL351=null;

        CommonTree STRING_VAL351_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:432:10: ( STRING_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:432:12: STRING_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_VAL351=(Token)match(input,STRING_VAL,FOLLOW_STRING_VAL_in_stringVal3118); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_VAL351_tree = 
            (CommonTree)adaptor.create(STRING_VAL351)
            ;
            adaptor.addChild(root_0, STRING_VAL351_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringVal"


    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:434:1: type : ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' );
    public final SiddhiQLGrammarParser.type_return type() throws RecognitionException {
        SiddhiQLGrammarParser.type_return retval = new SiddhiQLGrammarParser.type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set352=null;

        CommonTree set352_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:434:5: ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set352=(Token)input.LT(1);

            if ( input.LA(1)==76||input.LA(1)==84||input.LA(1)==87||input.LA(1)==97||input.LA(1)==101||input.LA(1)==119 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set352)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred7_SiddhiQLGrammar
    public final void synpred7_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:3: ( inputStream outputStream outputProjection )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:84:3: inputStream outputStream outputProjection
        {
        pushFollow(FOLLOW_inputStream_in_synpred7_SiddhiQLGrammar373);
        inputStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_outputStream_in_synpred7_SiddhiQLGrammar375);
        outputStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_outputProjection_in_synpred7_SiddhiQLGrammar377);
        outputProjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_SiddhiQLGrammar

    // $ANTLR start synpred12_SiddhiQLGrammar
    public final void synpred12_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: ( sequenceFullStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: sequenceFullStream
        {
        pushFollow(FOLLOW_sequenceFullStream_in_synpred12_SiddhiQLGrammar489);
        sequenceFullStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_SiddhiQLGrammar

    // $ANTLR start synpred13_SiddhiQLGrammar
    public final void synpred13_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:5: ( patternFullStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:5: patternFullStream
        {
        pushFollow(FOLLOW_patternFullStream_in_synpred13_SiddhiQLGrammar503);
        patternFullStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_SiddhiQLGrammar

    // $ANTLR start synpred14_SiddhiQLGrammar
    public final void synpred14_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:5: ( joinStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:5: joinStream
        {
        pushFollow(FOLLOW_joinStream_in_synpred14_SiddhiQLGrammar520);
        joinStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_SiddhiQLGrammar

    // $ANTLR start synpred15_SiddhiQLGrammar
    public final void synpred15_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:100:5: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:100:5: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred15_SiddhiQLGrammar535);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_SiddhiQLGrammar

    // $ANTLR start synpred33_SiddhiQLGrammar
    public final void synpred33_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: ( leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred33_SiddhiQLGrammar834);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred33_SiddhiQLGrammar836);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred33_SiddhiQLGrammar838);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,121,FOLLOW_121_in_synpred33_SiddhiQLGrammar840); if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:48: ( 'on' condition )?
        int alt96=2;
        switch ( input.LA(1) ) {
            case 110:
                {
                alt96=1;
                }
                break;
        }

        switch (alt96) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:49: 'on' condition
                {
                match(input,110,FOLLOW_110_in_synpred33_SiddhiQLGrammar843); if (state.failed) return ;

                pushFollow(FOLLOW_condition_in_synpred33_SiddhiQLGrammar845);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:66: ( 'within' time )?
        int alt97=2;
        switch ( input.LA(1) ) {
            case 125:
                {
                alt97=1;
                }
                break;
        }

        switch (alt97) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:67: 'within' time
                {
                match(input,125,FOLLOW_125_in_synpred33_SiddhiQLGrammar850); if (state.failed) return ;

                pushFollow(FOLLOW_time_in_synpred33_SiddhiQLGrammar852);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred33_SiddhiQLGrammar

    // $ANTLR start synpred36_SiddhiQLGrammar
    public final void synpred36_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:3: ( leftStream join rightStream ( 'on' condition )? ( 'within' time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:3: leftStream join rightStream ( 'on' condition )? ( 'within' time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred36_SiddhiQLGrammar875);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred36_SiddhiQLGrammar877);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred36_SiddhiQLGrammar879);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:31: ( 'on' condition )?
        int alt98=2;
        switch ( input.LA(1) ) {
            case 110:
                {
                alt98=1;
                }
                break;
        }

        switch (alt98) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:32: 'on' condition
                {
                match(input,110,FOLLOW_110_in_synpred36_SiddhiQLGrammar882); if (state.failed) return ;

                pushFollow(FOLLOW_condition_in_synpred36_SiddhiQLGrammar884);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:49: ( 'within' time )?
        int alt99=2;
        switch ( input.LA(1) ) {
            case 125:
                {
                alt99=1;
                }
                break;
        }

        switch (alt99) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:50: 'within' time
                {
                match(input,125,FOLLOW_125_in_synpred36_SiddhiQLGrammar889); if (state.failed) return ;

                pushFollow(FOLLOW_time_in_synpred36_SiddhiQLGrammar891);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred36_SiddhiQLGrammar

    // $ANTLR start synpred39_SiddhiQLGrammar
    public final void synpred39_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred39_SiddhiQLGrammar966);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_SiddhiQLGrammar

    // $ANTLR start synpred40_SiddhiQLGrammar
    public final void synpred40_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred40_SiddhiQLGrammar992);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred40_SiddhiQLGrammar

    // $ANTLR start synpred49_SiddhiQLGrammar
    public final void synpred49_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: ( itemStream 'and' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: itemStream 'and' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred49_SiddhiQLGrammar1241);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,74,FOLLOW_74_in_synpred49_SiddhiQLGrammar1243); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred49_SiddhiQLGrammar1246);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_SiddhiQLGrammar

    // $ANTLR start synpred50_SiddhiQLGrammar
    public final void synpred50_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: ( itemStream 'or' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: itemStream 'or' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1251);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,111,FOLLOW_111_in_synpred50_SiddhiQLGrammar1253); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1256);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_SiddhiQLGrammar

    // $ANTLR start synpred51_SiddhiQLGrammar
    public final void synpred51_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: ( itemStream '<' collect '>' )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: itemStream '<' collect '>'
        {
        pushFollow(FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1261);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,63,FOLLOW_63_in_synpred51_SiddhiQLGrammar1263); if (state.failed) return ;

        pushFollow(FOLLOW_collect_in_synpred51_SiddhiQLGrammar1264);
        collect();

        state._fsp--;
        if (state.failed) return ;

        match(input,67,FOLLOW_67_in_synpred51_SiddhiQLGrammar1266); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_SiddhiQLGrammar

    // $ANTLR start synpred52_SiddhiQLGrammar
    public final void synpred52_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: ( itemStream 'or' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: itemStream 'or' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1292);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,111,FOLLOW_111_in_synpred52_SiddhiQLGrammar1294); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1297);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_SiddhiQLGrammar

    // $ANTLR start synpred53_SiddhiQLGrammar
    public final void synpred53_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: ( itemStream regex )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: itemStream regex
        {
        pushFollow(FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1302);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_regex_in_synpred53_SiddhiQLGrammar1304);
        regex();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_SiddhiQLGrammar

    // $ANTLR start synpred63_SiddhiQLGrammar
    public final void synpred63_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: ( extensionOutFunction 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: extensionOutFunction 'as' id
        {
        pushFollow(FOLLOW_extensionOutFunction_in_synpred63_SiddhiQLGrammar1455);
        extensionOutFunction();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred63_SiddhiQLGrammar1457); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred63_SiddhiQLGrammar1459);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_SiddhiQLGrammar

    // $ANTLR start synpred64_SiddhiQLGrammar
    public final void synpred64_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:200:4: ( outFunction 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:200:4: outFunction 'as' id
        {
        pushFollow(FOLLOW_outFunction_in_synpred64_SiddhiQLGrammar1472);
        outFunction();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred64_SiddhiQLGrammar1474); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred64_SiddhiQLGrammar1476);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_SiddhiQLGrammar

    // $ANTLR start synpred65_SiddhiQLGrammar
    public final void synpred65_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:201:4: ( expression 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:201:4: expression 'as' id
        {
        pushFollow(FOLLOW_expression_in_synpred65_SiddhiQLGrammar1488);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred65_SiddhiQLGrammar1491); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred65_SiddhiQLGrammar1493);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_SiddhiQLGrammar

    // $ANTLR start synpred66_SiddhiQLGrammar
    public final void synpred66_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred66_SiddhiQLGrammar1527);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred66_SiddhiQLGrammar

    // $ANTLR start synpred67_SiddhiQLGrammar
    public final void synpred67_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred67_SiddhiQLGrammar1559);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred67_SiddhiQLGrammar

    // $ANTLR start synpred69_SiddhiQLGrammar
    public final void synpred69_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred69_SiddhiQLGrammar1647);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred69_SiddhiQLGrammar

    // $ANTLR start synpred70_SiddhiQLGrammar
    public final void synpred70_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred70_SiddhiQLGrammar1717);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_SiddhiQLGrammar

    // $ANTLR start synpred72_SiddhiQLGrammar
    public final void synpred72_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred72_SiddhiQLGrammar1761);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred72_SiddhiQLGrammar

    // $ANTLR start synpred79_SiddhiQLGrammar
    public final void synpred79_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: ( 'or' conditionExpression )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: 'or' conditionExpression
        {
        match(input,111,FOLLOW_111_in_synpred79_SiddhiQLGrammar1959); if (state.failed) return ;

        pushFollow(FOLLOW_conditionExpression_in_synpred79_SiddhiQLGrammar1962);
        conditionExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_SiddhiQLGrammar

    // $ANTLR start synpred81_SiddhiQLGrammar
    public final void synpred81_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: ( expression compareOperation expression )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: expression compareOperation expression
        {
        pushFollow(FOLLOW_expression_in_synpred81_SiddhiQLGrammar1994);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_compareOperation_in_synpred81_SiddhiQLGrammar1996);
        compareOperation();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred81_SiddhiQLGrammar1999);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_SiddhiQLGrammar

    // $ANTLR start synpred82_SiddhiQLGrammar
    public final void synpred82_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: ( boolVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: boolVal
        {
        pushFollow(FOLLOW_boolVal_in_synpred82_SiddhiQLGrammar2003);
        boolVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_SiddhiQLGrammar

    // $ANTLR start synpred83_SiddhiQLGrammar
    public final void synpred83_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: ( '(' conditionExpression ')' )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: '(' conditionExpression ')'
        {
        match(input,53,FOLLOW_53_in_synpred83_SiddhiQLGrammar2010); if (state.failed) return ;

        pushFollow(FOLLOW_conditionExpression_in_synpred83_SiddhiQLGrammar2011);
        conditionExpression();

        state._fsp--;
        if (state.failed) return ;

        match(input,54,FOLLOW_54_in_synpred83_SiddhiQLGrammar2013); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_SiddhiQLGrammar

    // $ANTLR start synpred94_SiddhiQLGrammar
    public final void synpred94_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred94_SiddhiQLGrammar2256);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred94_SiddhiQLGrammar

    // $ANTLR start synpred96_SiddhiQLGrammar
    public final void synpred96_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred96_SiddhiQLGrammar2307);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_SiddhiQLGrammar

    // $ANTLR start synpred98_SiddhiQLGrammar
    public final void synpred98_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: ( intVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: intVal
        {
        pushFollow(FOLLOW_intVal_in_synpred98_SiddhiQLGrammar2344);
        intVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred98_SiddhiQLGrammar

    // $ANTLR start synpred99_SiddhiQLGrammar
    public final void synpred99_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:3: ( longVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:3: longVal
        {
        pushFollow(FOLLOW_longVal_in_synpred99_SiddhiQLGrammar2357);
        longVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_SiddhiQLGrammar

    // $ANTLR start synpred100_SiddhiQLGrammar
    public final void synpred100_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:3: ( floatVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:3: floatVal
        {
        pushFollow(FOLLOW_floatVal_in_synpred100_SiddhiQLGrammar2370);
        floatVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_SiddhiQLGrammar

    // $ANTLR start synpred101_SiddhiQLGrammar
    public final void synpred101_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:3: ( doubleVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:3: doubleVal
        {
        pushFollow(FOLLOW_doubleVal_in_synpred101_SiddhiQLGrammar2384);
        doubleVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred101_SiddhiQLGrammar

    // Delegated rules

    public final boolean synpred94_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_definitionStream_in_executionPlan257 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_query_in_executionPlan259 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_executionPlan263 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_definitionStream_in_executionPlan266 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_query_in_executionPlan268 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_executionPlan273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_definitionStream309 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_definitionStream311 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_streamId_in_definitionStream313 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_definitionStream316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IP_in_definitionStream318 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_definitionStream323 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeName_in_definitionStream325 = new BitSet(new long[]{0x0000000000000000L,0x0080002200901000L});
    public static final BitSet FOLLOW_type_in_definitionStream327 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_57_in_definitionStream330 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeName_in_definitionStream332 = new BitSet(new long[]{0x0000000000000000L,0x0080002200901000L});
    public static final BitSet FOLLOW_type_in_definitionStream334 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_54_in_definitionStream339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_query373 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_outputStream_in_query375 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_query377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_query396 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_query398 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_query400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_outputStream423 = new BitSet(new long[]{0x0000000000000000L,0x0000000400410200L});
    public static final BitSet FOLLOW_outputType_in_outputStream425 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_outputStream428 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_streamId_in_outputStream430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_outputStream433 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IP_in_outputStream435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_inputStream485 = new BitSet(new long[]{0x0020000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sequenceFullStream_in_inputStream489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternFullStream_in_inputStream503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinStream_in_inputStream520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_inputStream535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_inputStream545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_patternFullStream570 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream572 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_patternFullStream574 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_patternFullStream577 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_patternFullStream579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream601 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_patternFullStream605 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_patternFullStream607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rawStream_in_basicStream638 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_transformHandler_in_basicStream640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_basicStream644 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_basicStream646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_windowStream674 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream677 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream680 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_windowStream686 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_windowStream688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_windowStream717 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_returnQuery_in_windowStream719 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_windowStream721 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream724 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream727 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_windowStream733 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_windowStream735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_rawStream777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rawStream801 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_returnQuery_in_rawStream803 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rawStream805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream834 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream836 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream838 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream840 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream843 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream845 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream850 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream875 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream877 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream879 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream882 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream884 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream889 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream913 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream915 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream917 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream919 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream922 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream924 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream929 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_leftStream966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_leftStream974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_rightStream992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_rightStream1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_returnQuery1015 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_returnQuery1017 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_returnQuery1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_patternStream1041 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1045 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_patternStream1065 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_patternItem_in_patternStream1067 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1071 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_patternStream1097 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_patternStream1099 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_patternStream1100 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_patternStream1101 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1105 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_nonEveryPatternStream1136 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_nonEveryPatternStream1141 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceStream_in_sequenceFullStream1165 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_sequenceFullStream1168 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_sequenceFullStream1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1197 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sequenceStream1199 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1201 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_sequenceStream1205 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1207 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_patternItem1243 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1251 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_patternItem1253 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1261 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_patternItem1263 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_collect_in_patternItem1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_patternItem1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1292 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_sequenceItem1294 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1302 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_regex_in_sequenceItem1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_itemStream1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_itemStream1331 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rawStream_in_itemStream1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_regex1357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_regex1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_externalCall_in_outputProjection1377 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C901000L});
    public static final BitSet FOLLOW_outputAttributeList_in_outputProjection1380 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_groupBy_in_outputProjection1382 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_having_in_outputProjection1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_outputAttributeList1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1420 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_outputAttributeList1423 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1425 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_extensionOutFunction_in_outputItem1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1457 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_outputItem1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1474 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_outputItem1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1491 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_outputItem1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionOutFunction1518 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionOutFunction1520 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionOutFunction1522 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_extensionOutFunction1525 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionOutFunction1527 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionOutFunction1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_outFunction1555 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_outFunction1557 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_outFunction1559 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_outFunction1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_groupBy1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_groupBy1587 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1589 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_groupBy1592 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1594 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_91_in_having1619 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_having1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_externalCall1641 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_externalCall1643 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_externalCall1645 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_externalCall1647 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_externalCall1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_filterHandler1677 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_filterHandler1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_filterHandler1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_transformHandler1705 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_transform_in_transformHandler1707 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_transformHandler1709 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_extensibleId_in_transformHandler1711 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_transformHandler1715 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_transformHandler1717 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_transformHandler1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_windowHandler1748 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_window_in_windowHandler1750 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_windowHandler1753 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_extensibleId_in_windowHandler1755 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_windowHandler1759 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_windowHandler1761 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_windowHandler1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensibleId1792 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensibleId1794 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensibleId1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensibleId1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1825 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parameters1828 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameter_in_parameters1830 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_constant_in_time1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1877 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1879 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1886 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_collect1893 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStartAndEnd_in_collect1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStart1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countEnd1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionExpression_in_condition1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_conditionExpression1956 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_conditionExpression1959 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compareCondition_in_andCondition1976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_andCondition1979 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_andCondition1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_compareCondition1994 = new BitSet(new long[]{0x8004000000000000L,0x000000010000801DL});
    public static final BitSet FOLLOW_compareOperation_in_compareCondition1996 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_compareCondition1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_compareCondition2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_compareCondition2010 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_compareCondition2011 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_compareCondition2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notCondition_in_compareCondition2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionCondition_in_compareCondition2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusExpression_in_expression2044 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expression2047 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExpression_in_minusExpression2068 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_minusExpression2071 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_minusExpression_in_minusExpression2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divisionExpression_in_multiplyExpression2092 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_multiplyExpression2095 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_multiplyExpression_in_multiplyExpression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modExpression_in_divisionExpression2116 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_divisionExpression2119 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_divisionExpression_in_divisionExpression2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpression_in_modExpression2140 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_modExpression2143 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_modExpression_in_modExpression2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpression2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_valueExpression2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_valueExpression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_valueExpression2189 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_valueExpression2190 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_valueExpression2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpression_in_valueExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_notCondition2217 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_notCondition2219 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_notCondition2220 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_notCondition2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionCondition2246 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionCondition2248 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionCondition2250 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_extensionCondition2254 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionCondition2256 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionCondition2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionExpression2297 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionExpression2299 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionExpression2301 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_extensionExpression2305 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionExpression2307 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionExpression2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intVal_in_constant2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_longVal_in_constant2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatVal_in_constant2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleVal_in_constant2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_constant2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringVal_in_constant2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_constant2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_streamId2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamPositionAttributeName_in_attributeVariable2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamAttributeName_in_attributeVariable2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeVariable2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_streamPositionAttributeName2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_streamPositionAttributeName2465 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_streamPositionAttributeName2467 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_streamPositionAttributeName2468 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_streamPositionAttributeName2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_streamAttributeName2497 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_streamAttributeName2499 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_streamAttributeName2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attributeName2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_join2547 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_join2568 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_join2589 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_join2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_join2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_join2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_window2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_transform2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearValue_in_timeExpr2745 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_monthValue_in_timeExpr2750 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_weekValue_in_timeExpr2755 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dayValue_in_timeExpr2760 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_hourValue_in_timeExpr2765 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_minuteValue_in_timeExpr2770 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_secondValue_in_timeExpr2775 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_milliSecondValue_in_timeExpr2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_yearValue2827 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_yearValue2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_monthValue2847 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_monthValue2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_weekValue2867 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_set_in_weekValue2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_dayValue2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_dayValue2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_hourValue2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_set_in_hourValue2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_minuteValue2930 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_set_in_minuteValue2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_secondValue2958 = new BitSet(new long[]{0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_set_in_secondValue2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2988 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_milliSecondValue2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_intVal3009 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_intVal3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_longVal3031 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_POSITIVE_LONG_VAL_in_longVal3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_floatVal3053 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_doubleVal3075 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_VAL_in_boolVal3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensionId3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_functionId3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_VAL_in_stringVal3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_synpred7_SiddhiQLGrammar373 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_outputStream_in_synpred7_SiddhiQLGrammar375 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_synpred7_SiddhiQLGrammar377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceFullStream_in_synpred12_SiddhiQLGrammar489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternFullStream_in_synpred13_SiddhiQLGrammar503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinStream_in_synpred14_SiddhiQLGrammar520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred15_SiddhiQLGrammar535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred33_SiddhiQLGrammar834 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_synpred33_SiddhiQLGrammar836 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_synpred33_SiddhiQLGrammar838 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_synpred33_SiddhiQLGrammar840 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_synpred33_SiddhiQLGrammar843 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_synpred33_SiddhiQLGrammar845 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred33_SiddhiQLGrammar850 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_synpred33_SiddhiQLGrammar852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred36_SiddhiQLGrammar875 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_synpred36_SiddhiQLGrammar877 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_synpred36_SiddhiQLGrammar879 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_synpred36_SiddhiQLGrammar882 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_synpred36_SiddhiQLGrammar884 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred36_SiddhiQLGrammar889 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_synpred36_SiddhiQLGrammar891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred39_SiddhiQLGrammar966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred40_SiddhiQLGrammar992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred49_SiddhiQLGrammar1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred49_SiddhiQLGrammar1243 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred49_SiddhiQLGrammar1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1251 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred50_SiddhiQLGrammar1253 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1261 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_synpred51_SiddhiQLGrammar1263 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_collect_in_synpred51_SiddhiQLGrammar1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_synpred51_SiddhiQLGrammar1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1292 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred52_SiddhiQLGrammar1294 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1302 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_regex_in_synpred53_SiddhiQLGrammar1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionOutFunction_in_synpred63_SiddhiQLGrammar1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred63_SiddhiQLGrammar1457 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred63_SiddhiQLGrammar1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_synpred64_SiddhiQLGrammar1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred64_SiddhiQLGrammar1474 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred64_SiddhiQLGrammar1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred65_SiddhiQLGrammar1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred65_SiddhiQLGrammar1491 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred65_SiddhiQLGrammar1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred66_SiddhiQLGrammar1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred67_SiddhiQLGrammar1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred69_SiddhiQLGrammar1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred70_SiddhiQLGrammar1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred72_SiddhiQLGrammar1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_synpred79_SiddhiQLGrammar1959 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_synpred79_SiddhiQLGrammar1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred81_SiddhiQLGrammar1994 = new BitSet(new long[]{0x8004000000000000L,0x000000010000801DL});
    public static final BitSet FOLLOW_compareOperation_in_synpred81_SiddhiQLGrammar1996 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_synpred81_SiddhiQLGrammar1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_synpred82_SiddhiQLGrammar2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred83_SiddhiQLGrammar2010 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_synpred83_SiddhiQLGrammar2011 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred83_SiddhiQLGrammar2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred94_SiddhiQLGrammar2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred96_SiddhiQLGrammar2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intVal_in_synpred98_SiddhiQLGrammar2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_longVal_in_synpred99_SiddhiQLGrammar2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatVal_in_synpred100_SiddhiQLGrammar2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleVal_in_synpred101_SiddhiQLGrammar2384 = new BitSet(new long[]{0x0000000000000002L});

}