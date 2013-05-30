// $ANTLR 3.4 org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g 2013-05-30 13:32:25

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
            // elements: attributeName, IP, type, streamId
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
                    // elements: inputStream, outputStream, outputProjection
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
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:88:1: outputStream : 'insert' ( outputType )? 'into' streamId ( '@' IP ( ',' IP )* )? -> ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? ) ;
    public final SiddhiQLGrammarParser.outputStream_return outputStream() throws RecognitionException {
        SiddhiQLGrammarParser.outputStream_return retval = new SiddhiQLGrammarParser.outputStream_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal25=null;
        Token string_literal27=null;
        Token char_literal29=null;
        Token IP30=null;
        Token char_literal31=null;
        Token IP32=null;
        SiddhiQLGrammarParser.outputType_return outputType26 =null;

        SiddhiQLGrammarParser.streamId_return streamId28 =null;


        CommonTree string_literal25_tree=null;
        CommonTree string_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree IP30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree IP32_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_IP=new RewriteRuleTokenStream(adaptor,"token IP");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_outputType=new RewriteRuleSubtreeStream(adaptor,"rule outputType");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:2: ( 'insert' ( outputType )? 'into' streamId ( '@' IP ( ',' IP )* )? -> ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:3: 'insert' ( outputType )? 'into' streamId ( '@' IP ( ',' IP )* )?
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

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:40: ( '@' IP ( ',' IP )* )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case 70:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:41: '@' IP ( ',' IP )*
                    {
                    char_literal29=(Token)match(input,70,FOLLOW_70_in_outputStream433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal29);


                    IP30=(Token)match(input,IP,FOLLOW_IP_in_outputStream435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IP.add(IP30);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:48: ( ',' IP )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case 57:
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:49: ',' IP
                    	    {
                    	    char_literal31=(Token)match(input,57,FOLLOW_57_in_outputStream438); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_57.add(char_literal31);


                    	    IP32=(Token)match(input,IP,FOLLOW_IP_in_outputStream440); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IP.add(IP32);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


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
            // 89:64: -> ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? )
            {
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:69: ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OUT_STREAM, "OUT_STREAM")
                , root_1);

                adaptor.addChild(root_1, stream_streamId.nextTree());

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:91: ( outputType )?
                if ( stream_outputType.hasNext() ) {
                    adaptor.addChild(root_1, stream_outputType.nextTree());

                }
                stream_outputType.reset();

                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:89:103: ( ( IP )+ )?
                if ( stream_IP.hasNext() ) {
                    if ( !(stream_IP.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_IP.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_IP.nextNode()
                        );

                    }
                    stream_IP.reset();

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

        Token set33=null;

        CommonTree set33_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:93:2: ( 'expired-events' | 'current-events' | 'all-events' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set33=(Token)input.LT(1);

            if ( input.LA(1)==73||input.LA(1)==80||input.LA(1)==86 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set33)
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

        Token string_literal34=null;
        SiddhiQLGrammarParser.sequenceFullStream_return sequenceFullStream35 =null;

        SiddhiQLGrammarParser.patternFullStream_return patternFullStream36 =null;

        SiddhiQLGrammarParser.joinStream_return joinStream37 =null;

        SiddhiQLGrammarParser.windowStream_return windowStream38 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream39 =null;


        CommonTree string_literal34_tree=null;
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
            string_literal34=(Token)match(input,88,FOLLOW_88_in_inputStream499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal34);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:10: ( sequenceFullStream -> ^( SEQUENCE_FULL sequenceFullStream ) | patternFullStream -> ^( PATTERN_FULL patternFullStream ) | joinStream -> ^( JOIN joinStream ) | windowStream -> windowStream | basicStream -> basicStream )
            int alt11=5;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred13_SiddhiQLGrammar()) ) {
                    alt11=1;
                }
                else if ( (synpred14_SiddhiQLGrammar()) ) {
                    alt11=2;
                }
                else if ( (synpred15_SiddhiQLGrammar()) ) {
                    alt11=3;
                }
                else if ( (synpred16_SiddhiQLGrammar()) ) {
                    alt11=4;
                }
                else if ( (true) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred14_SiddhiQLGrammar()) ) {
                    alt11=2;
                }
                else if ( (synpred15_SiddhiQLGrammar()) ) {
                    alt11=3;
                }
                else if ( (synpred16_SiddhiQLGrammar()) ) {
                    alt11=4;
                }
                else if ( (true) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case 85:
                {
                alt11=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: sequenceFullStream
                    {
                    pushFollow(FOLLOW_sequenceFullStream_in_inputStream503);
                    sequenceFullStream35=sequenceFullStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sequenceFullStream.add(sequenceFullStream35.getTree());

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
                    pushFollow(FOLLOW_patternFullStream_in_inputStream517);
                    patternFullStream36=patternFullStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternFullStream.add(patternFullStream36.getTree());

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
                    pushFollow(FOLLOW_joinStream_in_inputStream534);
                    joinStream37=joinStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_joinStream.add(joinStream37.getTree());

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
                    pushFollow(FOLLOW_windowStream_in_inputStream549);
                    windowStream38=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowStream.add(windowStream38.getTree());

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
                    pushFollow(FOLLOW_basicStream_in_inputStream559);
                    basicStream39=basicStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_basicStream.add(basicStream39.getTree());

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

        Token char_literal40=null;
        Token char_literal42=null;
        Token string_literal43=null;
        Token string_literal46=null;
        SiddhiQLGrammarParser.patternStream_return patternStream41 =null;

        SiddhiQLGrammarParser.time_return time44 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream45 =null;

        SiddhiQLGrammarParser.time_return time47 =null;


        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree string_literal46_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_patternStream=new RewriteRuleSubtreeStream(adaptor,"rule patternStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:2: ( '(' patternStream ')' ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) | patternStream ( 'within' time )? -> ^( PATTERN patternStream ( time )? ) )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt14=1;
                }
                break;
            case ID:
            case ID_QUOTES:
            case 85:
                {
                alt14=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:3: '(' patternStream ')' ( 'within' time )?
                    {
                    char_literal40=(Token)match(input,53,FOLLOW_53_in_patternFullStream584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal40);


                    pushFollow(FOLLOW_patternStream_in_patternFullStream586);
                    patternStream41=patternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternStream.add(patternStream41.getTree());

                    char_literal42=(Token)match(input,54,FOLLOW_54_in_patternFullStream588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal42);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:25: ( 'within' time )?
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
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:107:26: 'within' time
                            {
                            string_literal43=(Token)match(input,125,FOLLOW_125_in_patternFullStream591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal43);


                            pushFollow(FOLLOW_time_in_patternFullStream593);
                            time44=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time44.getTree());

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
                    pushFollow(FOLLOW_patternStream_in_patternFullStream615);
                    patternStream45=patternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternStream.add(patternStream45.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:18: ( 'within' time )?
                    int alt13=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt13=1;
                            }
                            break;
                    }

                    switch (alt13) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:108:19: 'within' time
                            {
                            string_literal46=(Token)match(input,125,FOLLOW_125_in_patternFullStream619); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal46);


                            pushFollow(FOLLOW_time_in_patternFullStream621);
                            time47=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time47.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: time, patternStream
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

        Token string_literal50=null;
        SiddhiQLGrammarParser.rawStream_return rawStream48 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler49 =null;

        SiddhiQLGrammarParser.id_return id51 =null;


        CommonTree string_literal50_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_rawStream=new RewriteRuleSubtreeStream(adaptor,"rule rawStream");
        RewriteRuleSubtreeStream stream_transformHandler=new RewriteRuleSubtreeStream(adaptor,"rule transformHandler");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:2: ( rawStream ( transformHandler )? ( 'as' id )? -> ^( STREAM rawStream ( transformHandler )? ( id )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:4: rawStream ( transformHandler )? ( 'as' id )?
            {
            pushFollow(FOLLOW_rawStream_in_basicStream652);
            rawStream48=rawStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rawStream.add(rawStream48.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:14: ( transformHandler )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case 51:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:14: transformHandler
                    {
                    pushFollow(FOLLOW_transformHandler_in_basicStream654);
                    transformHandler49=transformHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler49.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:32: ( 'as' id )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case 75:
                    {
                    alt16=1;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:112:33: 'as' id
                    {
                    string_literal50=(Token)match(input,75,FOLLOW_75_in_basicStream658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal50);


                    pushFollow(FOLLOW_id_in_basicStream660);
                    id51=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id51.getTree());

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

        Token string_literal56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token string_literal64=null;
        SiddhiQLGrammarParser.streamId_return streamId52 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler53 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler54 =null;

        SiddhiQLGrammarParser.windowHandler_return windowHandler55 =null;

        SiddhiQLGrammarParser.id_return id57 =null;

        SiddhiQLGrammarParser.returnQuery_return returnQuery59 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler61 =null;

        SiddhiQLGrammarParser.transformHandler_return transformHandler62 =null;

        SiddhiQLGrammarParser.windowHandler_return windowHandler63 =null;

        SiddhiQLGrammarParser.id_return id65 =null;


        CommonTree string_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree string_literal64_tree=null;
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
            int alt23=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:4: streamId ( filterHandler )? ( transformHandler )? windowHandler ( 'as' id )?
                    {
                    pushFollow(FOLLOW_streamId_in_windowStream688);
                    streamId52=streamId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_streamId.add(streamId52.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:14: ( filterHandler )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:14: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream691);
                            filterHandler53=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler53.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:29: ( transformHandler )?
                    int alt18=2;
                    switch ( input.LA(1) ) {
                        case 51:
                            {
                            switch ( input.LA(2) ) {
                                case 120:
                                    {
                                    alt18=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt18) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:29: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream694);
                            transformHandler54=transformHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler54.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream697);
                    windowHandler55=windowHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowHandler.add(windowHandler55.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:61: ( 'as' id )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case 75:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:116:62: 'as' id
                            {
                            string_literal56=(Token)match(input,75,FOLLOW_75_in_windowStream700); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal56);


                            pushFollow(FOLLOW_id_in_windowStream702);
                            id57=id();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id.add(id57.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: filterHandler, streamId, id, windowHandler, transformHandler
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
                    char_literal58=(Token)match(input,53,FOLLOW_53_in_windowStream731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal58);


                    pushFollow(FOLLOW_returnQuery_in_windowStream733);
                    returnQuery59=returnQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_returnQuery.add(returnQuery59.getTree());

                    char_literal60=(Token)match(input,54,FOLLOW_54_in_windowStream735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal60);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:25: ( filterHandler )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:25: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream738);
                            filterHandler61=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler61.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:40: ( transformHandler )?
                    int alt21=2;
                    switch ( input.LA(1) ) {
                        case 51:
                            {
                            switch ( input.LA(2) ) {
                                case 120:
                                    {
                                    alt21=1;
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    switch (alt21) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:40: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream741);
                            transformHandler62=transformHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_transformHandler.add(transformHandler62.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream744);
                    windowHandler63=windowHandler();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_windowHandler.add(windowHandler63.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:72: ( 'as' id )?
                    int alt22=2;
                    switch ( input.LA(1) ) {
                        case 75:
                            {
                            alt22=1;
                            }
                            break;
                    }

                    switch (alt22) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:117:73: 'as' id
                            {
                            string_literal64=(Token)match(input,75,FOLLOW_75_in_windowStream747); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_75.add(string_literal64);


                            pushFollow(FOLLOW_id_in_windowStream749);
                            id65=id();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id.add(id65.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: windowHandler, returnQuery, transformHandler, filterHandler, id
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

        Token char_literal68=null;
        Token char_literal70=null;
        SiddhiQLGrammarParser.streamId_return streamId66 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler67 =null;

        SiddhiQLGrammarParser.returnQuery_return returnQuery69 =null;

        SiddhiQLGrammarParser.filterHandler_return filterHandler71 =null;


        CommonTree char_literal68_tree=null;
        CommonTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        RewriteRuleSubtreeStream stream_filterHandler=new RewriteRuleSubtreeStream(adaptor,"rule filterHandler");
        RewriteRuleSubtreeStream stream_returnQuery=new RewriteRuleSubtreeStream(adaptor,"rule returnQuery");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:2: ( streamId ( filterHandler )? -> ^( streamId ( filterHandler )? ) | '(' returnQuery ')' ( filterHandler )? -> ^( ANONYMOUS returnQuery ( filterHandler )? ) )
            int alt26=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:4: streamId ( filterHandler )?
                    {
                    pushFollow(FOLLOW_streamId_in_rawStream791);
                    streamId66=streamId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_streamId.add(streamId66.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:14: ( filterHandler )?
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
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:121:14: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream794);
                            filterHandler67=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler67.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: filterHandler, streamId
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
                    char_literal68=(Token)match(input,53,FOLLOW_53_in_rawStream815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal68);


                    pushFollow(FOLLOW_returnQuery_in_rawStream817);
                    returnQuery69=returnQuery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_returnQuery.add(returnQuery69.getTree());

                    char_literal70=(Token)match(input,54,FOLLOW_54_in_rawStream819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal70);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:25: ( filterHandler )?
                    int alt25=2;
                    switch ( input.LA(1) ) {
                        case 71:
                            {
                            alt25=1;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:122:25: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream822);
                            filterHandler71=filterHandler();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_filterHandler.add(filterHandler71.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: filterHandler, returnQuery
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

        Token string_literal75=null;
        Token string_literal76=null;
        Token string_literal78=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token string_literal88=null;
        Token string_literal91=null;
        Token string_literal93=null;
        SiddhiQLGrammarParser.leftStream_return leftStream72 =null;

        SiddhiQLGrammarParser.join_return join73 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream74 =null;

        SiddhiQLGrammarParser.condition_return condition77 =null;

        SiddhiQLGrammarParser.time_return time79 =null;

        SiddhiQLGrammarParser.leftStream_return leftStream80 =null;

        SiddhiQLGrammarParser.join_return join81 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream82 =null;

        SiddhiQLGrammarParser.condition_return condition84 =null;

        SiddhiQLGrammarParser.time_return time86 =null;

        SiddhiQLGrammarParser.leftStream_return leftStream87 =null;

        SiddhiQLGrammarParser.join_return join89 =null;

        SiddhiQLGrammarParser.rightStream_return rightStream90 =null;

        SiddhiQLGrammarParser.condition_return condition92 =null;

        SiddhiQLGrammarParser.time_return time94 =null;


        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal93_tree=null;
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
            int alt33=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred34_SiddhiQLGrammar()) ) {
                    alt33=1;
                }
                else if ( (synpred37_SiddhiQLGrammar()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
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

                if ( (synpred34_SiddhiQLGrammar()) ) {
                    alt33=1;
                }
                else if ( (synpred37_SiddhiQLGrammar()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream848);
                    leftStream72=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream72.getTree());

                    pushFollow(FOLLOW_join_in_joinStream850);
                    join73=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join73.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream852);
                    rightStream74=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream74.getTree());

                    string_literal75=(Token)match(input,121,FOLLOW_121_in_joinStream854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal75);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:48: ( 'on' condition )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:49: 'on' condition
                            {
                            string_literal76=(Token)match(input,110,FOLLOW_110_in_joinStream857); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal76);


                            pushFollow(FOLLOW_condition_in_joinStream859);
                            condition77=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition77.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:66: ( 'within' time )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt28=1;
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:67: 'within' time
                            {
                            string_literal78=(Token)match(input,125,FOLLOW_125_in_joinStream864); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal78);


                            pushFollow(FOLLOW_time_in_joinStream866);
                            time79=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time79.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: condition, time, join, 121, leftStream, rightStream
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
                    pushFollow(FOLLOW_leftStream_in_joinStream889);
                    leftStream80=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream80.getTree());

                    pushFollow(FOLLOW_join_in_joinStream891);
                    join81=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join81.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream893);
                    rightStream82=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream82.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:31: ( 'on' condition )?
                    int alt29=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt29=1;
                            }
                            break;
                    }

                    switch (alt29) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:32: 'on' condition
                            {
                            string_literal83=(Token)match(input,110,FOLLOW_110_in_joinStream896); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal83);


                            pushFollow(FOLLOW_condition_in_joinStream898);
                            condition84=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition84.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:49: ( 'within' time )?
                    int alt30=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt30=1;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:50: 'within' time
                            {
                            string_literal85=(Token)match(input,125,FOLLOW_125_in_joinStream903); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal85);


                            pushFollow(FOLLOW_time_in_joinStream905);
                            time86=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time86.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: join, time, condition, rightStream, leftStream
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
                    pushFollow(FOLLOW_leftStream_in_joinStream927);
                    leftStream87=leftStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_leftStream.add(leftStream87.getTree());

                    string_literal88=(Token)match(input,121,FOLLOW_121_in_joinStream929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal88);


                    pushFollow(FOLLOW_join_in_joinStream931);
                    join89=join();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join.add(join89.getTree());

                    pushFollow(FOLLOW_rightStream_in_joinStream933);
                    rightStream90=rightStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rightStream.add(rightStream90.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:48: ( 'on' condition )?
                    int alt31=2;
                    switch ( input.LA(1) ) {
                        case 110:
                            {
                            alt31=1;
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:49: 'on' condition
                            {
                            string_literal91=(Token)match(input,110,FOLLOW_110_in_joinStream936); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(string_literal91);


                            pushFollow(FOLLOW_condition_in_joinStream938);
                            condition92=condition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_condition.add(condition92.getTree());

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:66: ( 'within' time )?
                    int alt32=2;
                    switch ( input.LA(1) ) {
                        case 125:
                            {
                            alt32=1;
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:128:67: 'within' time
                            {
                            string_literal93=(Token)match(input,125,FOLLOW_125_in_joinStream943); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal93);


                            pushFollow(FOLLOW_time_in_joinStream945);
                            time94=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time94.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: time, condition, 121, join, leftStream, rightStream
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

        SiddhiQLGrammarParser.windowStream_return windowStream95 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream96 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:5: ( windowStream | basicStream )
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: windowStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_windowStream_in_leftStream980);
                    windowStream95=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, windowStream95.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:133:7: basicStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_basicStream_in_leftStream988);
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

        SiddhiQLGrammarParser.windowStream_return windowStream97 =null;

        SiddhiQLGrammarParser.basicStream_return basicStream98 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:5: ( windowStream | basicStream )
            int alt35=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA35_1 = input.LA(2);

                if ( (synpred41_SiddhiQLGrammar()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA35_2 = input.LA(2);

                if ( (synpred41_SiddhiQLGrammar()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: windowStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_windowStream_in_rightStream1006);
                    windowStream97=windowStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, windowStream97.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:138:8: basicStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_basicStream_in_rightStream1015);
                    basicStream98=basicStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, basicStream98.getTree());

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

        Token string_literal100=null;
        SiddhiQLGrammarParser.inputStream_return inputStream99 =null;

        SiddhiQLGrammarParser.outputProjection_return outputProjection101 =null;


        CommonTree string_literal100_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_outputProjection=new RewriteRuleSubtreeStream(adaptor,"rule outputProjection");
        RewriteRuleSubtreeStream stream_inputStream=new RewriteRuleSubtreeStream(adaptor,"rule inputStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:142:2: ( inputStream 'return' outputProjection -> ^( RETURN_QUERY inputStream outputProjection ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:142:4: inputStream 'return' outputProjection
            {
            pushFollow(FOLLOW_inputStream_in_returnQuery1029);
            inputStream99=inputStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inputStream.add(inputStream99.getTree());

            string_literal100=(Token)match(input,113,FOLLOW_113_in_returnQuery1031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal100);


            pushFollow(FOLLOW_outputProjection_in_returnQuery1033);
            outputProjection101=outputProjection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_outputProjection.add(outputProjection101.getTree());

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

        Token FOLLOWED_BY103=null;
        Token string_literal105=null;
        Token FOLLOWED_BY107=null;
        Token string_literal109=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token FOLLOWED_BY113=null;
        SiddhiQLGrammarParser.patternItem_return patternItem102 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream104 =null;

        SiddhiQLGrammarParser.patternItem_return patternItem106 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream108 =null;

        SiddhiQLGrammarParser.nonEveryPatternStream_return nonEveryPatternStream111 =null;

        SiddhiQLGrammarParser.patternStream_return patternStream114 =null;


        CommonTree FOLLOWED_BY103_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree FOLLOWED_BY107_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree FOLLOWED_BY113_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_FOLLOWED_BY=new RewriteRuleTokenStream(adaptor,"token FOLLOWED_BY");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_nonEveryPatternStream=new RewriteRuleSubtreeStream(adaptor,"rule nonEveryPatternStream");
        RewriteRuleSubtreeStream stream_patternStream=new RewriteRuleSubtreeStream(adaptor,"rule patternStream");
        RewriteRuleSubtreeStream stream_patternItem=new RewriteRuleSubtreeStream(adaptor,"rule patternItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:2: ( patternItem ( FOLLOWED_BY patternStream )? -> patternItem ( patternStream )? | 'every' patternItem ( FOLLOWED_BY patternStream )? -> ^( 'every' patternItem ) ( patternStream )? | 'every' '(' nonEveryPatternStream ')' ( FOLLOWED_BY patternStream )? -> ^( 'every' nonEveryPatternStream ) ( patternStream )? )
            int alt39=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt39=1;
                }
                break;
            case 85:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt39=3;
                    }
                    break;
                case ID:
                case ID_QUOTES:
                    {
                    alt39=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:4: patternItem ( FOLLOWED_BY patternStream )?
                    {
                    pushFollow(FOLLOW_patternItem_in_patternStream1055);
                    patternItem102=patternItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternItem.add(patternItem102.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:16: ( FOLLOWED_BY patternStream )?
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
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:146:18: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY103=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1059); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY103);


                            pushFollow(FOLLOW_patternStream_in_patternStream1061);
                            patternStream104=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream104.getTree());

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
                    string_literal105=(Token)match(input,85,FOLLOW_85_in_patternStream1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal105);


                    pushFollow(FOLLOW_patternItem_in_patternStream1081);
                    patternItem106=patternItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_patternItem.add(patternItem106.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:24: ( FOLLOWED_BY patternStream )?
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
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:147:26: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY107=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1085); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY107);


                            pushFollow(FOLLOW_patternStream_in_patternStream1087);
                            patternStream108=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream108.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: patternStream, patternItem, 85
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
                    string_literal109=(Token)match(input,85,FOLLOW_85_in_patternStream1111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_85.add(string_literal109);


                    char_literal110=(Token)match(input,53,FOLLOW_53_in_patternStream1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal110);


                    pushFollow(FOLLOW_nonEveryPatternStream_in_patternStream1114);
                    nonEveryPatternStream111=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonEveryPatternStream.add(nonEveryPatternStream111.getTree());

                    char_literal112=(Token)match(input,54,FOLLOW_54_in_patternStream1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal112);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:40: ( FOLLOWED_BY patternStream )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case FOLLOWED_BY:
                            {
                            alt38=1;
                            }
                            break;
                    }

                    switch (alt38) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:148:42: FOLLOWED_BY patternStream
                            {
                            FOLLOWED_BY113=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_patternStream1119); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY113);


                            pushFollow(FOLLOW_patternStream_in_patternStream1121);
                            patternStream114=patternStream();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_patternStream.add(patternStream114.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: nonEveryPatternStream, 85, patternStream
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

        Token FOLLOWED_BY116=null;
        SiddhiQLGrammarParser.patternItem_return patternItem115 =null;

        SiddhiQLGrammarParser.nonEveryPatternStream_return nonEveryPatternStream117 =null;


        CommonTree FOLLOWED_BY116_tree=null;
        RewriteRuleTokenStream stream_FOLLOWED_BY=new RewriteRuleTokenStream(adaptor,"token FOLLOWED_BY");
        RewriteRuleSubtreeStream stream_nonEveryPatternStream=new RewriteRuleSubtreeStream(adaptor,"rule nonEveryPatternStream");
        RewriteRuleSubtreeStream stream_patternItem=new RewriteRuleSubtreeStream(adaptor,"rule patternItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:2: ( patternItem ( FOLLOWED_BY nonEveryPatternStream )? -> patternItem ( nonEveryPatternStream )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:4: patternItem ( FOLLOWED_BY nonEveryPatternStream )?
            {
            pushFollow(FOLLOW_patternItem_in_nonEveryPatternStream1150);
            patternItem115=patternItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_patternItem.add(patternItem115.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:17: ( FOLLOWED_BY nonEveryPatternStream )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case FOLLOWED_BY:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:152:19: FOLLOWED_BY nonEveryPatternStream
                    {
                    FOLLOWED_BY116=(Token)match(input,FOLLOWED_BY,FOLLOW_FOLLOWED_BY_in_nonEveryPatternStream1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOLLOWED_BY.add(FOLLOWED_BY116);


                    pushFollow(FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream1157);
                    nonEveryPatternStream117=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nonEveryPatternStream.add(nonEveryPatternStream117.getTree());

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

        Token string_literal119=null;
        SiddhiQLGrammarParser.sequenceStream_return sequenceStream118 =null;

        SiddhiQLGrammarParser.time_return time120 =null;


        CommonTree string_literal119_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_sequenceStream=new RewriteRuleSubtreeStream(adaptor,"rule sequenceStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:2: ( sequenceStream ( 'within' time )? -> ^( SEQUENCE sequenceStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:3: sequenceStream ( 'within' time )?
            {
            pushFollow(FOLLOW_sequenceStream_in_sequenceFullStream1179);
            sequenceStream118=sequenceStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceStream.add(sequenceStream118.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:18: ( 'within' time )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case 125:
                    {
                    alt41=1;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:156:19: 'within' time
                    {
                    string_literal119=(Token)match(input,125,FOLLOW_125_in_sequenceFullStream1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal119);


                    pushFollow(FOLLOW_time_in_sequenceFullStream1184);
                    time120=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time120.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: sequenceStream, time
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

        Token char_literal122=null;
        Token char_literal124=null;
        SiddhiQLGrammarParser.sequenceItem_return sequenceItem121 =null;

        SiddhiQLGrammarParser.sequenceItem_return sequenceItem123 =null;

        SiddhiQLGrammarParser.sequenceItem_return sequenceItem125 =null;


        CommonTree char_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_sequenceItem=new RewriteRuleSubtreeStream(adaptor,"rule sequenceItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:2: ( sequenceItem ',' sequenceItem ( ',' sequenceItem )* -> ( sequenceItem )+ )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:4: sequenceItem ',' sequenceItem ( ',' sequenceItem )*
            {
            pushFollow(FOLLOW_sequenceItem_in_sequenceStream1211);
            sequenceItem121=sequenceItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem121.getTree());

            char_literal122=(Token)match(input,57,FOLLOW_57_in_sequenceStream1213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal122);


            pushFollow(FOLLOW_sequenceItem_in_sequenceStream1215);
            sequenceItem123=sequenceItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem123.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:35: ( ',' sequenceItem )*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt42=1;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:160:36: ',' sequenceItem
            	    {
            	    char_literal124=(Token)match(input,57,FOLLOW_57_in_sequenceStream1219); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal124);


            	    pushFollow(FOLLOW_sequenceItem_in_sequenceStream1221);
            	    sequenceItem125=sequenceItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sequenceItem.add(sequenceItem125.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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

        Token string_literal127=null;
        Token string_literal130=null;
        Token char_literal133=null;
        Token char_literal135=null;
        SiddhiQLGrammarParser.itemStream_return itemStream126 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream128 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream129 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream131 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream132 =null;

        SiddhiQLGrammarParser.collect_return collect134 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream136 =null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_itemStream=new RewriteRuleSubtreeStream(adaptor,"rule itemStream");
        RewriteRuleSubtreeStream stream_collect=new RewriteRuleSubtreeStream(adaptor,"rule collect");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:2: ( itemStream 'and' ^ itemStream | itemStream 'or' ^ itemStream | itemStream '<' collect '>' -> ^( COLLECT itemStream collect ) | itemStream )
            int alt43=4;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA43_1 = input.LA(2);

                if ( (synpred50_SiddhiQLGrammar()) ) {
                    alt43=1;
                }
                else if ( (synpred51_SiddhiQLGrammar()) ) {
                    alt43=2;
                }
                else if ( (synpred52_SiddhiQLGrammar()) ) {
                    alt43=3;
                }
                else if ( (true) ) {
                    alt43=4;
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: itemStream 'and' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_patternItem1255);
                    itemStream126=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream126.getTree());

                    string_literal127=(Token)match(input,74,FOLLOW_74_in_patternItem1257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal127_tree = 
                    (CommonTree)adaptor.create(string_literal127)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal127_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_patternItem1260);
                    itemStream128=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream128.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: itemStream 'or' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_patternItem1265);
                    itemStream129=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream129.getTree());

                    string_literal130=(Token)match(input,111,FOLLOW_111_in_patternItem1267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal130_tree = 
                    (CommonTree)adaptor.create(string_literal130)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal130_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_patternItem1270);
                    itemStream131=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream131.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: itemStream '<' collect '>'
                    {
                    pushFollow(FOLLOW_itemStream_in_patternItem1275);
                    itemStream132=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_itemStream.add(itemStream132.getTree());

                    char_literal133=(Token)match(input,63,FOLLOW_63_in_patternItem1277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal133);


                    pushFollow(FOLLOW_collect_in_patternItem1278);
                    collect134=collect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collect.add(collect134.getTree());

                    char_literal135=(Token)match(input,67,FOLLOW_67_in_patternItem1280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal135);


                    // AST REWRITE
                    // elements: itemStream, collect
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


                    pushFollow(FOLLOW_itemStream_in_patternItem1295);
                    itemStream136=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream136.getTree());

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

        Token string_literal138=null;
        SiddhiQLGrammarParser.itemStream_return itemStream137 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream139 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream140 =null;

        SiddhiQLGrammarParser.regex_return regex141 =null;

        SiddhiQLGrammarParser.itemStream_return itemStream142 =null;


        CommonTree string_literal138_tree=null;
        RewriteRuleSubtreeStream stream_itemStream=new RewriteRuleSubtreeStream(adaptor,"rule itemStream");
        RewriteRuleSubtreeStream stream_regex=new RewriteRuleSubtreeStream(adaptor,"rule regex");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:2: ( itemStream 'or' ^ itemStream | itemStream regex -> ^( REGEX itemStream regex ) | itemStream )
            int alt44=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred53_SiddhiQLGrammar()) ) {
                    alt44=1;
                }
                else if ( (synpred54_SiddhiQLGrammar()) ) {
                    alt44=2;
                }
                else if ( (true) ) {
                    alt44=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: itemStream 'or' ^ itemStream
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_itemStream_in_sequenceItem1306);
                    itemStream137=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream137.getTree());

                    string_literal138=(Token)match(input,111,FOLLOW_111_in_sequenceItem1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal138_tree = 
                    (CommonTree)adaptor.create(string_literal138)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal138_tree, root_0);
                    }

                    pushFollow(FOLLOW_itemStream_in_sequenceItem1311);
                    itemStream139=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream139.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: itemStream regex
                    {
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1316);
                    itemStream140=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_itemStream.add(itemStream140.getTree());

                    pushFollow(FOLLOW_regex_in_sequenceItem1318);
                    regex141=regex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_regex.add(regex141.getTree());

                    // AST REWRITE
                    // elements: itemStream, regex
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


                    pushFollow(FOLLOW_itemStream_in_sequenceItem1333);
                    itemStream142=itemStream();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itemStream142.getTree());

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

        Token char_literal144=null;
        SiddhiQLGrammarParser.attributeName_return attributeName143 =null;

        SiddhiQLGrammarParser.rawStream_return rawStream145 =null;


        CommonTree char_literal144_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_rawStream=new RewriteRuleSubtreeStream(adaptor,"rule rawStream");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:2: ( attributeName '=' rawStream -> ^( STREAM rawStream ( attributeName )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:181:4: attributeName '=' rawStream
            {
            pushFollow(FOLLOW_attributeName_in_itemStream1344);
            attributeName143=attributeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attributeName.add(attributeName143.getTree());

            char_literal144=(Token)match(input,65,FOLLOW_65_in_itemStream1345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal144);


            pushFollow(FOLLOW_rawStream_in_itemStream1346);
            rawStream145=rawStream();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rawStream.add(rawStream145.getTree());

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

        Token set146=null;
        Token char_literal147=null;

        CommonTree set146_tree=null;
        CommonTree char_literal147_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:2: ( ( '*' | '+' | '?' ) ( '?' )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:4: ( '*' | '+' | '?' ) ( '?' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            set146=(Token)input.LT(1);

            if ( (input.LA(1) >= 55 && input.LA(1) <= 56)||input.LA(1)==69 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set146)
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
            int alt45=2;
            switch ( input.LA(1) ) {
                case 69:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:185:18: '?'
                    {
                    char_literal147=(Token)match(input,69,FOLLOW_69_in_regex1379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = 
                    (CommonTree)adaptor.create(char_literal147)
                    ;
                    adaptor.addChild(root_0, char_literal147_tree);
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

        SiddhiQLGrammarParser.externalCall_return externalCall148 =null;

        SiddhiQLGrammarParser.outputAttributeList_return outputAttributeList149 =null;

        SiddhiQLGrammarParser.groupBy_return groupBy150 =null;

        SiddhiQLGrammarParser.having_return having151 =null;


        RewriteRuleSubtreeStream stream_groupBy=new RewriteRuleSubtreeStream(adaptor,"rule groupBy");
        RewriteRuleSubtreeStream stream_externalCall=new RewriteRuleSubtreeStream(adaptor,"rule externalCall");
        RewriteRuleSubtreeStream stream_outputAttributeList=new RewriteRuleSubtreeStream(adaptor,"rule outputAttributeList");
        RewriteRuleSubtreeStream stream_having=new RewriteRuleSubtreeStream(adaptor,"rule having");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:2: ( ( externalCall )? outputAttributeList ( groupBy )? ( having )? -> ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: ( externalCall )? outputAttributeList ( groupBy )? ( having )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: ( externalCall )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case 78:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:4: externalCall
                    {
                    pushFollow(FOLLOW_externalCall_in_outputProjection1391);
                    externalCall148=externalCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_externalCall.add(externalCall148.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_outputAttributeList_in_outputProjection1394);
            outputAttributeList149=outputAttributeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_outputAttributeList.add(outputAttributeList149.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:38: ( groupBy )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case 90:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:38: groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_outputProjection1396);
                    groupBy150=groupBy();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_groupBy.add(groupBy150.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:47: ( having )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case 91:
                    {
                    alt48=1;
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:189:47: having
                    {
                    pushFollow(FOLLOW_having_in_outputProjection1399);
                    having151=having();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_having.add(having151.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: having, groupBy, outputAttributeList, externalCall
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

        Token char_literal152=null;
        Token char_literal154=null;
        SiddhiQLGrammarParser.outputItem_return outputItem153 =null;

        SiddhiQLGrammarParser.outputItem_return outputItem155 =null;


        CommonTree char_literal152_tree=null;
        CommonTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_outputItem=new RewriteRuleSubtreeStream(adaptor,"rule outputItem");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:193:2: ( '*' | outputItem ( ',' outputItem )* -> ( ^( OUT_ATTRIBUTE outputItem ) )+ | -> '*' )
            int alt50=3;
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
                    alt50=1;
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
                    alt50=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

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
                alt50=2;
                }
                break;
            case EOF:
            case 54:
            case 62:
            case 90:
            case 91:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:193:3: '*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal152=(Token)match(input,55,FOLLOW_55_in_outputAttributeList1429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal152_tree = 
                    (CommonTree)adaptor.create(char_literal152)
                    ;
                    adaptor.addChild(root_0, char_literal152_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:4: outputItem ( ',' outputItem )*
                    {
                    pushFollow(FOLLOW_outputItem_in_outputAttributeList1434);
                    outputItem153=outputItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputItem.add(outputItem153.getTree());

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:15: ( ',' outputItem )*
                    loop49:
                    do {
                        int alt49=2;
                        switch ( input.LA(1) ) {
                        case 57:
                            {
                            alt49=1;
                            }
                            break;

                        }

                        switch (alt49) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:194:16: ',' outputItem
                    	    {
                    	    char_literal154=(Token)match(input,57,FOLLOW_57_in_outputAttributeList1437); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_57.add(char_literal154);


                    	    pushFollow(FOLLOW_outputItem_in_outputAttributeList1439);
                    	    outputItem155=outputItem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_outputItem.add(outputItem155.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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

        Token string_literal157=null;
        Token string_literal160=null;
        Token string_literal163=null;
        SiddhiQLGrammarParser.extensionOutFunction_return extensionOutFunction156 =null;

        SiddhiQLGrammarParser.id_return id158 =null;

        SiddhiQLGrammarParser.outFunction_return outFunction159 =null;

        SiddhiQLGrammarParser.id_return id161 =null;

        SiddhiQLGrammarParser.expression_return expression162 =null;

        SiddhiQLGrammarParser.id_return id164 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable165 =null;


        CommonTree string_literal157_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree string_literal163_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_extensionOutFunction=new RewriteRuleSubtreeStream(adaptor,"rule extensionOutFunction");
        RewriteRuleSubtreeStream stream_outFunction=new RewriteRuleSubtreeStream(adaptor,"rule outFunction");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:2: ( extensionOutFunction 'as' id -> id extensionOutFunction | outFunction 'as' id -> outFunction id | expression 'as' id -> expression id | attributeVariable )
            int alt51=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA51_1 = input.LA(2);

                if ( (synpred64_SiddhiQLGrammar()) ) {
                    alt51=1;
                }
                else if ( (synpred65_SiddhiQLGrammar()) ) {
                    alt51=2;
                }
                else if ( (synpred66_SiddhiQLGrammar()) ) {
                    alt51=3;
                }
                else if ( (true) ) {
                    alt51=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID_QUOTES:
                {
                int LA51_2 = input.LA(2);

                if ( (synpred64_SiddhiQLGrammar()) ) {
                    alt51=1;
                }
                else if ( (synpred66_SiddhiQLGrammar()) ) {
                    alt51=3;
                }
                else if ( (true) ) {
                    alt51=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

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
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: extensionOutFunction 'as' id
                    {
                    pushFollow(FOLLOW_extensionOutFunction_in_outputItem1469);
                    extensionOutFunction156=extensionOutFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extensionOutFunction.add(extensionOutFunction156.getTree());

                    string_literal157=(Token)match(input,75,FOLLOW_75_in_outputItem1471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal157);


                    pushFollow(FOLLOW_id_in_outputItem1473);
                    id158=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id158.getTree());

                    // AST REWRITE
                    // elements: extensionOutFunction, id
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
                    pushFollow(FOLLOW_outFunction_in_outputItem1486);
                    outFunction159=outFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outFunction.add(outFunction159.getTree());

                    string_literal160=(Token)match(input,75,FOLLOW_75_in_outputItem1488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal160);


                    pushFollow(FOLLOW_id_in_outputItem1490);
                    id161=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id161.getTree());

                    // AST REWRITE
                    // elements: outFunction, id
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
                    pushFollow(FOLLOW_expression_in_outputItem1502);
                    expression162=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression162.getTree());

                    string_literal163=(Token)match(input,75,FOLLOW_75_in_outputItem1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal163);


                    pushFollow(FOLLOW_id_in_outputItem1507);
                    id164=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id164.getTree());

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


                    pushFollow(FOLLOW_attributeVariable_in_outputItem1521);
                    attributeVariable165=attributeVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeVariable165.getTree());

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

        Token char_literal167=null;
        Token char_literal169=null;
        Token char_literal171=null;
        SiddhiQLGrammarParser.extensionId_return extensionId166 =null;

        SiddhiQLGrammarParser.functionId_return functionId168 =null;

        SiddhiQLGrammarParser.parameters_return parameters170 =null;


        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal171_tree=null;
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
            pushFollow(FOLLOW_extensionId_in_extensionOutFunction1532);
            extensionId166=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId166.getTree());

            char_literal167=(Token)match(input,61,FOLLOW_61_in_extensionOutFunction1534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal167);


            pushFollow(FOLLOW_functionId_in_extensionOutFunction1536);
            functionId168=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId168.getTree());

            char_literal169=(Token)match(input,53,FOLLOW_53_in_extensionOutFunction1539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal169);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: ( parameters )?
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_extensionOutFunction1541);
                    parameters170=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters170.getTree());

                    }
                    break;

            }


            char_literal171=(Token)match(input,54,FOLLOW_54_in_extensionOutFunction1544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal171);


            // AST REWRITE
            // elements: functionId, extensionId, parameters
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

        Token ID172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        SiddhiQLGrammarParser.parameters_return parameters174 =null;


        CommonTree ID172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:2: ( ID '(' ( parameters )? ')' -> ^( FUNCTION ID ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:4: ID '(' ( parameters )? ')'
            {
            ID172=(Token)match(input,ID,FOLLOW_ID_in_outFunction1569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID172);


            char_literal173=(Token)match(input,53,FOLLOW_53_in_outFunction1571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal173);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: ( parameters )?
            int alt53=2;
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
                    alt53=1;
                    }
                    break;
                case 54:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred68_SiddhiQLGrammar()) ) {
                        alt53=1;
                    }
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_outFunction1573);
                    parameters174=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters174.getTree());

                    }
                    break;

            }


            char_literal175=(Token)match(input,54,FOLLOW_54_in_outFunction1576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal175);


            // AST REWRITE
            // elements: parameters, ID
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

        Token string_literal176=null;
        Token string_literal177=null;
        Token char_literal179=null;
        SiddhiQLGrammarParser.attributeVariable_return attributeVariable178 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable180 =null;


        CommonTree string_literal176_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_attributeVariable=new RewriteRuleSubtreeStream(adaptor,"rule attributeVariable");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:2: ( 'group' 'by' attributeVariable ( ',' attributeVariable )* -> ^( 'group' ( attributeVariable )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:4: 'group' 'by' attributeVariable ( ',' attributeVariable )*
            {
            string_literal176=(Token)match(input,90,FOLLOW_90_in_groupBy1599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(string_literal176);


            string_literal177=(Token)match(input,77,FOLLOW_77_in_groupBy1601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal177);


            pushFollow(FOLLOW_attributeVariable_in_groupBy1603);
            attributeVariable178=attributeVariable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attributeVariable.add(attributeVariable178.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:35: ( ',' attributeVariable )*
            loop54:
            do {
                int alt54=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt54=1;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:214:36: ',' attributeVariable
            	    {
            	    char_literal179=(Token)match(input,57,FOLLOW_57_in_groupBy1606); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal179);


            	    pushFollow(FOLLOW_attributeVariable_in_groupBy1608);
            	    attributeVariable180=attributeVariable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_attributeVariable.add(attributeVariable180.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // AST REWRITE
            // elements: attributeVariable, 90
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

        Token string_literal181=null;
        SiddhiQLGrammarParser.condition_return condition182 =null;


        CommonTree string_literal181_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:218:2: ( 'having' condition -> ^( 'having' condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:218:4: 'having' condition
            {
            string_literal181=(Token)match(input,91,FOLLOW_91_in_having1633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_91.add(string_literal181);


            pushFollow(FOLLOW_condition_in_having1635);
            condition182=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition182.getTree());

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

        Token string_literal183=null;
        Token ID184=null;
        Token char_literal185=null;
        Token char_literal187=null;
        SiddhiQLGrammarParser.parameters_return parameters186 =null;


        CommonTree string_literal183_tree=null;
        CommonTree ID184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree char_literal187_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:2: ( 'call' ID '(' ( parameters )? ')' -> ^( 'call' ^( ID ( parameters )? ) ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:4: 'call' ID '(' ( parameters )? ')'
            {
            string_literal183=(Token)match(input,78,FOLLOW_78_in_externalCall1655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(string_literal183);


            ID184=(Token)match(input,ID,FOLLOW_ID_in_externalCall1657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID184);


            char_literal185=(Token)match(input,53,FOLLOW_53_in_externalCall1659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal185);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: ( parameters )?
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_externalCall1661);
                    parameters186=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameters.add(parameters186.getTree());

                    }
                    break;

            }


            char_literal187=(Token)match(input,54,FOLLOW_54_in_externalCall1664); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal187);


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

        Token char_literal188=null;
        Token char_literal190=null;
        SiddhiQLGrammarParser.condition_return condition189 =null;


        CommonTree char_literal188_tree=null;
        CommonTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:226:2: ( '[' condition ']' -> ^( FILTER condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:226:4: '[' condition ']'
            {
            char_literal188=(Token)match(input,71,FOLLOW_71_in_filterHandler1691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal188);


            pushFollow(FOLLOW_condition_in_filterHandler1693);
            condition189=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition189.getTree());

            char_literal190=(Token)match(input,72,FOLLOW_72_in_filterHandler1695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal190);


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

        Token char_literal191=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token char_literal197=null;
        SiddhiQLGrammarParser.transform_return transform192 =null;

        SiddhiQLGrammarParser.extensibleId_return extensibleId194 =null;

        SiddhiQLGrammarParser.parameters_return parameters196 =null;


        CommonTree char_literal191_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal197_tree=null;
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
            char_literal191=(Token)match(input,51,FOLLOW_51_in_transformHandler1719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal191);


            pushFollow(FOLLOW_transform_in_transformHandler1721);
            transform192=transform();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_transform.add(transform192.getTree());

            char_literal193=(Token)match(input,59,FOLLOW_59_in_transformHandler1723); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal193);


            pushFollow(FOLLOW_extensibleId_in_transformHandler1725);
            extensibleId194=extensibleId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensibleId.add(extensibleId194.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:36: ( '(' ( parameters )? ')' )?
            int alt57=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt57=1;
                    }
                    break;
            }

            switch (alt57) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:37: '(' ( parameters )? ')'
                    {
                    char_literal195=(Token)match(input,53,FOLLOW_53_in_transformHandler1729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal195);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: ( parameters )?
                    int alt56=2;
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
                            alt56=1;
                            }
                            break;
                        case 54:
                            {
                            int LA56_2 = input.LA(2);

                            if ( (synpred71_SiddhiQLGrammar()) ) {
                                alt56=1;
                            }
                            }
                            break;
                    }

                    switch (alt56) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_transformHandler1731);
                            parameters196=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters196.getTree());

                            }
                            break;

                    }


                    char_literal197=(Token)match(input,54,FOLLOW_54_in_transformHandler1734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal197);


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

        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal202=null;
        Token char_literal204=null;
        SiddhiQLGrammarParser.window_return window199 =null;

        SiddhiQLGrammarParser.extensibleId_return extensibleId201 =null;

        SiddhiQLGrammarParser.parameters_return parameters203 =null;


        CommonTree char_literal198_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal204_tree=null;
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
            char_literal198=(Token)match(input,51,FOLLOW_51_in_windowHandler1762); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal198);


            pushFollow(FOLLOW_window_in_windowHandler1764);
            window199=window();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_window.add(window199.getTree());

            char_literal200=(Token)match(input,59,FOLLOW_59_in_windowHandler1767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal200);


            pushFollow(FOLLOW_extensibleId_in_windowHandler1769);
            extensibleId201=extensibleId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensibleId.add(extensibleId201.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:34: ( '(' ( parameters )? ')' )?
            int alt59=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt59=1;
                    }
                    break;
            }

            switch (alt59) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:35: '(' ( parameters )? ')'
                    {
                    char_literal202=(Token)match(input,53,FOLLOW_53_in_windowHandler1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal202);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: ( parameters )?
                    int alt58=2;
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
                            alt58=1;
                            }
                            break;
                        case 54:
                            {
                            int LA58_2 = input.LA(2);

                            if ( (synpred73_SiddhiQLGrammar()) ) {
                                alt58=1;
                            }
                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_windowHandler1775);
                            parameters203=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters203.getTree());

                            }
                            break;

                    }


                    char_literal204=(Token)match(input,54,FOLLOW_54_in_windowHandler1778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal204);


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

        Token char_literal206=null;
        SiddhiQLGrammarParser.extensionId_return extensionId205 =null;

        SiddhiQLGrammarParser.functionId_return functionId207 =null;

        SiddhiQLGrammarParser.id_return id208 =null;


        CommonTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_extensionId=new RewriteRuleSubtreeStream(adaptor,"rule extensionId");
        RewriteRuleSubtreeStream stream_functionId=new RewriteRuleSubtreeStream(adaptor,"rule functionId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:238:2: ( extensionId ':' functionId -> ^( EXTENSION extensionId functionId ) | id )
            int alt60=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt60=1;
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
                    alt60=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:238:4: extensionId ':' functionId
                    {
                    pushFollow(FOLLOW_extensionId_in_extensibleId1806);
                    extensionId205=extensionId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extensionId.add(extensionId205.getTree());

                    char_literal206=(Token)match(input,61,FOLLOW_61_in_extensibleId1808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal206);


                    pushFollow(FOLLOW_functionId_in_extensibleId1810);
                    functionId207=functionId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionId.add(functionId207.getTree());

                    // AST REWRITE
                    // elements: functionId, extensionId
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


                    pushFollow(FOLLOW_id_in_extensibleId1828);
                    id208=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id208.getTree());

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

        Token char_literal210=null;
        SiddhiQLGrammarParser.parameter_return parameter209 =null;

        SiddhiQLGrammarParser.parameter_return parameter211 =null;


        CommonTree char_literal210_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:2: ( parameter ( ',' parameter )* -> ^( PARAMETERS ( parameter )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:4: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameters1839);
            parameter209=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter209.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:14: ( ',' parameter )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt61=1;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:243:15: ',' parameter
            	    {
            	    char_literal210=(Token)match(input,57,FOLLOW_57_in_parameters1842); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal210);


            	    pushFollow(FOLLOW_parameter_in_parameters1844);
            	    parameter211=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter211.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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

        SiddhiQLGrammarParser.constant_return constant212 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:247:2: ( constant )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:247:4: constant
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_constant_in_time1868);
            constant212=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant212.getTree());

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

        SiddhiQLGrammarParser.expression_return expression213 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:251:2: ( expression )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:251:4: expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_parameter1880);
            expression213=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());

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

        Token char_literal215=null;
        Token char_literal218=null;
        Token char_literal219=null;
        SiddhiQLGrammarParser.countStart_return countStart214 =null;

        SiddhiQLGrammarParser.countEnd_return countEnd216 =null;

        SiddhiQLGrammarParser.countStart_return countStart217 =null;

        SiddhiQLGrammarParser.countEnd_return countEnd220 =null;

        SiddhiQLGrammarParser.countStartAndEnd_return countStartAndEnd221 =null;


        CommonTree char_literal215_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal219_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:255:2: ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd )
            int alt62=4;
            switch ( input.LA(1) ) {
            case POSITIVE_INT_VAL:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    switch ( input.LA(3) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt62=1;
                        }
                        break;
                    case 67:
                        {
                        alt62=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case 67:
                    {
                    alt62=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }

                }
                break;
            case 61:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:255:4: countStart ':' countEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStart_in_collect1891);
                    countStart214=countStart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStart214.getTree());

                    char_literal215=(Token)match(input,61,FOLLOW_61_in_collect1893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal215_tree = 
                    (CommonTree)adaptor.create(char_literal215)
                    ;
                    adaptor.addChild(root_0, char_literal215_tree);
                    }

                    pushFollow(FOLLOW_countEnd_in_collect1895);
                    countEnd216=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countEnd216.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:256:4: countStart ':'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStart_in_collect1900);
                    countStart217=countStart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStart217.getTree());

                    char_literal218=(Token)match(input,61,FOLLOW_61_in_collect1902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal218_tree = 
                    (CommonTree)adaptor.create(char_literal218)
                    ;
                    adaptor.addChild(root_0, char_literal218_tree);
                    }

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:257:4: ':' countEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal219=(Token)match(input,61,FOLLOW_61_in_collect1907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal219_tree = 
                    (CommonTree)adaptor.create(char_literal219)
                    ;
                    adaptor.addChild(root_0, char_literal219_tree);
                    }

                    pushFollow(FOLLOW_countEnd_in_collect1909);
                    countEnd220=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countEnd220.getTree());

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:258:4: countStartAndEnd
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_countStartAndEnd_in_collect1914);
                    countStartAndEnd221=countStartAndEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStartAndEnd221.getTree());

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

        Token POSITIVE_INT_VAL222=null;

        CommonTree POSITIVE_INT_VAL222_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:261:12: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:261:13: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL222=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStart1923); if (state.failed) return retval;
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

        Token POSITIVE_INT_VAL223=null;

        CommonTree POSITIVE_INT_VAL223_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:263:10: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:263:11: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL223=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countEnd1930); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL223_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL223)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL223_tree);
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

        Token POSITIVE_INT_VAL224=null;

        CommonTree POSITIVE_INT_VAL224_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:265:18: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:265:19: POSITIVE_INT_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL224=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1937); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL224_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL224)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL224_tree);
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

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression225 =null;


        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:270:2: ( conditionExpression -> ^( CONDITION conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:270:3: conditionExpression
            {
            pushFollow(FOLLOW_conditionExpression_in_condition1947);
            conditionExpression225=conditionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression225.getTree());

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

        Token string_literal227=null;
        SiddhiQLGrammarParser.andCondition_return andCondition226 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression228 =null;


        CommonTree string_literal227_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:5: ( andCondition ( 'or' ^ conditionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:7: andCondition ( 'or' ^ conditionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_andCondition_in_conditionExpression1970);
            andCondition226=andCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andCondition226.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:20: ( 'or' ^ conditionExpression )?
            int alt63=2;
            switch ( input.LA(1) ) {
                case 111:
                    {
                    int LA63_1 = input.LA(2);

                    if ( (synpred80_SiddhiQLGrammar()) ) {
                        alt63=1;
                    }
                    }
                    break;
            }

            switch (alt63) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: 'or' ^ conditionExpression
                    {
                    string_literal227=(Token)match(input,111,FOLLOW_111_in_conditionExpression1973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal227_tree = 
                    (CommonTree)adaptor.create(string_literal227)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal227_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1976);
                    conditionExpression228=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionExpression228.getTree());

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

        Token string_literal230=null;
        SiddhiQLGrammarParser.compareCondition_return compareCondition229 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression231 =null;


        CommonTree string_literal230_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:2: ( compareCondition ( 'and' ^ conditionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:4: compareCondition ( 'and' ^ conditionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_compareCondition_in_andCondition1990);
            compareCondition229=compareCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compareCondition229.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:21: ( 'and' ^ conditionExpression )?
            int alt64=2;
            switch ( input.LA(1) ) {
                case 74:
                    {
                    alt64=1;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:278:22: 'and' ^ conditionExpression
                    {
                    string_literal230=(Token)match(input,74,FOLLOW_74_in_andCondition1993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal230_tree = 
                    (CommonTree)adaptor.create(string_literal230)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal230_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionExpression_in_andCondition1996);
                    conditionExpression231=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionExpression231.getTree());

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

        Token char_literal236=null;
        Token char_literal238=null;
        SiddhiQLGrammarParser.expression_return expression232 =null;

        SiddhiQLGrammarParser.compareOperation_return compareOperation233 =null;

        SiddhiQLGrammarParser.expression_return expression234 =null;

        SiddhiQLGrammarParser.boolVal_return boolVal235 =null;

        SiddhiQLGrammarParser.conditionExpression_return conditionExpression237 =null;

        SiddhiQLGrammarParser.notCondition_return notCondition239 =null;

        SiddhiQLGrammarParser.extensionCondition_return extensionCondition240 =null;


        CommonTree char_literal236_tree=null;
        CommonTree char_literal238_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:2: ( expression compareOperation ^ expression | boolVal | '(' conditionExpression ')' -> conditionExpression | notCondition | extensionCondition )
            int alt65=5;
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
                alt65=1;
                }
                break;
            case BOOL_VAL:
                {
                int LA65_6 = input.LA(2);

                if ( (synpred82_SiddhiQLGrammar()) ) {
                    alt65=1;
                }
                else if ( (synpred83_SiddhiQLGrammar()) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 6, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case ID_QUOTES:
                {
                int LA65_13 = input.LA(2);

                if ( (synpred82_SiddhiQLGrammar()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 13, input);

                    throw nvae;

                }
                }
                break;
            case 53:
                {
                int LA65_15 = input.LA(2);

                if ( (synpred82_SiddhiQLGrammar()) ) {
                    alt65=1;
                }
                else if ( (synpred84_SiddhiQLGrammar()) ) {
                    alt65=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 15, input);

                    throw nvae;

                }
                }
                break;
            case 109:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: expression compareOperation ^ expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_compareCondition2008);
                    expression232=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression232.getTree());

                    pushFollow(FOLLOW_compareOperation_in_compareCondition2010);
                    compareOperation233=compareOperation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(compareOperation233.getTree(), root_0);

                    pushFollow(FOLLOW_expression_in_compareCondition2013);
                    expression234=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression234.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: boolVal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolVal_in_compareCondition2017);
                    boolVal235=boolVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolVal235.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: '(' conditionExpression ')'
                    {
                    char_literal236=(Token)match(input,53,FOLLOW_53_in_compareCondition2024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal236);


                    pushFollow(FOLLOW_conditionExpression_in_compareCondition2025);
                    conditionExpression237=conditionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression237.getTree());

                    char_literal238=(Token)match(input,54,FOLLOW_54_in_compareCondition2027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal238);


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


                    pushFollow(FOLLOW_notCondition_in_compareCondition2038);
                    notCondition239=notCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notCondition239.getTree());

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:286:6: extensionCondition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_extensionCondition_in_compareCondition2045);
                    extensionCondition240=extensionCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extensionCondition240.getTree());

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

        Token char_literal242=null;
        SiddhiQLGrammarParser.minusExpression_return minusExpression241 =null;

        SiddhiQLGrammarParser.expression_return expression243 =null;


        CommonTree char_literal242_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:5: ( minusExpression ( '+' ^ expression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:6: minusExpression ( '+' ^ expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_minusExpression_in_expression2058);
            minusExpression241=minusExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, minusExpression241.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:22: ( '+' ^ expression )?
            int alt66=2;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt66=1;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:290:23: '+' ^ expression
                    {
                    char_literal242=(Token)match(input,56,FOLLOW_56_in_expression2061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal242_tree = 
                    (CommonTree)adaptor.create(char_literal242)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal242_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_expression2064);
                    expression243=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression243.getTree());

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

        Token char_literal245=null;
        SiddhiQLGrammarParser.multiplyExpression_return multiplyExpression244 =null;

        SiddhiQLGrammarParser.minusExpression_return minusExpression246 =null;


        CommonTree char_literal245_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:5: ( multiplyExpression ( '-' ^ minusExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:6: multiplyExpression ( '-' ^ minusExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplyExpression_in_minusExpression2082);
            multiplyExpression244=multiplyExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression244.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:25: ( '-' ^ minusExpression )?
            int alt67=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt67=1;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:294:26: '-' ^ minusExpression
                    {
                    char_literal245=(Token)match(input,58,FOLLOW_58_in_minusExpression2085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal245_tree = 
                    (CommonTree)adaptor.create(char_literal245)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal245_tree, root_0);
                    }

                    pushFollow(FOLLOW_minusExpression_in_minusExpression2088);
                    minusExpression246=minusExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, minusExpression246.getTree());

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

        Token char_literal248=null;
        SiddhiQLGrammarParser.divisionExpression_return divisionExpression247 =null;

        SiddhiQLGrammarParser.multiplyExpression_return multiplyExpression249 =null;


        CommonTree char_literal248_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:5: ( divisionExpression ( '*' ^ multiplyExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:6: divisionExpression ( '*' ^ multiplyExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_divisionExpression_in_multiplyExpression2106);
            divisionExpression247=divisionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, divisionExpression247.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:25: ( '*' ^ multiplyExpression )?
            int alt68=2;
            switch ( input.LA(1) ) {
                case 55:
                    {
                    alt68=1;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:298:26: '*' ^ multiplyExpression
                    {
                    char_literal248=(Token)match(input,55,FOLLOW_55_in_multiplyExpression2109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal248_tree = 
                    (CommonTree)adaptor.create(char_literal248)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal248_tree, root_0);
                    }

                    pushFollow(FOLLOW_multiplyExpression_in_multiplyExpression2112);
                    multiplyExpression249=multiplyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpression249.getTree());

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

        Token char_literal251=null;
        SiddhiQLGrammarParser.modExpression_return modExpression250 =null;

        SiddhiQLGrammarParser.divisionExpression_return divisionExpression252 =null;


        CommonTree char_literal251_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:5: ( modExpression ( '/' ^ divisionExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:6: modExpression ( '/' ^ divisionExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_modExpression_in_divisionExpression2130);
            modExpression250=modExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modExpression250.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:20: ( '/' ^ divisionExpression )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case 60:
                    {
                    alt69=1;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:302:21: '/' ^ divisionExpression
                    {
                    char_literal251=(Token)match(input,60,FOLLOW_60_in_divisionExpression2133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal251_tree = 
                    (CommonTree)adaptor.create(char_literal251)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal251_tree, root_0);
                    }

                    pushFollow(FOLLOW_divisionExpression_in_divisionExpression2136);
                    divisionExpression252=divisionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, divisionExpression252.getTree());

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

        Token char_literal254=null;
        SiddhiQLGrammarParser.valueExpression_return valueExpression253 =null;

        SiddhiQLGrammarParser.modExpression_return modExpression255 =null;


        CommonTree char_literal254_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:5: ( valueExpression ( '%' ^ modExpression )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:6: valueExpression ( '%' ^ modExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_valueExpression_in_modExpression2154);
            valueExpression253=valueExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, valueExpression253.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:22: ( '%' ^ modExpression )?
            int alt70=2;
            switch ( input.LA(1) ) {
                case 52:
                    {
                    alt70=1;
                    }
                    break;
            }

            switch (alt70) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:306:23: '%' ^ modExpression
                    {
                    char_literal254=(Token)match(input,52,FOLLOW_52_in_modExpression2157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal254_tree = 
                    (CommonTree)adaptor.create(char_literal254)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal254_tree, root_0);
                    }

                    pushFollow(FOLLOW_modExpression_in_modExpression2160);
                    modExpression255=modExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modExpression255.getTree());

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

        Token char_literal259=null;
        Token char_literal261=null;
        SiddhiQLGrammarParser.constant_return constant256 =null;

        SiddhiQLGrammarParser.attributeVariable_return attributeVariable257 =null;

        SiddhiQLGrammarParser.type_return type258 =null;

        SiddhiQLGrammarParser.expression_return expression260 =null;

        SiddhiQLGrammarParser.extensionExpression_return extensionExpression262 =null;


        CommonTree char_literal259_tree=null;
        CommonTree char_literal261_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:310:5: ( constant | attributeVariable | type | '(' expression ')' -> expression | extensionExpression )
            int alt71=5;
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
                alt71=1;
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
                    alt71=2;
                    }
                    break;
                case 61:
                    {
                    alt71=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

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
                alt71=3;
                }
                break;
            case 53:
                {
                alt71=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:310:7: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_valueExpression2179);
                    constant256=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant256.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:311:7: attributeVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_attributeVariable_in_valueExpression2187);
                    attributeVariable257=attributeVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeVariable257.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:312:7: type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_valueExpression2195);
                    type258=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type258.getTree());

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:313:7: '(' expression ')'
                    {
                    char_literal259=(Token)match(input,53,FOLLOW_53_in_valueExpression2203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal259);


                    pushFollow(FOLLOW_expression_in_valueExpression2204);
                    expression260=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression260.getTree());

                    char_literal261=(Token)match(input,54,FOLLOW_54_in_valueExpression2206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal261);


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


                    pushFollow(FOLLOW_extensionExpression_in_valueExpression2218);
                    extensionExpression262=extensionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extensionExpression262.getTree());

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

        Token string_literal263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        SiddhiQLGrammarParser.conditionExpression_return conditionExpression265 =null;


        CommonTree string_literal263_tree=null;
        CommonTree char_literal264_tree=null;
        CommonTree char_literal266_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_conditionExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpression");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:318:2: ( 'not' '(' conditionExpression ')' -> ^( 'not' conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:318:3: 'not' '(' conditionExpression ')'
            {
            string_literal263=(Token)match(input,109,FOLLOW_109_in_notCondition2231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal263);


            char_literal264=(Token)match(input,53,FOLLOW_53_in_notCondition2233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal264);


            pushFollow(FOLLOW_conditionExpression_in_notCondition2234);
            conditionExpression265=conditionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionExpression.add(conditionExpression265.getTree());

            char_literal266=(Token)match(input,54,FOLLOW_54_in_notCondition2235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal266);


            // AST REWRITE
            // elements: 109, conditionExpression
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

        Token char_literal268=null;
        Token char_literal270=null;
        Token char_literal272=null;
        SiddhiQLGrammarParser.extensionId_return extensionId267 =null;

        SiddhiQLGrammarParser.functionId_return functionId269 =null;

        SiddhiQLGrammarParser.parameters_return parameters271 =null;


        CommonTree char_literal268_tree=null;
        CommonTree char_literal270_tree=null;
        CommonTree char_literal272_tree=null;
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
            pushFollow(FOLLOW_extensionId_in_extensionCondition2260);
            extensionId267=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId267.getTree());

            char_literal268=(Token)match(input,61,FOLLOW_61_in_extensionCondition2262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal268);


            pushFollow(FOLLOW_functionId_in_extensionCondition2264);
            functionId269=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId269.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:37: ( '(' ( parameters )? ')' )?
            int alt73=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt73=1;
                    }
                    break;
            }

            switch (alt73) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:38: '(' ( parameters )? ')'
                    {
                    char_literal270=(Token)match(input,53,FOLLOW_53_in_extensionCondition2268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal270);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: ( parameters )?
                    int alt72=2;
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
                            alt72=1;
                            }
                            break;
                        case 54:
                            {
                            int LA72_2 = input.LA(2);

                            if ( (synpred95_SiddhiQLGrammar()) ) {
                                alt72=1;
                            }
                            }
                            break;
                    }

                    switch (alt72) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_extensionCondition2270);
                            parameters271=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters271.getTree());

                            }
                            break;

                    }


                    char_literal272=(Token)match(input,54,FOLLOW_54_in_extensionCondition2273); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal272);


                    }
                    break;

            }


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

        Token char_literal274=null;
        Token char_literal276=null;
        Token char_literal278=null;
        SiddhiQLGrammarParser.extensionId_return extensionId273 =null;

        SiddhiQLGrammarParser.functionId_return functionId275 =null;

        SiddhiQLGrammarParser.parameters_return parameters277 =null;


        CommonTree char_literal274_tree=null;
        CommonTree char_literal276_tree=null;
        CommonTree char_literal278_tree=null;
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
            pushFollow(FOLLOW_extensionId_in_extensionExpression2311);
            extensionId273=extensionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_extensionId.add(extensionId273.getTree());

            char_literal274=(Token)match(input,61,FOLLOW_61_in_extensionExpression2313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal274);


            pushFollow(FOLLOW_functionId_in_extensionExpression2315);
            functionId275=functionId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionId.add(functionId275.getTree());

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:37: ( '(' ( parameters )? ')' )?
            int alt75=2;
            switch ( input.LA(1) ) {
                case 53:
                    {
                    alt75=1;
                    }
                    break;
            }

            switch (alt75) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:38: '(' ( parameters )? ')'
                    {
                    char_literal276=(Token)match(input,53,FOLLOW_53_in_extensionExpression2319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal276);


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: ( parameters )?
                    int alt74=2;
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
                            alt74=1;
                            }
                            break;
                        case 54:
                            {
                            int LA74_2 = input.LA(2);

                            if ( (synpred97_SiddhiQLGrammar()) ) {
                                alt74=1;
                            }
                            }
                            break;
                    }

                    switch (alt74) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_extensionExpression2321);
                            parameters277=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameters.add(parameters277.getTree());

                            }
                            break;

                    }


                    char_literal278=(Token)match(input,54,FOLLOW_54_in_extensionExpression2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal278);


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

        SiddhiQLGrammarParser.intVal_return intVal279 =null;

        SiddhiQLGrammarParser.longVal_return longVal280 =null;

        SiddhiQLGrammarParser.floatVal_return floatVal281 =null;

        SiddhiQLGrammarParser.doubleVal_return doubleVal282 =null;

        SiddhiQLGrammarParser.boolVal_return boolVal283 =null;

        SiddhiQLGrammarParser.stringVal_return stringVal284 =null;

        SiddhiQLGrammarParser.timeExpr_return timeExpr285 =null;


        RewriteRuleSubtreeStream stream_timeExpr=new RewriteRuleSubtreeStream(adaptor,"rule timeExpr");
        RewriteRuleSubtreeStream stream_boolVal=new RewriteRuleSubtreeStream(adaptor,"rule boolVal");
        RewriteRuleSubtreeStream stream_floatVal=new RewriteRuleSubtreeStream(adaptor,"rule floatVal");
        RewriteRuleSubtreeStream stream_longVal=new RewriteRuleSubtreeStream(adaptor,"rule longVal");
        RewriteRuleSubtreeStream stream_doubleVal=new RewriteRuleSubtreeStream(adaptor,"rule doubleVal");
        RewriteRuleSubtreeStream stream_intVal=new RewriteRuleSubtreeStream(adaptor,"rule intVal");
        RewriteRuleSubtreeStream stream_stringVal=new RewriteRuleSubtreeStream(adaptor,"rule stringVal");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:2: ( intVal -> ^( CONSTANT intVal ) | longVal -> ^( CONSTANT longVal ) | floatVal -> ^( CONSTANT floatVal ) | doubleVal -> ^( CONSTANT doubleVal ) | boolVal -> ^( CONSTANT boolVal ) | stringVal -> ^( CONSTANT stringVal ) | timeExpr -> ^( CONSTANT timeExpr ) )
            int alt76=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                int LA76_1 = input.LA(2);

                if ( (synpred99_SiddhiQLGrammar()) ) {
                    alt76=1;
                }
                else if ( (synpred100_SiddhiQLGrammar()) ) {
                    alt76=2;
                }
                else if ( (synpred101_SiddhiQLGrammar()) ) {
                    alt76=3;
                }
                else if ( (synpred102_SiddhiQLGrammar()) ) {
                    alt76=4;
                }
                else if ( (true) ) {
                    alt76=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

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
                    alt76=7;
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
                    alt76=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;

                }

                }
                break;
            case POSITIVE_LONG_VAL:
                {
                alt76=2;
                }
                break;
            case POSITIVE_FLOAT_VAL:
                {
                alt76=3;
                }
                break;
            case POSITIVE_DOUBLE_VAL:
                {
                alt76=4;
                }
                break;
            case BOOL_VAL:
                {
                alt76=5;
                }
                break;
            case STRING_VAL:
                {
                alt76=6;
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
                alt76=7;
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: intVal
                    {
                    pushFollow(FOLLOW_intVal_in_constant2358);
                    intVal279=intVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_intVal.add(intVal279.getTree());

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
                    pushFollow(FOLLOW_longVal_in_constant2371);
                    longVal280=longVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_longVal.add(longVal280.getTree());

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
                    pushFollow(FOLLOW_floatVal_in_constant2384);
                    floatVal281=floatVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_floatVal.add(floatVal281.getTree());

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
                    pushFollow(FOLLOW_doubleVal_in_constant2398);
                    doubleVal282=doubleVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doubleVal.add(doubleVal282.getTree());

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
                    pushFollow(FOLLOW_boolVal_in_constant2411);
                    boolVal283=boolVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolVal.add(boolVal283.getTree());

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
                    pushFollow(FOLLOW_stringVal_in_constant2424);
                    stringVal284=stringVal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringVal.add(stringVal284.getTree());

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
                    pushFollow(FOLLOW_timeExpr_in_constant2437);
                    timeExpr285=timeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeExpr.add(timeExpr285.getTree());

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

        SiddhiQLGrammarParser.id_return id286 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:341:9: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:341:11: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_streamId2457);
            id286=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id286.getTree());

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

        SiddhiQLGrammarParser.streamPositionAttributeName_return streamPositionAttributeName287 =null;

        SiddhiQLGrammarParser.streamAttributeName_return streamAttributeName288 =null;

        SiddhiQLGrammarParser.attributeName_return attributeName289 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:2: ( streamPositionAttributeName | streamAttributeName | attributeName )
            int alt77=3;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    alt77=1;
                    }
                    break;
                case 59:
                    {
                    alt77=2;
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
                    alt77=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;

                }

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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:3: streamPositionAttributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_streamPositionAttributeName_in_attributeVariable2465);
                    streamPositionAttributeName287=streamPositionAttributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, streamPositionAttributeName287.getTree());

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:31: streamAttributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_streamAttributeName_in_attributeVariable2467);
                    streamAttributeName288=streamAttributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, streamAttributeName288.getTree());

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:344:51: attributeName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_attributeName_in_attributeVariable2469);
                    attributeName289=attributeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeName289.getTree());

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

        Token char_literal291=null;
        Token POSITIVE_INT_VAL292=null;
        Token char_literal293=null;
        Token char_literal294=null;
        SiddhiQLGrammarParser.streamId_return streamId290 =null;

        SiddhiQLGrammarParser.id_return id295 =null;


        CommonTree char_literal291_tree=null;
        CommonTree POSITIVE_INT_VAL292_tree=null;
        CommonTree char_literal293_tree=null;
        CommonTree char_literal294_tree=null;
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
            pushFollow(FOLLOW_streamId_in_streamPositionAttributeName2477);
            streamId290=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId290.getTree());

            char_literal291=(Token)match(input,71,FOLLOW_71_in_streamPositionAttributeName2479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal291);


            POSITIVE_INT_VAL292=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_INT_VAL.add(POSITIVE_INT_VAL292);


            char_literal293=(Token)match(input,72,FOLLOW_72_in_streamPositionAttributeName2481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal293);


            char_literal294=(Token)match(input,59,FOLLOW_59_in_streamPositionAttributeName2482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal294);


            pushFollow(FOLLOW_id_in_streamPositionAttributeName2484);
            id295=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id295.getTree());

            // AST REWRITE
            // elements: streamId, id, POSITIVE_INT_VAL
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

        Token char_literal297=null;
        SiddhiQLGrammarParser.streamId_return streamId296 =null;

        SiddhiQLGrammarParser.id_return id298 =null;


        CommonTree char_literal297_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_streamId=new RewriteRuleSubtreeStream(adaptor,"rule streamId");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:351:2: ( streamId '.' id -> ^( ATTRIBUTE streamId id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:351:4: streamId '.' id
            {
            pushFollow(FOLLOW_streamId_in_streamAttributeName2511);
            streamId296=streamId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_streamId.add(streamId296.getTree());

            char_literal297=(Token)match(input,59,FOLLOW_59_in_streamAttributeName2513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal297);


            pushFollow(FOLLOW_id_in_streamAttributeName2515);
            id298=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id298.getTree());

            // AST REWRITE
            // elements: id, streamId
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

        SiddhiQLGrammarParser.id_return id299 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:355:2: ( id -> ^( ATTRIBUTE id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:355:4: id
            {
            pushFollow(FOLLOW_id_in_attributeName2539);
            id299=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id299.getTree());

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
        Token string_literal312=null;
        Token string_literal313=null;

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
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:2: ( 'left' 'outer' 'join' -> ^( 'join' ^( 'outer' 'left' ) ) | 'right' 'outer' 'join' -> ^( 'join' ^( 'outer' 'right' ) ) | 'full' 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'outer' 'join' -> ^( 'join' ^( 'outer' 'full' ) ) | 'inner' 'join' -> ^( 'join' 'inner' ) | 'join' -> ^( 'join' 'inner' ) )
            int alt78=6;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt78=1;
                }
                break;
            case 114:
                {
                alt78=2;
                }
                break;
            case 89:
                {
                alt78=3;
                }
                break;
            case 112:
                {
                alt78=4;
                }
                break;
            case 94:
                {
                alt78=5;
                }
                break;
            case 99:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }

            switch (alt78) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:359:4: 'left' 'outer' 'join'
                    {
                    string_literal300=(Token)match(input,100,FOLLOW_100_in_join2561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_100.add(string_literal300);


                    string_literal301=(Token)match(input,112,FOLLOW_112_in_join2562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal301);


                    string_literal302=(Token)match(input,99,FOLLOW_99_in_join2564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal302);


                    // AST REWRITE
                    // elements: 112, 99, 100
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
                    string_literal303=(Token)match(input,114,FOLLOW_114_in_join2582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal303);


                    string_literal304=(Token)match(input,112,FOLLOW_112_in_join2584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal304);


                    string_literal305=(Token)match(input,99,FOLLOW_99_in_join2586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal305);


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
                    string_literal306=(Token)match(input,89,FOLLOW_89_in_join2603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(string_literal306);


                    string_literal307=(Token)match(input,112,FOLLOW_112_in_join2604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal307);


                    string_literal308=(Token)match(input,99,FOLLOW_99_in_join2606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal308);


                    // AST REWRITE
                    // elements: 99, 112, 89
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
                    string_literal309=(Token)match(input,112,FOLLOW_112_in_join2623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal309);


                    string_literal310=(Token)match(input,99,FOLLOW_99_in_join2625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal310);


                    // AST REWRITE
                    // elements: 89, 112, 99
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
                    string_literal311=(Token)match(input,94,FOLLOW_94_in_join2643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_94.add(string_literal311);


                    string_literal312=(Token)match(input,99,FOLLOW_99_in_join2645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal312);


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
                    string_literal313=(Token)match(input,99,FOLLOW_99_in_join2660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal313);


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

        Token string_literal314=null;

        CommonTree string_literal314_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:368:5: ( 'window' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:368:7: 'window'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal314=(Token)match(input,124,FOLLOW_124_in_window2682); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal314_tree = 
            (CommonTree)adaptor.create(string_literal314)
            ;
            adaptor.addChild(root_0, string_literal314_tree);
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

        Token string_literal315=null;

        CommonTree string_literal315_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:372:5: ( 'transform' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:372:7: 'transform'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal315=(Token)match(input,120,FOLLOW_120_in_transform2699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal315_tree = 
            (CommonTree)adaptor.create(string_literal315)
            ;
            adaptor.addChild(root_0, string_literal315_tree);
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

        Token set316=null;

        CommonTree set316_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:376:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set316=(Token)input.LT(1);

            if ( input.LA(1)==50||(input.LA(1) >= 63 && input.LA(1) <= 64)||(input.LA(1) >= 66 && input.LA(1) <= 68)||input.LA(1)==79||input.LA(1)==96 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set316)
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

        Token set317=null;

        CommonTree set317_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:379:3: ( ID | ID_QUOTES )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set317=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= ID_QUOTES) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set317)
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

        SiddhiQLGrammarParser.yearValue_return yearValue318 =null;

        SiddhiQLGrammarParser.monthValue_return monthValue319 =null;

        SiddhiQLGrammarParser.weekValue_return weekValue320 =null;

        SiddhiQLGrammarParser.dayValue_return dayValue321 =null;

        SiddhiQLGrammarParser.hourValue_return hourValue322 =null;

        SiddhiQLGrammarParser.minuteValue_return minuteValue323 =null;

        SiddhiQLGrammarParser.secondValue_return secondValue324 =null;

        SiddhiQLGrammarParser.milliSecondValue_return milliSecondValue325 =null;


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
            int alt79=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 126:
                        case 127:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:8: yearValue
                    {
                    pushFollow(FOLLOW_yearValue_in_timeExpr2759);
                    yearValue318=yearValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_yearValue.add(yearValue318.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:20: ( monthValue )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 107:
                        case 108:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:21: monthValue
                    {
                    pushFollow(FOLLOW_monthValue_in_timeExpr2764);
                    monthValue319=monthValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_monthValue.add(monthValue319.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:34: ( weekValue )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 122:
                        case 123:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:35: weekValue
                    {
                    pushFollow(FOLLOW_weekValue_in_timeExpr2769);
                    weekValue320=weekValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_weekValue.add(weekValue320.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:47: ( dayValue )?
            int alt82=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 81:
                        case 82:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:48: dayValue
                    {
                    pushFollow(FOLLOW_dayValue_in_timeExpr2774);
                    dayValue321=dayValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dayValue.add(dayValue321.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:59: ( hourValue )?
            int alt83=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 92:
                        case 93:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:60: hourValue
                    {
                    pushFollow(FOLLOW_hourValue_in_timeExpr2779);
                    hourValue322=hourValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hourValue.add(hourValue322.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:72: ( minuteValue )?
            int alt84=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 104:
                        case 105:
                        case 106:
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:73: minuteValue
                    {
                    pushFollow(FOLLOW_minuteValue_in_timeExpr2784);
                    minuteValue323=minuteValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minuteValue.add(minuteValue323.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:87: ( secondValue )?
            int alt85=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    switch ( input.LA(2) ) {
                        case 115:
                        case 116:
                        case 117:
                            {
                            alt85=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt85) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:88: secondValue
                    {
                    pushFollow(FOLLOW_secondValue_in_timeExpr2789);
                    secondValue324=secondValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_secondValue.add(secondValue324.getTree());

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:103: ( milliSecondValue )?
            int alt86=2;
            switch ( input.LA(1) ) {
                case POSITIVE_INT_VAL:
                    {
                    alt86=1;
                    }
                    break;
            }

            switch (alt86) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:382:104: milliSecondValue
                    {
                    pushFollow(FOLLOW_milliSecondValue_in_timeExpr2795);
                    milliSecondValue325=milliSecondValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_milliSecondValue.add(milliSecondValue325.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: yearValue, hourValue, milliSecondValue, minuteValue, monthValue, weekValue, secondValue, dayValue
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

        Token POSITIVE_INT_VAL326=null;
        Token set327=null;

        CommonTree POSITIVE_INT_VAL326_tree=null;
        CommonTree set327_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:387:2: ( POSITIVE_INT_VAL ( 'years' | 'year' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:387:4: POSITIVE_INT_VAL ( 'years' | 'year' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL326=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_yearValue2841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL326_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL326)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL326_tree);
            }

            set327=(Token)input.LT(1);

            if ( (input.LA(1) >= 126 && input.LA(1) <= 127) ) {
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

        Token POSITIVE_INT_VAL328=null;
        Token set329=null;

        CommonTree POSITIVE_INT_VAL328_tree=null;
        CommonTree set329_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:391:2: ( POSITIVE_INT_VAL ( 'months' | 'month' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:391:4: POSITIVE_INT_VAL ( 'months' | 'month' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL328=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_monthValue2861); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL328_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL328)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL328_tree);
            }

            set329=(Token)input.LT(1);

            if ( (input.LA(1) >= 107 && input.LA(1) <= 108) ) {
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

        Token POSITIVE_INT_VAL330=null;
        Token set331=null;

        CommonTree POSITIVE_INT_VAL330_tree=null;
        CommonTree set331_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:395:2: ( POSITIVE_INT_VAL ( 'weeks' | 'week' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:395:4: POSITIVE_INT_VAL ( 'weeks' | 'week' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL330=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_weekValue2881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL330_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL330)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL330_tree);
            }

            set331=(Token)input.LT(1);

            if ( (input.LA(1) >= 122 && input.LA(1) <= 123) ) {
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

        Token POSITIVE_INT_VAL332=null;
        Token set333=null;

        CommonTree POSITIVE_INT_VAL332_tree=null;
        CommonTree set333_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:399:2: ( POSITIVE_INT_VAL ( 'days' | 'day' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:399:4: POSITIVE_INT_VAL ( 'days' | 'day' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL332=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_dayValue2901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL332_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL332)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL332_tree);
            }

            set333=(Token)input.LT(1);

            if ( (input.LA(1) >= 81 && input.LA(1) <= 82) ) {
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

        Token POSITIVE_INT_VAL334=null;
        Token set335=null;

        CommonTree POSITIVE_INT_VAL334_tree=null;
        CommonTree set335_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:403:2: ( POSITIVE_INT_VAL ( 'hours' | 'hour' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:403:4: POSITIVE_INT_VAL ( 'hours' | 'hour' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL334=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_hourValue2921); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL334_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL334)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL334_tree);
            }

            set335=(Token)input.LT(1);

            if ( (input.LA(1) >= 92 && input.LA(1) <= 93) ) {
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

        Token POSITIVE_INT_VAL336=null;
        Token set337=null;

        CommonTree POSITIVE_INT_VAL336_tree=null;
        CommonTree set337_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:407:2: ( POSITIVE_INT_VAL ( 'minutes' | 'min' | 'minute' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:407:4: POSITIVE_INT_VAL ( 'minutes' | 'min' | 'minute' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL336=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_minuteValue2944); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL336_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL336)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL336_tree);
            }

            set337=(Token)input.LT(1);

            if ( (input.LA(1) >= 104 && input.LA(1) <= 106) ) {
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

        Token POSITIVE_INT_VAL338=null;
        Token set339=null;

        CommonTree POSITIVE_INT_VAL338_tree=null;
        CommonTree set339_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:411:2: ( POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:411:4: POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL338=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_secondValue2972); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL338_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL338)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL338_tree);
            }

            set339=(Token)input.LT(1);

            if ( (input.LA(1) >= 115 && input.LA(1) <= 117) ) {
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

        Token POSITIVE_INT_VAL340=null;
        Token set341=null;

        CommonTree POSITIVE_INT_VAL340_tree=null;
        CommonTree set341_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:415:2: ( POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:415:4: POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' )
            {
            root_0 = (CommonTree)adaptor.nil();


            POSITIVE_INT_VAL340=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue3002); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POSITIVE_INT_VAL340_tree = 
            (CommonTree)adaptor.create(POSITIVE_INT_VAL340)
            ;
            adaptor.addChild(root_0, POSITIVE_INT_VAL340_tree);
            }

            set341=(Token)input.LT(1);

            if ( (input.LA(1) >= 102 && input.LA(1) <= 103) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set341)
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

        Token char_literal342=null;
        Token POSITIVE_INT_VAL343=null;

        CommonTree char_literal342_tree=null;
        CommonTree POSITIVE_INT_VAL343_tree=null;
        RewriteRuleTokenStream stream_POSITIVE_INT_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INT_VAL");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:7: ( ( '-' )? POSITIVE_INT_VAL -> ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: ( '-' )? POSITIVE_INT_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: ( '-' )?
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:418:9: '-'
                    {
                    char_literal342=(Token)match(input,58,FOLLOW_58_in_intVal3023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal342);


                    }
                    break;

            }


            POSITIVE_INT_VAL343=(Token)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_intVal3026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_INT_VAL.add(POSITIVE_INT_VAL343);


            // AST REWRITE
            // elements: POSITIVE_INT_VAL, 58
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

        Token char_literal344=null;
        Token POSITIVE_LONG_VAL345=null;

        CommonTree char_literal344_tree=null;
        CommonTree POSITIVE_LONG_VAL345_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_POSITIVE_LONG_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_LONG_VAL");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:8: ( ( '-' )? POSITIVE_LONG_VAL -> ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: ( '-' )? POSITIVE_LONG_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: ( '-' )?
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:420:10: '-'
                    {
                    char_literal344=(Token)match(input,58,FOLLOW_58_in_longVal3045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal344);


                    }
                    break;

            }


            POSITIVE_LONG_VAL345=(Token)match(input,POSITIVE_LONG_VAL,FOLLOW_POSITIVE_LONG_VAL_in_longVal3048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_LONG_VAL.add(POSITIVE_LONG_VAL345);


            // AST REWRITE
            // elements: 58, POSITIVE_LONG_VAL
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

        Token char_literal346=null;
        Token POSITIVE_FLOAT_VAL347=null;

        CommonTree char_literal346_tree=null;
        CommonTree POSITIVE_FLOAT_VAL347_tree=null;
        RewriteRuleTokenStream stream_POSITIVE_FLOAT_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_FLOAT_VAL");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:9: ( ( '-' )? POSITIVE_FLOAT_VAL -> ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: ( '-' )? POSITIVE_FLOAT_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: ( '-' )?
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
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:422:11: '-'
                    {
                    char_literal346=(Token)match(input,58,FOLLOW_58_in_floatVal3067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal346);


                    }
                    break;

            }


            POSITIVE_FLOAT_VAL347=(Token)match(input,POSITIVE_FLOAT_VAL,FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_FLOAT_VAL.add(POSITIVE_FLOAT_VAL347);


            // AST REWRITE
            // elements: POSITIVE_FLOAT_VAL, 58
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

        Token char_literal348=null;
        Token POSITIVE_DOUBLE_VAL349=null;

        CommonTree char_literal348_tree=null;
        CommonTree POSITIVE_DOUBLE_VAL349_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_POSITIVE_DOUBLE_VAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_DOUBLE_VAL");

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:10: ( ( '-' )? POSITIVE_DOUBLE_VAL -> ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: ( '-' )? POSITIVE_DOUBLE_VAL
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: ( '-' )?
            int alt90=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt90=1;
                    }
                    break;
            }

            switch (alt90) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:424:12: '-'
                    {
                    char_literal348=(Token)match(input,58,FOLLOW_58_in_doubleVal3089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal348);


                    }
                    break;

            }


            POSITIVE_DOUBLE_VAL349=(Token)match(input,POSITIVE_DOUBLE_VAL,FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3092); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POSITIVE_DOUBLE_VAL.add(POSITIVE_DOUBLE_VAL349);


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

        Token BOOL_VAL350=null;

        CommonTree BOOL_VAL350_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:426:8: ( BOOL_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:426:10: BOOL_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            BOOL_VAL350=(Token)match(input,BOOL_VAL,FOLLOW_BOOL_VAL_in_boolVal3111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOL_VAL350_tree = 
            (CommonTree)adaptor.create(BOOL_VAL350)
            ;
            adaptor.addChild(root_0, BOOL_VAL350_tree);
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

        SiddhiQLGrammarParser.id_return id351 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:428:12: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:428:14: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_extensionId3118);
            id351=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id351.getTree());

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

        SiddhiQLGrammarParser.id_return id352 =null;



        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:430:11: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:430:13: id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_functionId3125);
            id352=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id352.getTree());

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

        Token STRING_VAL353=null;

        CommonTree STRING_VAL353_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:432:10: ( STRING_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:432:12: STRING_VAL
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_VAL353=(Token)match(input,STRING_VAL,FOLLOW_STRING_VAL_in_stringVal3132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_VAL353_tree = 
            (CommonTree)adaptor.create(STRING_VAL353)
            ;
            adaptor.addChild(root_0, STRING_VAL353_tree);
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

        Token set354=null;

        CommonTree set354_tree=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:434:5: ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set354=(Token)input.LT(1);

            if ( input.LA(1)==76||input.LA(1)==84||input.LA(1)==87||input.LA(1)==97||input.LA(1)==101||input.LA(1)==119 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set354)
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

    // $ANTLR start synpred13_SiddhiQLGrammar
    public final void synpred13_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: ( sequenceFullStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:97:12: sequenceFullStream
        {
        pushFollow(FOLLOW_sequenceFullStream_in_synpred13_SiddhiQLGrammar503);
        sequenceFullStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_SiddhiQLGrammar

    // $ANTLR start synpred14_SiddhiQLGrammar
    public final void synpred14_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:5: ( patternFullStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:98:5: patternFullStream
        {
        pushFollow(FOLLOW_patternFullStream_in_synpred14_SiddhiQLGrammar517);
        patternFullStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_SiddhiQLGrammar

    // $ANTLR start synpred15_SiddhiQLGrammar
    public final void synpred15_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:5: ( joinStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:99:5: joinStream
        {
        pushFollow(FOLLOW_joinStream_in_synpred15_SiddhiQLGrammar534);
        joinStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_SiddhiQLGrammar

    // $ANTLR start synpred16_SiddhiQLGrammar
    public final void synpred16_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:100:5: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:100:5: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred16_SiddhiQLGrammar549);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_SiddhiQLGrammar

    // $ANTLR start synpred34_SiddhiQLGrammar
    public final void synpred34_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: ( leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:3: leftStream join rightStream 'unidirectional' ( 'on' condition )? ( 'within' time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred34_SiddhiQLGrammar848);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred34_SiddhiQLGrammar850);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred34_SiddhiQLGrammar852);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,121,FOLLOW_121_in_synpred34_SiddhiQLGrammar854); if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:48: ( 'on' condition )?
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
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:49: 'on' condition
                {
                match(input,110,FOLLOW_110_in_synpred34_SiddhiQLGrammar857); if (state.failed) return ;

                pushFollow(FOLLOW_condition_in_synpred34_SiddhiQLGrammar859);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:66: ( 'within' time )?
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
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:126:67: 'within' time
                {
                match(input,125,FOLLOW_125_in_synpred34_SiddhiQLGrammar864); if (state.failed) return ;

                pushFollow(FOLLOW_time_in_synpred34_SiddhiQLGrammar866);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred34_SiddhiQLGrammar

    // $ANTLR start synpred37_SiddhiQLGrammar
    public final void synpred37_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:3: ( leftStream join rightStream ( 'on' condition )? ( 'within' time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:3: leftStream join rightStream ( 'on' condition )? ( 'within' time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred37_SiddhiQLGrammar889);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred37_SiddhiQLGrammar891);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred37_SiddhiQLGrammar893);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:31: ( 'on' condition )?
        int alt100=2;
        switch ( input.LA(1) ) {
            case 110:
                {
                alt100=1;
                }
                break;
        }

        switch (alt100) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:32: 'on' condition
                {
                match(input,110,FOLLOW_110_in_synpred37_SiddhiQLGrammar896); if (state.failed) return ;

                pushFollow(FOLLOW_condition_in_synpred37_SiddhiQLGrammar898);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:49: ( 'within' time )?
        int alt101=2;
        switch ( input.LA(1) ) {
            case 125:
                {
                alt101=1;
                }
                break;
        }

        switch (alt101) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:127:50: 'within' time
                {
                match(input,125,FOLLOW_125_in_synpred37_SiddhiQLGrammar903); if (state.failed) return ;

                pushFollow(FOLLOW_time_in_synpred37_SiddhiQLGrammar905);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred37_SiddhiQLGrammar

    // $ANTLR start synpred40_SiddhiQLGrammar
    public final void synpred40_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:132:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred40_SiddhiQLGrammar980);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred40_SiddhiQLGrammar

    // $ANTLR start synpred41_SiddhiQLGrammar
    public final void synpred41_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:137:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred41_SiddhiQLGrammar1006);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred41_SiddhiQLGrammar

    // $ANTLR start synpred50_SiddhiQLGrammar
    public final void synpred50_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: ( itemStream 'and' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:168:4: itemStream 'and' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1255);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,74,FOLLOW_74_in_synpred50_SiddhiQLGrammar1257); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1260);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_SiddhiQLGrammar

    // $ANTLR start synpred51_SiddhiQLGrammar
    public final void synpred51_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: ( itemStream 'or' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:169:4: itemStream 'or' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1265);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,111,FOLLOW_111_in_synpred51_SiddhiQLGrammar1267); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1270);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_SiddhiQLGrammar

    // $ANTLR start synpred52_SiddhiQLGrammar
    public final void synpred52_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: ( itemStream '<' collect '>' )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:170:4: itemStream '<' collect '>'
        {
        pushFollow(FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1275);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,63,FOLLOW_63_in_synpred52_SiddhiQLGrammar1277); if (state.failed) return ;

        pushFollow(FOLLOW_collect_in_synpred52_SiddhiQLGrammar1278);
        collect();

        state._fsp--;
        if (state.failed) return ;

        match(input,67,FOLLOW_67_in_synpred52_SiddhiQLGrammar1280); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_SiddhiQLGrammar

    // $ANTLR start synpred53_SiddhiQLGrammar
    public final void synpred53_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: ( itemStream 'or' itemStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:175:4: itemStream 'or' itemStream
        {
        pushFollow(FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1306);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,111,FOLLOW_111_in_synpred53_SiddhiQLGrammar1308); if (state.failed) return ;

        pushFollow(FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1311);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_SiddhiQLGrammar

    // $ANTLR start synpred54_SiddhiQLGrammar
    public final void synpred54_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: ( itemStream regex )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:176:4: itemStream regex
        {
        pushFollow(FOLLOW_itemStream_in_synpred54_SiddhiQLGrammar1316);
        itemStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_regex_in_synpred54_SiddhiQLGrammar1318);
        regex();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_SiddhiQLGrammar

    // $ANTLR start synpred64_SiddhiQLGrammar
    public final void synpred64_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: ( extensionOutFunction 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:199:4: extensionOutFunction 'as' id
        {
        pushFollow(FOLLOW_extensionOutFunction_in_synpred64_SiddhiQLGrammar1469);
        extensionOutFunction();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred64_SiddhiQLGrammar1471); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred64_SiddhiQLGrammar1473);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_SiddhiQLGrammar

    // $ANTLR start synpred65_SiddhiQLGrammar
    public final void synpred65_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:200:4: ( outFunction 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:200:4: outFunction 'as' id
        {
        pushFollow(FOLLOW_outFunction_in_synpred65_SiddhiQLGrammar1486);
        outFunction();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred65_SiddhiQLGrammar1488); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred65_SiddhiQLGrammar1490);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_SiddhiQLGrammar

    // $ANTLR start synpred66_SiddhiQLGrammar
    public final void synpred66_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:201:4: ( expression 'as' id )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:201:4: expression 'as' id
        {
        pushFollow(FOLLOW_expression_in_synpred66_SiddhiQLGrammar1502);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,75,FOLLOW_75_in_synpred66_SiddhiQLGrammar1505); if (state.failed) return ;

        pushFollow(FOLLOW_id_in_synpred66_SiddhiQLGrammar1507);
        id();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred66_SiddhiQLGrammar

    // $ANTLR start synpred67_SiddhiQLGrammar
    public final void synpred67_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:206:36: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred67_SiddhiQLGrammar1541);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred67_SiddhiQLGrammar

    // $ANTLR start synpred68_SiddhiQLGrammar
    public final void synpred68_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:210:11: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred68_SiddhiQLGrammar1573);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred68_SiddhiQLGrammar

    // $ANTLR start synpred70_SiddhiQLGrammar
    public final void synpred70_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:222:18: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred70_SiddhiQLGrammar1661);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_SiddhiQLGrammar

    // $ANTLR start synpred71_SiddhiQLGrammar
    public final void synpred71_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:230:41: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred71_SiddhiQLGrammar1731);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred71_SiddhiQLGrammar

    // $ANTLR start synpred73_SiddhiQLGrammar
    public final void synpred73_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:234:39: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred73_SiddhiQLGrammar1775);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred73_SiddhiQLGrammar

    // $ANTLR start synpred80_SiddhiQLGrammar
    public final void synpred80_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: ( 'or' conditionExpression )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:274:21: 'or' conditionExpression
        {
        match(input,111,FOLLOW_111_in_synpred80_SiddhiQLGrammar1973); if (state.failed) return ;

        pushFollow(FOLLOW_conditionExpression_in_synpred80_SiddhiQLGrammar1976);
        conditionExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_SiddhiQLGrammar

    // $ANTLR start synpred82_SiddhiQLGrammar
    public final void synpred82_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: ( expression compareOperation expression )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:282:3: expression compareOperation expression
        {
        pushFollow(FOLLOW_expression_in_synpred82_SiddhiQLGrammar2008);
        expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_compareOperation_in_synpred82_SiddhiQLGrammar2010);
        compareOperation();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred82_SiddhiQLGrammar2013);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_SiddhiQLGrammar

    // $ANTLR start synpred83_SiddhiQLGrammar
    public final void synpred83_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: ( boolVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:283:3: boolVal
        {
        pushFollow(FOLLOW_boolVal_in_synpred83_SiddhiQLGrammar2017);
        boolVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_SiddhiQLGrammar

    // $ANTLR start synpred84_SiddhiQLGrammar
    public final void synpred84_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: ( '(' conditionExpression ')' )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:284:6: '(' conditionExpression ')'
        {
        match(input,53,FOLLOW_53_in_synpred84_SiddhiQLGrammar2024); if (state.failed) return ;

        pushFollow(FOLLOW_conditionExpression_in_synpred84_SiddhiQLGrammar2025);
        conditionExpression();

        state._fsp--;
        if (state.failed) return ;

        match(input,54,FOLLOW_54_in_synpred84_SiddhiQLGrammar2027); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_SiddhiQLGrammar

    // $ANTLR start synpred95_SiddhiQLGrammar
    public final void synpred95_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:322:42: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred95_SiddhiQLGrammar2270);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred95_SiddhiQLGrammar

    // $ANTLR start synpred97_SiddhiQLGrammar
    public final void synpred97_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: ( parameters )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:326:42: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred97_SiddhiQLGrammar2321);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_SiddhiQLGrammar

    // $ANTLR start synpred99_SiddhiQLGrammar
    public final void synpred99_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: ( intVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:332:3: intVal
        {
        pushFollow(FOLLOW_intVal_in_synpred99_SiddhiQLGrammar2358);
        intVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_SiddhiQLGrammar

    // $ANTLR start synpred100_SiddhiQLGrammar
    public final void synpred100_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:3: ( longVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:333:3: longVal
        {
        pushFollow(FOLLOW_longVal_in_synpred100_SiddhiQLGrammar2371);
        longVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_SiddhiQLGrammar

    // $ANTLR start synpred101_SiddhiQLGrammar
    public final void synpred101_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:3: ( floatVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:334:3: floatVal
        {
        pushFollow(FOLLOW_floatVal_in_synpred101_SiddhiQLGrammar2384);
        floatVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred101_SiddhiQLGrammar

    // $ANTLR start synpred102_SiddhiQLGrammar
    public final void synpred102_SiddhiQLGrammar_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:3: ( doubleVal )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammar.g:335:3: doubleVal
        {
        pushFollow(FOLLOW_doubleVal_in_synpred102_SiddhiQLGrammar2398);
        doubleVal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred102_SiddhiQLGrammar

    // Delegated rules

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
    public final boolean synpred80_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred41_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred97_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred73_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred71_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred37_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_SiddhiQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred34_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public final boolean synpred95_SiddhiQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_SiddhiQLGrammar_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_IP_in_outputStream435 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_outputStream438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IP_in_outputStream440 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_88_in_inputStream499 = new BitSet(new long[]{0x0020000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sequenceFullStream_in_inputStream503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternFullStream_in_inputStream517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinStream_in_inputStream534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_inputStream549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_inputStream559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_patternFullStream584 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream586 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_patternFullStream588 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_patternFullStream591 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_patternFullStream593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream615 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_patternFullStream619 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_patternFullStream621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rawStream_in_basicStream652 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_transformHandler_in_basicStream654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_basicStream658 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_basicStream660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_windowStream688 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream691 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream694 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_windowStream700 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_windowStream702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_windowStream731 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_returnQuery_in_windowStream733 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_windowStream735 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream738 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream741 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_windowStream747 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_windowStream749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_rawStream791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rawStream815 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_returnQuery_in_rawStream817 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rawStream819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream848 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream850 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream852 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream854 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream857 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream859 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream864 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream889 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream891 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream893 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream896 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream898 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream903 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream927 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream929 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_joinStream931 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream933 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_joinStream936 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_joinStream938 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_joinStream943 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_joinStream945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_leftStream980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_leftStream988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_rightStream1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_rightStream1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_returnQuery1029 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_returnQuery1031 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_returnQuery1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_patternStream1055 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1059 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_patternStream1079 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_patternItem_in_patternStream1081 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1085 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_patternStream1111 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_patternStream1113 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_patternStream1114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_patternStream1115 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_patternStream1119 = new BitSet(new long[]{0x0000000000300000L,0x0000000000200000L});
    public static final BitSet FOLLOW_patternStream_in_patternStream1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_nonEveryPatternStream1150 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FOLLOWED_BY_in_nonEveryPatternStream1155 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceStream_in_sequenceFullStream1179 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_sequenceFullStream1182 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_sequenceFullStream1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1211 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_sequenceStream1213 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1215 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_sequenceStream1219 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream1221 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_patternItem1257 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1265 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_patternItem1267 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1275 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_patternItem1277 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_collect_in_patternItem1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_patternItem1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_patternItem1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1306 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_sequenceItem1308 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1316 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_regex_in_sequenceItem1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_itemStream1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_itemStream1345 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rawStream_in_itemStream1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_regex1371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_regex1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_externalCall_in_outputProjection1391 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C901000L});
    public static final BitSet FOLLOW_outputAttributeList_in_outputProjection1394 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_groupBy_in_outputProjection1396 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_having_in_outputProjection1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_outputAttributeList1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1434 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_outputAttributeList1437 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1439 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_extensionOutFunction_in_outputItem1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1471 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_outputItem1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1488 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_outputItem1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_outputItem1505 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_outputItem1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionOutFunction1532 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionOutFunction1534 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionOutFunction1536 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_extensionOutFunction1539 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionOutFunction1541 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionOutFunction1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_outFunction1569 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_outFunction1571 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_outFunction1573 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_outFunction1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_groupBy1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_groupBy1601 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1603 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_groupBy1606 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1608 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_91_in_having1633 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_having1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_externalCall1655 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_externalCall1657 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_externalCall1659 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_externalCall1661 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_externalCall1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_filterHandler1691 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_filterHandler1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_filterHandler1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_transformHandler1719 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_transform_in_transformHandler1721 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_transformHandler1723 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_extensibleId_in_transformHandler1725 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_transformHandler1729 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_transformHandler1731 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_transformHandler1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_windowHandler1762 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_window_in_windowHandler1764 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_windowHandler1767 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_extensibleId_in_windowHandler1769 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_windowHandler1773 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_windowHandler1775 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_windowHandler1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensibleId1806 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensibleId1808 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensibleId1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensibleId1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1839 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parameters1842 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameter_in_parameters1844 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_constant_in_time1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1891 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1893 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1900 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_collect1907 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStartAndEnd_in_collect1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStart1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countEnd1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionExpression_in_condition1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_conditionExpression1970 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_conditionExpression1973 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compareCondition_in_andCondition1990 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_andCondition1993 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_andCondition1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_compareCondition2008 = new BitSet(new long[]{0x8004000000000000L,0x000000010000801DL});
    public static final BitSet FOLLOW_compareOperation_in_compareCondition2010 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_compareCondition2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_compareCondition2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_compareCondition2024 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_compareCondition2025 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_compareCondition2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notCondition_in_compareCondition2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionCondition_in_compareCondition2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusExpression_in_expression2058 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expression2061 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExpression_in_minusExpression2082 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_minusExpression2085 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_minusExpression_in_minusExpression2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divisionExpression_in_multiplyExpression2106 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_multiplyExpression2109 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_multiplyExpression_in_multiplyExpression2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modExpression_in_divisionExpression2130 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_divisionExpression2133 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_divisionExpression_in_divisionExpression2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpression_in_modExpression2154 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_modExpression2157 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_modExpression_in_modExpression2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpression2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_valueExpression2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_valueExpression2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_valueExpression2203 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_valueExpression2204 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_valueExpression2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpression_in_valueExpression2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_notCondition2231 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_notCondition2233 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_notCondition2234 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_notCondition2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionCondition2260 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionCondition2262 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionCondition2264 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_extensionCondition2268 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionCondition2270 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionCondition2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionId_in_extensionExpression2311 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extensionExpression2313 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionExpression2315 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_extensionExpression2319 = new BitSet(new long[]{0x0460203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_parameters_in_extensionExpression2321 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_extensionExpression2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intVal_in_constant2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_longVal_in_constant2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatVal_in_constant2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleVal_in_constant2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_constant2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringVal_in_constant2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeExpr_in_constant2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_streamId2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamPositionAttributeName_in_attributeVariable2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamAttributeName_in_attributeVariable2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeVariable2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_streamPositionAttributeName2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_streamPositionAttributeName2479 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_streamPositionAttributeName2481 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_streamPositionAttributeName2482 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_streamPositionAttributeName2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamId_in_streamAttributeName2511 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_streamAttributeName2513 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_streamAttributeName2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attributeName2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_join2561 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_join2582 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_join2603 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_join2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_join2643 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_join2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_join2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_window2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_transform2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yearValue_in_timeExpr2759 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_monthValue_in_timeExpr2764 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_weekValue_in_timeExpr2769 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dayValue_in_timeExpr2774 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_hourValue_in_timeExpr2779 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_minuteValue_in_timeExpr2784 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_secondValue_in_timeExpr2789 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_milliSecondValue_in_timeExpr2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_yearValue2841 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_yearValue2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_monthValue2861 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_monthValue2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_weekValue2881 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_set_in_weekValue2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_dayValue2901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_dayValue2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_hourValue2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_set_in_hourValue2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_minuteValue2944 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_set_in_minuteValue2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_secondValue2972 = new BitSet(new long[]{0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_set_in_secondValue2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue3002 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_milliSecondValue3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_intVal3023 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_intVal3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_longVal3045 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_POSITIVE_LONG_VAL_in_longVal3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_floatVal3067 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_doubleVal3089 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_VAL_in_boolVal3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensionId3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_functionId3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_VAL_in_stringVal3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStream_in_synpred7_SiddhiQLGrammar373 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_outputStream_in_synpred7_SiddhiQLGrammar375 = new BitSet(new long[]{0x04A0203C00300080L,0x008000220C905000L});
    public static final BitSet FOLLOW_outputProjection_in_synpred7_SiddhiQLGrammar377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequenceFullStream_in_synpred13_SiddhiQLGrammar503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternFullStream_in_synpred14_SiddhiQLGrammar517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joinStream_in_synpred15_SiddhiQLGrammar534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred16_SiddhiQLGrammar549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred34_SiddhiQLGrammar848 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_synpred34_SiddhiQLGrammar850 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_synpred34_SiddhiQLGrammar852 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_synpred34_SiddhiQLGrammar854 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_synpred34_SiddhiQLGrammar857 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_synpred34_SiddhiQLGrammar859 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred34_SiddhiQLGrammar864 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_synpred34_SiddhiQLGrammar866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred37_SiddhiQLGrammar889 = new BitSet(new long[]{0x0000000000000000L,0x0005001842000000L});
    public static final BitSet FOLLOW_join_in_synpred37_SiddhiQLGrammar891 = new BitSet(new long[]{0x0020000000300000L});
    public static final BitSet FOLLOW_rightStream_in_synpred37_SiddhiQLGrammar893 = new BitSet(new long[]{0x0000000000000002L,0x2000400000000000L});
    public static final BitSet FOLLOW_110_in_synpred37_SiddhiQLGrammar896 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_condition_in_synpred37_SiddhiQLGrammar898 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred37_SiddhiQLGrammar903 = new BitSet(new long[]{0x0400203C00000080L});
    public static final BitSet FOLLOW_time_in_synpred37_SiddhiQLGrammar905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred40_SiddhiQLGrammar980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred41_SiddhiQLGrammar1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred50_SiddhiQLGrammar1257 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred50_SiddhiQLGrammar1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1265 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred51_SiddhiQLGrammar1267 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred51_SiddhiQLGrammar1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred52_SiddhiQLGrammar1275 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_synpred52_SiddhiQLGrammar1277 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_collect_in_synpred52_SiddhiQLGrammar1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_synpred52_SiddhiQLGrammar1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1306 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_synpred53_SiddhiQLGrammar1308 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_itemStream_in_synpred53_SiddhiQLGrammar1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemStream_in_synpred54_SiddhiQLGrammar1316 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_regex_in_synpred54_SiddhiQLGrammar1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionOutFunction_in_synpred64_SiddhiQLGrammar1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred64_SiddhiQLGrammar1471 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred64_SiddhiQLGrammar1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_synpred65_SiddhiQLGrammar1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred65_SiddhiQLGrammar1488 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred65_SiddhiQLGrammar1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred66_SiddhiQLGrammar1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred66_SiddhiQLGrammar1505 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_synpred66_SiddhiQLGrammar1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred67_SiddhiQLGrammar1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred68_SiddhiQLGrammar1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred70_SiddhiQLGrammar1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred71_SiddhiQLGrammar1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred73_SiddhiQLGrammar1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_synpred80_SiddhiQLGrammar1973 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_synpred80_SiddhiQLGrammar1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred82_SiddhiQLGrammar2008 = new BitSet(new long[]{0x8004000000000000L,0x000000010000801DL});
    public static final BitSet FOLLOW_compareOperation_in_synpred82_SiddhiQLGrammar2010 = new BitSet(new long[]{0x0420203C00300080L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_synpred82_SiddhiQLGrammar2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolVal_in_synpred83_SiddhiQLGrammar2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred84_SiddhiQLGrammar2024 = new BitSet(new long[]{0x0420203C00300080L,0x0080202200901000L});
    public static final BitSet FOLLOW_conditionExpression_in_synpred84_SiddhiQLGrammar2025 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred84_SiddhiQLGrammar2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred95_SiddhiQLGrammar2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred97_SiddhiQLGrammar2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intVal_in_synpred99_SiddhiQLGrammar2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_longVal_in_synpred100_SiddhiQLGrammar2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatVal_in_synpred101_SiddhiQLGrammar2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleVal_in_synpred102_SiddhiQLGrammar2398 = new BitSet(new long[]{0x0000000000000002L});

}