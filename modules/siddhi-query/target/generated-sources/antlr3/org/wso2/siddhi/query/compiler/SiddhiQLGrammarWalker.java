// $ANTLR 3.4 org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g 2013-05-16 09:58:01

	package org.wso2.siddhi.query.compiler;

    import org.wso2.siddhi.query.api.ExecutionPlan;
    import org.wso2.siddhi.query.api.QueryFactory;
    import org.wso2.siddhi.query.api.condition.Condition;
    import org.wso2.siddhi.query.api.condition.ConditionExtension;
    import org.wso2.siddhi.query.api.definition.Attribute;
    import org.wso2.siddhi.query.api.definition.StreamDefinition;
    import org.wso2.siddhi.query.api.expression.Expression;
    import org.wso2.siddhi.query.api.expression.ExpressionExtension;
    import org.wso2.siddhi.query.api.expression.Time;
    import org.wso2.siddhi.query.api.expression.Variable;
    import org.wso2.siddhi.query.api.expression.constant.Constant;
    import org.wso2.siddhi.query.api.extension.Extension;
    import org.wso2.siddhi.query.api.query.Query;
    import org.wso2.siddhi.query.api.query.input.BasicStream;
    import org.wso2.siddhi.query.api.query.input.JoinStream;
    import org.wso2.siddhi.query.api.query.input.SingleStream;
    import org.wso2.siddhi.query.api.query.input.Stream;
    import org.wso2.siddhi.query.api.query.input.handler.Filter;
    import org.wso2.siddhi.query.api.query.input.handler.TransformExtension;
    import org.wso2.siddhi.query.api.query.input.handler.Transformer;
    import org.wso2.siddhi.query.api.query.input.handler.Window;
    import org.wso2.siddhi.query.api.query.input.handler.WindowExtension;
    import org.wso2.siddhi.query.api.query.input.pattern.Pattern;
    import org.wso2.siddhi.query.api.query.input.pattern.PatternStream;
    import org.wso2.siddhi.query.api.query.input.pattern.element.LogicalElement;
    import org.wso2.siddhi.query.api.query.input.pattern.element.PatternElement;
    import org.wso2.siddhi.query.api.query.input.sequence.Sequence;
    import org.wso2.siddhi.query.api.query.input.sequence.SequenceStream;
    import org.wso2.siddhi.query.api.query.input.sequence.element.SequenceElement;
    import org.wso2.siddhi.query.api.query.output.OutStream;
    import org.wso2.siddhi.query.api.query.projection.Projector;
    import org.wso2.siddhi.query.api.query.projection.attribute.ComplexAttribute;
    import org.wso2.siddhi.query.api.query.projection.attribute.OutputAttribute;
    import org.wso2.siddhi.query.api.query.projection.attribute.OutputAttributeExtension;
    import org.wso2.siddhi.query.api.query.projection.attribute.SimpleAttribute;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SiddhiQLGrammarWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SiddhiQLGrammarWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SiddhiQLGrammarWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SiddhiQLGrammarWalker.tokenNames; }
    public String getGrammarFileName() { return "org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g"; }



    // $ANTLR start "executionPlan"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:50:1: executionPlan returns [List<ExecutionPlan> executionPlanList] : ( ^( DEFINITION definitionStream ) )* ( query )* ;
    public final List<ExecutionPlan> executionPlan() throws RecognitionException {
        List<ExecutionPlan> executionPlanList = null;


        StreamDefinition definitionStream1 =null;



                executionPlanList =new ArrayList<ExecutionPlan>();
            
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:2: ( ( ^( DEFINITION definitionStream ) )* ( query )* )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:4: ( ^( DEFINITION definitionStream ) )* ( query )*
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:4: ( ^( DEFINITION definitionStream ) )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case DEFINITION:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:5: ^( DEFINITION definitionStream )
            	    {
            	    match(input,DEFINITION,FOLLOW_DEFINITION_in_executionPlan67); if (state.failed) return executionPlanList;

            	    match(input, Token.DOWN, null); if (state.failed) return executionPlanList;
            	    pushFollow(FOLLOW_definitionStream_in_executionPlan69);
            	    definitionStream1=definitionStream();

            	    state._fsp--;
            	    if (state.failed) return executionPlanList;

            	    if ( state.backtracking==0 ) {executionPlanList.add(definitionStream1);}

            	    match(input, Token.UP, null); if (state.failed) return executionPlanList;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:101: ( query )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case QUERY:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:102: query
            	    {
            	    pushFollow(FOLLOW_query_in_executionPlan78);
            	    query();

            	    state._fsp--;
            	    if (state.failed) return executionPlanList;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return executionPlanList;
    }
    // $ANTLR end "executionPlan"



    // $ANTLR start "definitionStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:57:1: definitionStream returns [StreamDefinition streamDefinition] : ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) ;
    public final StreamDefinition definitionStream() throws RecognitionException {
        StreamDefinition streamDefinition = null;


        CommonTree IP5=null;
        String streamId2 =null;

        String attributeName3 =null;

        Attribute.Type type4 =null;



                streamDefinition = QueryFactory.createStreamDefinition();
            
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:2: ( ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:5: ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? )
            {
            pushFollow(FOLLOW_streamId_in_definitionStream106);
            streamId2=streamId();

            state._fsp--;
            if (state.failed) return streamDefinition;

            if ( state.backtracking==0 ) {streamDefinition.name(streamId2);}

            match(input, Token.DOWN, null); if (state.failed) return streamDefinition;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:59: ( ^( IN_ATTRIBUTE attributeName type ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case IN_ATTRIBUTE:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:60: ^( IN_ATTRIBUTE attributeName type )
            	    {
            	    match(input,IN_ATTRIBUTE,FOLLOW_IN_ATTRIBUTE_in_definitionStream112); if (state.failed) return streamDefinition;

            	    match(input, Token.DOWN, null); if (state.failed) return streamDefinition;
            	    pushFollow(FOLLOW_attributeName_in_definitionStream114);
            	    attributeName3=attributeName();

            	    state._fsp--;
            	    if (state.failed) return streamDefinition;

            	    pushFollow(FOLLOW_type_in_definitionStream116);
            	    type4=type();

            	    state._fsp--;
            	    if (state.failed) return streamDefinition;

            	    if ( state.backtracking==0 ) {streamDefinition.attribute(attributeName3, type4);}

            	    match(input, Token.UP, null); if (state.failed) return streamDefinition;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return streamDefinition;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:164: ( IP )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case IP:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:165: IP
                    {
                    IP5=(CommonTree)match(input,IP,FOLLOW_IP_in_definitionStream126); if (state.failed) return streamDefinition;

                    if ( state.backtracking==0 ) {streamDefinition.ip((IP5!=null?IP5.getText():null));}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return streamDefinition;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return streamDefinition;
    }
    // $ANTLR end "definitionStream"



    // $ANTLR start "query"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:64:1: query returns [Query query] : ( ^( QUERY outputStream inputStream outputProjection ) | ^( QUERY inputStream outputProjection ) );
    public final Query query() throws RecognitionException {
        Query query = null;


        OutStream outputStream6 =null;

        Stream inputStream7 =null;

        Projector outputProjection8 =null;

        Stream inputStream9 =null;

        Projector outputProjection10 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:65:2: ( ^( QUERY outputStream inputStream outputProjection ) | ^( QUERY inputStream outputProjection ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case QUERY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case OUT_STREAM:
                        {
                        alt5=1;
                        }
                        break;
                    case JOIN:
                    case PATTERN_FULL:
                    case SEQUENCE_FULL:
                    case STREAM:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return query;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return query;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return query;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:65:4: ^( QUERY outputStream inputStream outputProjection )
                    {
                    match(input,QUERY,FOLLOW_QUERY_in_query147); if (state.failed) return query;

                    match(input, Token.DOWN, null); if (state.failed) return query;
                    pushFollow(FOLLOW_outputStream_in_query149);
                    outputStream6=outputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_inputStream_in_query151);
                    inputStream7=inputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_outputProjection_in_query153);
                    outputProjection8=outputProjection();

                    state._fsp--;
                    if (state.failed) return query;

                    match(input, Token.UP, null); if (state.failed) return query;


                    if ( state.backtracking==0 ) {query = QueryFactory.createQuery().outStream(outputStream6).
                    																						from(inputStream7).
                    																						project(outputProjection8);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:68:4: ^( QUERY inputStream outputProjection )
                    {
                    match(input,QUERY,FOLLOW_QUERY_in_query163); if (state.failed) return query;

                    match(input, Token.DOWN, null); if (state.failed) return query;
                    pushFollow(FOLLOW_inputStream_in_query165);
                    inputStream9=inputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_outputProjection_in_query167);
                    outputProjection10=outputProjection();

                    state._fsp--;
                    if (state.failed) return query;

                    match(input, Token.UP, null); if (state.failed) return query;


                    if ( state.backtracking==0 ) {query = QueryFactory.createQuery().from(inputStream9).
                    																						project(outputProjection10);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return query;
    }
    // $ANTLR end "query"



    // $ANTLR start "outputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:72:1: outputStream returns [OutStream value] : ^( OUT_STREAM streamId ( outputType )? ( IP )? ) ;
    public final OutStream outputStream() throws RecognitionException {
        OutStream value = null;


        CommonTree IP13=null;
        String streamId11 =null;

        OutStream.OutputEvents outputType12 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:2: ( ^( OUT_STREAM streamId ( outputType )? ( IP )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:5: ^( OUT_STREAM streamId ( outputType )? ( IP )? )
            {
            match(input,OUT_STREAM,FOLLOW_OUT_STREAM_in_outputStream188); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_streamId_in_outputStream190);
            streamId11=streamId();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =new OutStream(streamId11);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:68: ( outputType )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case 73:
                case 80:
                case 86:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:69: outputType
                    {
                    pushFollow(FOLLOW_outputType_in_outputStream195);
                    outputType12=outputType();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new OutStream(streamId11,outputType12);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:146: ( IP )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case IP:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:73:147: IP
                    {
                    IP13=(CommonTree)match(input,IP,FOLLOW_IP_in_outputStream202); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value.setIp((IP13!=null?IP13.getText():null));}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "outputStream"



    // $ANTLR start "outputType"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:76:1: outputType returns [OutStream.OutputEvents outputType] : ( 'expired-events' | 'current-events' | 'all-events' );
    public final OutStream.OutputEvents outputType() throws RecognitionException {
        OutStream.OutputEvents outputType = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:77:2: ( 'expired-events' | 'current-events' | 'all-events' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt8=1;
                }
                break;
            case 80:
                {
                alt8=2;
                }
                break;
            case 73:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return outputType;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:77:4: 'expired-events'
                    {
                    match(input,86,FOLLOW_86_in_outputType222); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.EXPIRED_EVENTS;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:78:4: 'current-events'
                    {
                    match(input,80,FOLLOW_80_in_outputType229); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.CURRENT_EVENTS;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:4: 'all-events'
                    {
                    match(input,73,FOLLOW_73_in_outputType236); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.ALL_EVENTS;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return outputType;
    }
    // $ANTLR end "outputType"



    // $ANTLR start "inputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:82:1: inputStream returns [Stream inStream] : ( ^( SEQUENCE_FULL sequenceFullStream ) | ^( PATTERN_FULL patternFullStream ) | ^( JOIN joinStream ) | windowStream | basicStream );
    public final Stream inputStream() throws RecognitionException {
        Stream inStream = null;


        SequenceStream sequenceFullStream14 =null;

        PatternStream patternFullStream15 =null;

        Stream joinStream16 =null;

        SingleStream windowStream17 =null;

        BasicStream basicStream18 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:83:2: ( ^( SEQUENCE_FULL sequenceFullStream ) | ^( PATTERN_FULL patternFullStream ) | ^( JOIN joinStream ) | windowStream | basicStream )
            int alt9=5;
            switch ( input.LA(1) ) {
            case SEQUENCE_FULL:
                {
                alt9=1;
                }
                break;
            case PATTERN_FULL:
                {
                alt9=2;
                }
                break;
            case JOIN:
                {
                alt9=3;
                }
                break;
            case STREAM:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred13_SiddhiQLGrammarWalker()) ) {
                    alt9=4;
                }
                else if ( (true) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return inStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return inStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:83:4: ^( SEQUENCE_FULL sequenceFullStream )
                    {
                    match(input,SEQUENCE_FULL,FOLLOW_SEQUENCE_FULL_in_inputStream258); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_sequenceFullStream_in_inputStream260);
                    sequenceFullStream14=sequenceFullStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =sequenceFullStream14;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:84:4: ^( PATTERN_FULL patternFullStream )
                    {
                    match(input,PATTERN_FULL,FOLLOW_PATTERN_FULL_in_inputStream269); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_patternFullStream_in_inputStream272);
                    patternFullStream15=patternFullStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =patternFullStream15;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:85:4: ^( JOIN joinStream )
                    {
                    match(input,JOIN,FOLLOW_JOIN_in_inputStream282); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_joinStream_in_inputStream284);
                    joinStream16=joinStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =joinStream16;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:86:4: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_inputStream293);
                    windowStream17=windowStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    if ( state.backtracking==0 ) {inStream =windowStream17;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:87:4: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_inputStream309);
                    basicStream18=basicStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    if ( state.backtracking==0 ) {inStream =basicStream18;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return inStream;
    }
    // $ANTLR end "inputStream"



    // $ANTLR start "basicStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:90:1: basicStream returns [BasicStream basicStream] : ^( STREAM rawStream ( transformHandler )? ( id )? ) ;
    public final BasicStream basicStream() throws RecognitionException {
        BasicStream basicStream = null;


        BasicStream rawStream19 =null;

        Transformer transformHandler20 =null;

        String id21 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:2: ( ^( STREAM rawStream ( transformHandler )? ( id )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:4: ^( STREAM rawStream ( transformHandler )? ( id )? )
            {
            match(input,STREAM,FOLLOW_STREAM_in_basicStream340); if (state.failed) return basicStream;

            match(input, Token.DOWN, null); if (state.failed) return basicStream;
            pushFollow(FOLLOW_rawStream_in_basicStream342);
            rawStream19=rawStream();

            state._fsp--;
            if (state.failed) return basicStream;

            if ( state.backtracking==0 ) {basicStream =rawStream19;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:60: ( transformHandler )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case TRANSFORM:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:61: transformHandler
                    {
                    pushFollow(FOLLOW_transformHandler_in_basicStream347);
                    transformHandler20=transformHandler();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setTransformer(transformHandler20);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:142: ( id )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case ID:
                case ID_QUOTES:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:143: id
                    {
                    pushFollow(FOLLOW_id_in_basicStream354);
                    id21=id();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setStreamReferenceId(id21);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return basicStream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return basicStream;
    }
    // $ANTLR end "basicStream"



    // $ANTLR start "windowStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:94:1: windowStream returns [SingleStream singleStream] : ( ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) );
    public final SingleStream windowStream() throws RecognitionException {
        SingleStream singleStream = null;


        BasicStream returnQuery22 =null;

        Filter filterHandler23 =null;

        Transformer transformHandler24 =null;

        Window windowHandler25 =null;

        String id26 =null;

        String streamId27 =null;

        Filter filterHandler28 =null;

        Transformer transformHandler29 =null;

        Window windowHandler30 =null;

        String id31 =null;



        		BasicStream rawStream=null;
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:2: ( ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ANONYMOUS:
                        {
                        alt18=1;
                        }
                        break;
                    case ID:
                    case ID_QUOTES:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return singleStream;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:4: ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                    match(input,STREAM,FOLLOW_STREAM_in_windowStream383); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    match(input,ANONYMOUS,FOLLOW_ANONYMOUS_in_windowStream387); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    pushFollow(FOLLOW_returnQuery_in_windowStream389);
                    returnQuery22=returnQuery();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {rawStream=returnQuery22;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:71: ( filterHandler )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:72: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream394);
                            filterHandler23=filterHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler23);}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:134: ( transformHandler )?
                    int alt13=2;
                    switch ( input.LA(1) ) {
                        case TRANSFORM:
                            {
                            alt13=1;
                            }
                            break;
                    }

                    switch (alt13) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:135: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream401);
                            transformHandler24=transformHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setTransformer(transformHandler24);}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream408);
                    windowHandler25=windowHandler();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =rawStream.window(windowHandler25);}

                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:287: ( id )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case ID:
                        case ID_QUOTES:
                            {
                            alt14=1;
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:98:288: id
                            {
                            pushFollow(FOLLOW_id_in_windowStream415);
                            id26=id();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {singleStream.setStreamReferenceId(id26);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:4: ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                    match(input,STREAM,FOLLOW_STREAM_in_windowStream426); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    pushFollow(FOLLOW_streamId_in_windowStream430);
                    streamId27=streamId();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {rawStream=QueryFactory.inputStream(streamId27);}

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:80: ( filterHandler )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt15=1;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:81: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream435);
                            filterHandler28=filterHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler28);}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:143: ( transformHandler )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case TRANSFORM:
                            {
                            alt16=1;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:144: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream442);
                            transformHandler29=transformHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setTransformer(transformHandler29);}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream449);
                    windowHandler30=windowHandler();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =rawStream.window(windowHandler30);}

                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:296: ( id )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case ID:
                        case ID_QUOTES:
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:99:297: id
                            {
                            pushFollow(FOLLOW_id_in_windowStream456);
                            id31=id();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {singleStream.setStreamReferenceId(id31);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "windowStream"



    // $ANTLR start "rawStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:102:1: rawStream returns [BasicStream rawStream] : ( ^( ANONYMOUS returnQuery ( filterHandler )? ) | ^( streamId ( filterHandler )? ) );
    public final BasicStream rawStream() throws RecognitionException {
        BasicStream rawStream = null;


        BasicStream returnQuery32 =null;

        Filter filterHandler33 =null;

        String streamId34 =null;

        Filter filterHandler35 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:103:2: ( ^( ANONYMOUS returnQuery ( filterHandler )? ) | ^( streamId ( filterHandler )? ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case ANONYMOUS:
                {
                alt21=1;
                }
                break;
            case ID:
            case ID_QUOTES:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return rawStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:103:4: ^( ANONYMOUS returnQuery ( filterHandler )? )
                    {
                    match(input,ANONYMOUS,FOLLOW_ANONYMOUS_in_rawStream478); if (state.failed) return rawStream;

                    match(input, Token.DOWN, null); if (state.failed) return rawStream;
                    pushFollow(FOLLOW_returnQuery_in_rawStream480);
                    returnQuery32=returnQuery();

                    state._fsp--;
                    if (state.failed) return rawStream;

                    if ( state.backtracking==0 ) {rawStream =returnQuery32;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:103:63: ( filterHandler )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:103:64: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream485);
                            filterHandler33=filterHandler();

                            state._fsp--;
                            if (state.failed) return rawStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler33);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return rawStream;


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:4: ^( streamId ( filterHandler )? )
                    {
                    pushFollow(FOLLOW_streamId_in_rawStream498);
                    streamId34=streamId();

                    state._fsp--;
                    if (state.failed) return rawStream;

                    if ( state.backtracking==0 ) {rawStream =QueryFactory.inputStream(streamId34);}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return rawStream;
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:71: ( filterHandler )?
                        int alt20=2;
                        switch ( input.LA(1) ) {
                            case FILTER:
                                {
                                alt20=1;
                                }
                                break;
                        }

                        switch (alt20) {
                            case 1 :
                                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:72: filterHandler
                                {
                                pushFollow(FOLLOW_filterHandler_in_rawStream503);
                                filterHandler35=filterHandler();

                                state._fsp--;
                                if (state.failed) return rawStream;

                                if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler35);}

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return rawStream;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rawStream;
    }
    // $ANTLR end "rawStream"


    protected static class joinStream_scope {
        Condition onCondition;
        Expression within;
    }
    protected Stack joinStream_stack = new Stack();



    // $ANTLR start "joinStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:107:1: joinStream returns [Stream stream] : ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( condition )? ( time )? );
    public final Stream joinStream() throws RecognitionException {
        joinStream_stack.push(new joinStream_scope());
        Stream stream = null;


        Condition condition36 =null;

        Expression time37 =null;

        SingleStream leftStream38 =null;

        JoinStream.Type join39 =null;

        SingleStream rightStream40 =null;

        Condition condition41 =null;

        Expression time42 =null;

        SingleStream leftStream43 =null;

        JoinStream.Type join44 =null;

        SingleStream rightStream45 =null;

        Condition condition46 =null;

        Expression time47 =null;

        SingleStream leftStream48 =null;

        JoinStream.Type join49 =null;

        SingleStream rightStream50 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:2: ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( condition )? ( time )? )
            int alt28=3;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred28_SiddhiQLGrammarWalker()) ) {
                    alt28=1;
                }
                else if ( (synpred31_SiddhiQLGrammarWalker()) ) {
                    alt28=2;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return stream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:4: leftStream join rightStream 'unidirectional' ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream529);
                    leftStream38=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream532);
                    join39=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream534);
                    rightStream40=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    match(input,121,FOLLOW_121_in_joinStream536); if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:50: ( condition )?
                    int alt22=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt22=1;
                            }
                            break;
                    }

                    switch (alt22) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:51: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream539);
                            condition36=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition36;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:112: ( time )?
                    int alt23=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt23=1;
                            }
                            break;
                    }

                    switch (alt23) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:113: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream546);
                            time37=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time37;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream38,join39,rightStream40,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within,JoinStream.EventTrigger.RIGHT);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:4: leftStream join rightStream ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream557);
                    leftStream43=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream559);
                    join44=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream561);
                    rightStream45=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:32: ( condition )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:33: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream564);
                            condition41=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition41;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:94: ( time )?
                    int alt25=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt25=1;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:95: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream571);
                            time42=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time42;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream43,join44,rightStream45,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:114:4: leftStream 'unidirectional' join rightStream ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream588);
                    leftStream48=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    match(input,121,FOLLOW_121_in_joinStream590); if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream593);
                    join49=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream595);
                    rightStream50=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:114:50: ( condition )?
                    int alt26=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt26=1;
                            }
                            break;
                    }

                    switch (alt26) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:114:51: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream598);
                            condition46=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition46;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:114:112: ( time )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:114:113: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream605);
                            time47=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time47;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream48,join49,rightStream50,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within,JoinStream.EventTrigger.LEFT);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            joinStream_stack.pop();
        }
        return stream;
    }
    // $ANTLR end "joinStream"



    // $ANTLR start "leftStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:117:1: leftStream returns [SingleStream singleStream] : ( windowStream | basicStream );
    public final SingleStream leftStream() throws RecognitionException {
        SingleStream singleStream = null;


        SingleStream windowStream51 =null;

        BasicStream basicStream52 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:5: ( windowStream | basicStream )
            int alt29=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA29_1 = input.LA(2);

                if ( (synpred34_SiddhiQLGrammarWalker()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:8: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_leftStream630);
                    windowStream51=windowStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =windowStream51;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:8: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_leftStream641);
                    basicStream52=basicStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =basicStream52;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "leftStream"



    // $ANTLR start "rightStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:122:1: rightStream returns [SingleStream singleStream] : ( windowStream | basicStream );
    public final SingleStream rightStream() throws RecognitionException {
        SingleStream singleStream = null;


        SingleStream windowStream53 =null;

        BasicStream basicStream54 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:123:5: ( windowStream | basicStream )
            int alt30=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA30_1 = input.LA(2);

                if ( (synpred35_SiddhiQLGrammarWalker()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:123:8: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_rightStream666);
                    windowStream53=windowStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =windowStream53;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:124:8: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_rightStream677);
                    basicStream54=basicStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =basicStream54;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "rightStream"



    // $ANTLR start "returnQuery"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:127:1: returnQuery returns [BasicStream stream] : ^( RETURN_QUERY inputStream outputProjection ) ;
    public final BasicStream returnQuery() throws RecognitionException {
        BasicStream stream = null;


        Stream inputStream55 =null;

        Projector outputProjection56 =null;



        		System.err.println("Return Query not yet supported!");
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:131:2: ( ^( RETURN_QUERY inputStream outputProjection ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:131:4: ^( RETURN_QUERY inputStream outputProjection )
            {
            match(input,RETURN_QUERY,FOLLOW_RETURN_QUERY_in_returnQuery705); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_inputStream_in_returnQuery708);
            inputStream55=inputStream();

            state._fsp--;
            if (state.failed) return stream;

            pushFollow(FOLLOW_outputProjection_in_returnQuery710);
            outputProjection56=outputProjection();

            state._fsp--;
            if (state.failed) return stream;

            match(input, Token.UP, null); if (state.failed) return stream;


            if ( state.backtracking==0 ) {stream=QueryFactory.createQuery().from(inputStream55).project(outputProjection56).returnStream();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "returnQuery"



    // $ANTLR start "patternFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:134:1: patternFullStream returns [PatternStream stream] : ^( PATTERN patternStream ( time )? ) ;
    public final PatternStream patternFullStream() throws RecognitionException {
        PatternStream stream = null;


        PatternElement patternStream57 =null;

        Expression time58 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:135:2: ( ^( PATTERN patternStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:135:4: ^( PATTERN patternStream ( time )? )
            {
            match(input,PATTERN,FOLLOW_PATTERN_in_patternFullStream729); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_patternStream_in_patternFullStream732);
            patternStream57=patternStream();

            state._fsp--;
            if (state.failed) return stream;

            if ( state.backtracking==0 ) {stream= QueryFactory.patternStream(patternStream57);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:135:91: ( time )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case CONSTANT:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:135:92: time
                    {
                    pushFollow(FOLLOW_time_in_patternFullStream737);
                    time58=time();

                    state._fsp--;
                    if (state.failed) return stream;

                    if ( state.backtracking==0 ) {stream= QueryFactory.patternStream(patternStream57,(Constant)time58);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return stream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "patternFullStream"



    // $ANTLR start "patternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:138:1: patternStream returns [PatternElement element] : ( ^( 'every' patternItem ) (p= patternStream )? | ^( 'every' nonEveryPatternStream ) (p= patternStream )? | patternItem (p= patternStream )? );
    public final PatternElement patternStream() throws RecognitionException {
        PatternElement element = null;


        PatternElement p =null;

        PatternElement patternItem59 =null;

        PatternElement nonEveryPatternStream60 =null;

        PatternElement patternItem61 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:2: ( ^( 'every' patternItem ) (p= patternStream )? | ^( 'every' nonEveryPatternStream ) (p= patternStream )? | patternItem (p= patternStream )? )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                int LA35_1 = input.LA(2);

                if ( (synpred38_SiddhiQLGrammarWalker()) ) {
                    alt35=1;
                }
                else if ( (synpred40_SiddhiQLGrammarWalker()) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
                }
                break;
            case COLLECT:
            case STREAM:
            case 74:
            case 111:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:4: ^( 'every' patternItem ) (p= patternStream )?
                    {
                    match(input,85,FOLLOW_85_in_patternStream760); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_patternItem_in_patternStream763);
                    patternItem59=patternItem();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element =Pattern.every(patternItem59);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:76: (p= patternStream )?
                    int alt32=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 74:
                        case 85:
                        case 111:
                            {
                            alt32=1;
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:77: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream771);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:4: ^( 'every' nonEveryPatternStream ) (p= patternStream )?
                    {
                    match(input,85,FOLLOW_85_in_patternStream781); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_nonEveryPatternStream_in_patternStream783);
                    nonEveryPatternStream60=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element =Pattern.every(nonEveryPatternStream60);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:98: (p= patternStream )?
                    int alt33=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 74:
                        case 85:
                        case 111:
                            {
                            alt33=1;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:99: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream794);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:4: patternItem (p= patternStream )?
                    {
                    pushFollow(FOLLOW_patternItem_in_patternStream803);
                    patternItem61=patternItem();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =patternItem61;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:49: (p= patternStream )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 74:
                        case 85:
                        case 111:
                            {
                            alt34=1;
                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:50: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream810);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "patternStream"



    // $ANTLR start "nonEveryPatternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:144:1: nonEveryPatternStream returns [PatternElement element] : patternItem (p= nonEveryPatternStream )? ;
    public final PatternElement nonEveryPatternStream() throws RecognitionException {
        PatternElement element = null;


        PatternElement p =null;

        PatternElement patternItem62 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:2: ( patternItem (p= nonEveryPatternStream )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:4: patternItem (p= nonEveryPatternStream )?
            {
            pushFollow(FOLLOW_patternItem_in_nonEveryPatternStream833);
            patternItem62=patternItem();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {element =patternItem62;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:49: (p= nonEveryPatternStream )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case COLLECT:
                case STREAM:
                case 74:
                case 111:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:50: p= nonEveryPatternStream
                    {
                    pushFollow(FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream840);
                    p=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "nonEveryPatternStream"



    // $ANTLR start "sequenceFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:148:1: sequenceFullStream returns [SequenceStream stream] : ^( SEQUENCE sequenceStream ( time )? ) ;
    public final SequenceStream sequenceFullStream() throws RecognitionException {
        SequenceStream stream = null;


        SequenceElement sequenceStream63 =null;

        Expression time64 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:149:2: ( ^( SEQUENCE sequenceStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:149:4: ^( SEQUENCE sequenceStream ( time )? )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequenceFullStream860); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_sequenceStream_in_sequenceFullStream863);
            sequenceStream63=sequenceStream();

            state._fsp--;
            if (state.failed) return stream;

            if ( state.backtracking==0 ) {stream= QueryFactory.sequenceStream(sequenceStream63);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:149:95: ( time )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case CONSTANT:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:149:96: time
                    {
                    pushFollow(FOLLOW_time_in_sequenceFullStream868);
                    time64=time();

                    state._fsp--;
                    if (state.failed) return stream;

                    if ( state.backtracking==0 ) {stream= QueryFactory.sequenceStream(sequenceStream63,(Constant)time64);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return stream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "sequenceFullStream"



    // $ANTLR start "sequenceStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:152:1: sequenceStream returns [SequenceElement element] : ( sequenceItem )+ ;
    public final SequenceElement sequenceStream() throws RecognitionException {
        SequenceElement element = null;


        SequenceElement sequenceItem65 =null;



        		List<SequenceElement> elementList=new ArrayList<SequenceElement>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:162:2: ( ( sequenceItem )+ )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:162:5: ( sequenceItem )+
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:162:5: ( sequenceItem )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case REGEX:
                case STREAM:
                case 111:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:162:6: sequenceItem
            	    {
            	    pushFollow(FOLLOW_sequenceItem_in_sequenceStream902);
            	    sequenceItem65=sequenceItem();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {elementList.add(sequenceItem65);}

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
            		element =elementList.get(elementList.size()-1);
            		for(int i=elementList.size()-2;i>=0;i--){
            			element =Sequence.next(elementList.get(i),element);
            		}
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "sequenceStream"



    // $ANTLR start "patternItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:165:1: patternItem returns [PatternElement element] : ( ^( 'and' i1= itemStream i2= itemStream ) | ^( 'or' i1= itemStream i2= itemStream ) | ^( COLLECT itemStream collect ) | itemStream );
    public final PatternElement patternItem() throws RecognitionException {
        PatternElement element = null;


        BasicStream i1 =null;

        BasicStream i2 =null;

        BasicStream itemStream66 =null;

        SiddhiQLGrammarWalker.collect_return collect67 =null;

        BasicStream itemStream68 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:166:2: ( ^( 'and' i1= itemStream i2= itemStream ) | ^( 'or' i1= itemStream i2= itemStream ) | ^( COLLECT itemStream collect ) | itemStream )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt39=1;
                }
                break;
            case 111:
                {
                alt39=2;
                }
                break;
            case COLLECT:
                {
                alt39=3;
                }
                break;
            case STREAM:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:166:4: ^( 'and' i1= itemStream i2= itemStream )
                    {
                    match(input,74,FOLLOW_74_in_patternItem924); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem928);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_patternItem932);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.logical(i1,LogicalElement.Type.AND,i2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:167:4: ^( 'or' i1= itemStream i2= itemStream )
                    {
                    match(input,111,FOLLOW_111_in_patternItem942); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem947);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_patternItem951);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.logical(i1,LogicalElement.Type.OR,i2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:168:4: ^( COLLECT itemStream collect )
                    {
                    match(input,COLLECT,FOLLOW_COLLECT_in_patternItem960); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem962);
                    itemStream66=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_collect_in_patternItem964);
                    collect67=collect();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.count(itemStream66,(collect67!=null?collect67.startVal:0),(collect67!=null?collect67.endVal:0));}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:169:4: itemStream
                    {
                    pushFollow(FOLLOW_itemStream_in_patternItem973);
                    itemStream68=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element=itemStream68;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "patternItem"



    // $ANTLR start "sequenceItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:172:1: sequenceItem returns [SequenceElement element] : ( ^( 'or' i1= itemStream i2= itemStream ) | ^( REGEX itemStream regex[$itemStream.basicStream] ) | itemStream );
    public final SequenceElement sequenceItem() throws RecognitionException {
        SequenceElement element = null;


        BasicStream i1 =null;

        BasicStream i2 =null;

        BasicStream itemStream69 =null;

        SequenceElement regex70 =null;

        BasicStream itemStream71 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:173:2: ( ^( 'or' i1= itemStream i2= itemStream ) | ^( REGEX itemStream regex[$itemStream.basicStream] ) | itemStream )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt40=1;
                }
                break;
            case REGEX:
                {
                alt40=2;
                }
                break;
            case STREAM:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:173:4: ^( 'or' i1= itemStream i2= itemStream )
                    {
                    match(input,111,FOLLOW_111_in_sequenceItem996); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1000);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_sequenceItem1004);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Sequence.or(i1,i2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:174:4: ^( REGEX itemStream regex[$itemStream.basicStream] )
                    {
                    match(input,REGEX,FOLLOW_REGEX_in_sequenceItem1018); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1020);
                    itemStream69=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_regex_in_sequenceItem1022);
                    regex70=regex(itemStream69);

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=regex70;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:175:4: itemStream
                    {
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1033);
                    itemStream71=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element=itemStream71;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "sequenceItem"



    // $ANTLR start "itemStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:178:1: itemStream returns [BasicStream basicStream] : ^( STREAM rawStream ( attributeName )? ) ;
    public final BasicStream itemStream() throws RecognitionException {
        BasicStream basicStream = null;


        BasicStream rawStream72 =null;

        String attributeName73 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:2: ( ^( STREAM rawStream ( attributeName )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:4: ^( STREAM rawStream ( attributeName )? )
            {
            match(input,STREAM,FOLLOW_STREAM_in_itemStream1064); if (state.failed) return basicStream;

            match(input, Token.DOWN, null); if (state.failed) return basicStream;
            pushFollow(FOLLOW_rawStream_in_itemStream1066);
            rawStream72=rawStream();

            state._fsp--;
            if (state.failed) return basicStream;

            if ( state.backtracking==0 ) {basicStream =rawStream72;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:59: ( attributeName )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case ATTRIBUTE:
                    {
                    alt41=1;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:60: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_itemStream1070);
                    attributeName73=attributeName();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setStreamReferenceId(attributeName73);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return basicStream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return basicStream;
    }
    // $ANTLR end "itemStream"



    // $ANTLR start "regex"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:183:1: regex[BasicStream basicStream] returns [SequenceElement element] : ( '*' | '+' | '?' ) ( '?' )? ;
    public final SequenceElement regex(BasicStream basicStream) throws RecognitionException {
        SequenceElement element = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:2: ( ( '*' | '+' | '?' ) ( '?' )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:4: ( '*' | '+' | '?' ) ( '?' )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:4: ( '*' | '+' | '?' )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt42=1;
                }
                break;
            case 56:
                {
                alt42=2;
                }
                break;
            case 69:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:5: '*'
                    {
                    match(input,55,FOLLOW_55_in_regex1096); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.zeroOrMany(basicStream);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:56: '+'
                    {
                    match(input,56,FOLLOW_56_in_regex1101); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.oneOrMany(basicStream);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:105: '?'
                    {
                    match(input,69,FOLLOW_69_in_regex1105); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.zeroOrOne(basicStream);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:155: ( '?' )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case 69:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:156: '?'
                    {
                    match(input,69,FOLLOW_69_in_regex1111); if (state.failed) return element;

                    if ( state.backtracking==0 ) {System.err.println(" ? variation in regex not yet supported!");}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "regex"



    // $ANTLR start "outputProjection"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:187:1: outputProjection returns [Projector projector] : ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? ;
    public final Projector outputProjection() throws RecognitionException {
        Projector projector = null;


        List<OutputAttribute> outputAttributeList74 =null;

        List<Variable> groupBy75 =null;

        Condition having76 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:188:2: ( ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:188:4: ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )?
            {
            if ( state.backtracking==0 ) {projector = QueryFactory.outputProjector();}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:189:3: ( externalCall )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 78:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:189:3: externalCall
                    {
                    pushFollow(FOLLOW_externalCall_in_outputProjection1135);
                    externalCall();

                    state._fsp--;
                    if (state.failed) return projector;

                    }
                    break;

            }


            match(input,OUT_ATTRIBUTES,FOLLOW_OUT_ATTRIBUTES_in_outputProjection1142); if (state.failed) return projector;

            match(input, Token.DOWN, null); if (state.failed) return projector;
            pushFollow(FOLLOW_outputAttributeList_in_outputProjection1144);
            outputAttributeList74=outputAttributeList();

            state._fsp--;
            if (state.failed) return projector;

            if ( state.backtracking==0 ) {projector.addProjectionList(outputAttributeList74);}

            match(input, Token.UP, null); if (state.failed) return projector;


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:191:3: ( groupBy )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case 90:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:191:4: groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_outputProjection1154);
                    groupBy75=groupBy();

                    state._fsp--;
                    if (state.failed) return projector;

                    if ( state.backtracking==0 ) {projector.addGroupByList(groupBy75);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:192:3: ( having )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case 91:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:192:4: having
                    {
                    pushFollow(FOLLOW_having_in_outputProjection1163);
                    having76=having();

                    state._fsp--;
                    if (state.failed) return projector;

                    if ( state.backtracking==0 ) {projector.having(having76);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return projector;
    }
    // $ANTLR end "outputProjection"



    // $ANTLR start "outputAttributeList"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:195:1: outputAttributeList returns [List<OutputAttribute> attributeList] : ( '*' | ( ^( OUT_ATTRIBUTE outputItem ) )+ );
    public final List<OutputAttribute> outputAttributeList() throws RecognitionException {
        List<OutputAttribute> attributeList = null;


        OutputAttribute outputItem77 =null;



        		attributeList =new ArrayList<OutputAttribute>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:199:2: ( '*' | ( ^( OUT_ATTRIBUTE outputItem ) )+ )
            int alt48=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt48=1;
                }
                break;
            case OUT_ATTRIBUTE:
                {
                alt48=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return attributeList;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:199:4: '*'
                    {
                    match(input,55,FOLLOW_55_in_outputAttributeList1189); if (state.failed) return attributeList;

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:200:4: ( ^( OUT_ATTRIBUTE outputItem ) )+
                    {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:200:4: ( ^( OUT_ATTRIBUTE outputItem ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        switch ( input.LA(1) ) {
                        case OUT_ATTRIBUTE:
                            {
                            alt47=1;
                            }
                            break;

                        }

                        switch (alt47) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:200:6: ^( OUT_ATTRIBUTE outputItem )
                    	    {
                    	    match(input,OUT_ATTRIBUTE,FOLLOW_OUT_ATTRIBUTE_in_outputAttributeList1198); if (state.failed) return attributeList;

                    	    match(input, Token.DOWN, null); if (state.failed) return attributeList;
                    	    pushFollow(FOLLOW_outputItem_in_outputAttributeList1200);
                    	    outputItem77=outputItem();

                    	    state._fsp--;
                    	    if (state.failed) return attributeList;

                    	    if ( state.backtracking==0 ) {attributeList.add(outputItem77);}

                    	    match(input, Token.UP, null); if (state.failed) return attributeList;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return attributeList;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return attributeList;
    }
    // $ANTLR end "outputAttributeList"



    // $ANTLR start "outputItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:203:1: outputItem returns [OutputAttribute value] : ( id extensionOutFunction[$id.value] | outFunction id |ex= expression id | attributeVariable );
    public final OutputAttribute outputItem() throws RecognitionException {
        OutputAttribute value = null;


        Expression ex =null;

        String id78 =null;

        OutputAttributeExtension extensionOutFunction79 =null;

        String id80 =null;

        SiddhiQLGrammarWalker.outFunction_return outFunction81 =null;

        String id82 =null;

        Variable attributeVariable83 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:204:2: ( id extensionOutFunction[$id.value] | outFunction id |ex= expression id | attributeVariable )
            int alt49=4;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt49=1;
                }
                break;
            case FUNCTION:
                {
                alt49=2;
                }
                break;
            case CONSTANT:
            case EXTENSION_FUNCTION:
            case 52:
            case 55:
            case 56:
            case 58:
            case 60:
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt49=3;
                }
                break;
            case ATTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                switch ( input.LA(6) ) {
                                case UP:
                                    {
                                    switch ( input.LA(7) ) {
                                    case ID:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt49=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt49=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 49, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 49, 16, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case ID_QUOTES:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt49=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt49=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 49, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 49, 17, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return value;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 49, 15, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 12, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 8, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt49=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt49=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 9, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID_QUOTES:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt49=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt49=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        case UP:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                            case ID_QUOTES:
                                {
                                alt49=3;
                                }
                                break;
                            case UP:
                                {
                                alt49=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 11, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 6, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ID_QUOTES:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                switch ( input.LA(6) ) {
                                case UP:
                                    {
                                    switch ( input.LA(7) ) {
                                    case ID:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt49=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt49=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 49, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 49, 16, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case ID_QUOTES:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt49=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt49=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 49, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 49, 17, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return value;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 49, 15, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 12, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 8, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt49=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt49=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 9, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID_QUOTES:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt49=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt49=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 49, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        case UP:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                            case ID_QUOTES:
                                {
                                alt49=3;
                                }
                                break;
                            case UP:
                                {
                                alt49=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 11, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:204:4: id extensionOutFunction[$id.value]
                    {
                    pushFollow(FOLLOW_id_in_outputItem1221);
                    id78=id();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_extensionOutFunction_in_outputItem1223);
                    extensionOutFunction79=extensionOutFunction(id78);

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =extensionOutFunction79;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:205:7: outFunction id
                    {
                    pushFollow(FOLLOW_outFunction_in_outputItem1234);
                    outFunction81=outFunction();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_id_in_outputItem1236);
                    id80=id();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new ComplexAttribute(id80, (outFunction81!=null?outFunction81.name:null), (outFunction81!=null?outFunction81.expressions:null));}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:206:4: ex= expression id
                    {
                    pushFollow(FOLLOW_expression_in_outputItem1247);
                    ex=expression();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_id_in_outputItem1249);
                    id82=id();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new SimpleAttribute(id82, ex);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:207:4: attributeVariable
                    {
                    pushFollow(FOLLOW_attributeVariable_in_outputItem1261);
                    attributeVariable83=attributeVariable();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new SimpleAttribute(attributeVariable83.getAttributeName(), attributeVariable83);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "outputItem"



    // $ANTLR start "extensionOutFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:210:1: extensionOutFunction[String id] returns [OutputAttributeExtension value] : ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) ;
    public final OutputAttributeExtension extensionOutFunction(String id) throws RecognitionException {
        OutputAttributeExtension value = null;


        String extensionId84 =null;

        String functionId85 =null;

        Expression[] parameters86 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:211:5: ( ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:211:7: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
            {
            match(input,EXTENSION_FUNCTION,FOLLOW_EXTENSION_FUNCTION_in_extensionOutFunction1285); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_extensionId_in_extensionOutFunction1287);
            extensionId84=extensionId();

            state._fsp--;
            if (state.failed) return value;

            pushFollow(FOLLOW_functionId_in_extensionOutFunction1289);
            functionId85=functionId();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =new OutputAttributeExtension(id, extensionId84, functionId85,null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:212:29: ( parameters )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt50=1;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:212:30: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_extensionOutFunction1322);
                    parameters86=parameters();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = new OutputAttributeExtension(id, extensionId84, functionId85, parameters86);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "extensionOutFunction"


    public static class outFunction_return extends TreeRuleReturnScope {
        public String name;
        public Expression[] expressions;
    };


    // $ANTLR start "outFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:216:1: outFunction returns [String name, Expression[] expressions] : ^( FUNCTION ID ( parameters )? ) ;
    public final SiddhiQLGrammarWalker.outFunction_return outFunction() throws RecognitionException {
        SiddhiQLGrammarWalker.outFunction_return retval = new SiddhiQLGrammarWalker.outFunction_return();
        retval.start = input.LT(1);


        CommonTree ID87=null;
        Expression[] parameters88 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:2: ( ^( FUNCTION ID ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:5: ^( FUNCTION ID ( parameters )? )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_outFunction1351); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID87=(CommonTree)match(input,ID,FOLLOW_ID_in_outFunction1353); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.name =(ID87!=null?ID87.getText():null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:38: ( parameters )?
            int alt51=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt51=1;
                    }
                    break;
            }

            switch (alt51) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:39: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_outFunction1358);
                    parameters88=parameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.expressions =parameters88;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outFunction"



    // $ANTLR start "groupBy"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:220:1: groupBy returns [List<Variable> variables] : ^( 'group' ( attributeVariable )+ ) ;
    public final List<Variable> groupBy() throws RecognitionException {
        List<Variable> variables = null;


        Variable attributeVariable89 =null;



        		variables =new ArrayList<Variable>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:224:2: ( ^( 'group' ( attributeVariable )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:224:4: ^( 'group' ( attributeVariable )+ )
            {
            match(input,90,FOLLOW_90_in_groupBy1386); if (state.failed) return variables;

            match(input, Token.DOWN, null); if (state.failed) return variables;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:224:14: ( attributeVariable )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case ATTRIBUTE:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:224:15: attributeVariable
            	    {
            	    pushFollow(FOLLOW_attributeVariable_in_groupBy1389);
            	    attributeVariable89=attributeVariable();

            	    state._fsp--;
            	    if (state.failed) return variables;

            	    if ( state.backtracking==0 ) {variables.add(attributeVariable89);}

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return variables;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return variables;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variables;
    }
    // $ANTLR end "groupBy"



    // $ANTLR start "having"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:227:1: having returns [Condition value] : ^( 'having' condition ) ;
    public final Condition having() throws RecognitionException {
        Condition value = null;


        Condition condition90 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:228:2: ( ^( 'having' condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:228:4: ^( 'having' condition )
            {
            match(input,91,FOLLOW_91_in_having1410); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_condition_in_having1412);
            condition90=condition();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;


            if ( state.backtracking==0 ) {value =condition90;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "having"



    // $ANTLR start "externalCall"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:231:1: externalCall : ^( 'call' ^( ID ( parameters )? ) ) ;
    public final void externalCall() throws RecognitionException {
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:232:2: ( ^( 'call' ^( ID ( parameters )? ) ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:232:4: ^( 'call' ^( ID ( parameters )? ) )
            {
            match(input,78,FOLLOW_78_in_externalCall1428); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_externalCall1431); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:232:19: ( parameters )?
                int alt53=2;
                switch ( input.LA(1) ) {
                    case PARAMETERS:
                        {
                        alt53=1;
                        }
                        break;
                }

                switch (alt53) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:232:19: parameters
                        {
                        pushFollow(FOLLOW_parameters_in_externalCall1433);
                        parameters();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "externalCall"



    // $ANTLR start "filterHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:235:1: filterHandler returns [Filter filter] : ^( FILTER condition ) ;
    public final Filter filterHandler() throws RecognitionException {
        Filter filter = null;


        Condition condition91 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:236:2: ( ^( FILTER condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:236:4: ^( FILTER condition )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filterHandler1453); if (state.failed) return filter;

            match(input, Token.DOWN, null); if (state.failed) return filter;
            pushFollow(FOLLOW_condition_in_filterHandler1455);
            condition91=condition();

            state._fsp--;
            if (state.failed) return filter;

            if ( state.backtracking==0 ) {filter =new Filter(condition91);}

            match(input, Token.UP, null); if (state.failed) return filter;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return filter;
    }
    // $ANTLR end "filterHandler"



    // $ANTLR start "transformHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:239:1: transformHandler returns [Transformer transformer] : ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? ) ;
    public final Transformer transformHandler() throws RecognitionException {
        Transformer transformer = null;


        SiddhiQLGrammarWalker.extensibleId_return extensibleId92 =null;

        Expression[] parameters93 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:240:2: ( ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:240:4: ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? )
            {
            match(input,TRANSFORM,FOLLOW_TRANSFORM_in_transformHandler1476); if (state.failed) return transformer;

            match(input, Token.DOWN, null); if (state.failed) return transformer;
            pushFollow(FOLLOW_extensibleId_in_transformHandler1478);
            extensibleId92=extensibleId("transform");

            state._fsp--;
            if (state.failed) return transformer;

            if ( state.backtracking==0 ) {transformer =new Transformer((extensibleId92!=null?extensibleId92.name:null),(TransformExtension) (extensibleId92!=null?extensibleId92.extension:null), null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:240:146: ( parameters )?
            int alt54=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt54=1;
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:240:147: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_transformHandler1484);
                    parameters93=parameters();

                    state._fsp--;
                    if (state.failed) return transformer;

                    if ( state.backtracking==0 ) {transformer =new Transformer((extensibleId92!=null?extensibleId92.name:null), (TransformExtension)(extensibleId92!=null?extensibleId92.extension:null), parameters93);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return transformer;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return transformer;
    }
    // $ANTLR end "transformHandler"



    // $ANTLR start "windowHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:243:1: windowHandler returns [Window window] : ^( WINDOW extensibleId[\"window\"] ( parameters )? ) ;
    public final Window windowHandler() throws RecognitionException {
        Window window = null;


        SiddhiQLGrammarWalker.extensibleId_return extensibleId94 =null;

        Expression[] parameters95 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:244:2: ( ^( WINDOW extensibleId[\"window\"] ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:244:4: ^( WINDOW extensibleId[\"window\"] ( parameters )? )
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_windowHandler1506); if (state.failed) return window;

            match(input, Token.DOWN, null); if (state.failed) return window;
            pushFollow(FOLLOW_extensibleId_in_windowHandler1508);
            extensibleId94=extensibleId("window");

            state._fsp--;
            if (state.failed) return window;

            if ( state.backtracking==0 ) {window =new Window((extensibleId94!=null?extensibleId94.name:null),(WindowExtension) (extensibleId94!=null?extensibleId94.extension:null), null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:244:126: ( parameters )?
            int alt55=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt55=1;
                    }
                    break;
            }

            switch (alt55) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:244:127: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_windowHandler1514);
                    parameters95=parameters();

                    state._fsp--;
                    if (state.failed) return window;

                    if ( state.backtracking==0 ) {window =new Window((extensibleId94!=null?extensibleId94.name:null), (WindowExtension)(extensibleId94!=null?extensibleId94.extension:null), parameters95);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return window;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return window;
    }
    // $ANTLR end "windowHandler"


    public static class extensibleId_return extends TreeRuleReturnScope {
        public String name;
        public Extension extension;
    };


    // $ANTLR start "extensibleId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:247:1: extensibleId[String type] returns [String name, Extension extension] : ( id | ^( EXTENSION extensionId functionId ) );
    public final SiddhiQLGrammarWalker.extensibleId_return extensibleId(String type) throws RecognitionException {
        SiddhiQLGrammarWalker.extensibleId_return retval = new SiddhiQLGrammarWalker.extensibleId_return();
        retval.start = input.LT(1);


        String id96 =null;

        String extensionId97 =null;

        String functionId98 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:248:5: ( id | ^( EXTENSION extensionId functionId ) )
            int alt56=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt56=1;
                }
                break;
            case EXTENSION:
                {
                alt56=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:248:7: id
                    {
                    pushFollow(FOLLOW_id_in_extensibleId1539);
                    id96=id();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.name =id96;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:249:7: ^( EXTENSION extensionId functionId )
                    {
                    match(input,EXTENSION,FOLLOW_EXTENSION_in_extensibleId1551); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_extensionId_in_extensibleId1555);
                    extensionId97=extensionId();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_functionId_in_extensibleId1557);
                    functionId98=functionId();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                            if("window".equals(type)){
                                retval.extension =new WindowExtension(extensionId97, functionId98);
                            } else if("transform".equals(type)){
                                retval.extension =new TransformExtension(extensionId97, functionId98);
                            } else {
                                System.err.println("Extension for "+type+" is not supported!");
                            }
                        }

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensibleId"


    protected static class parameters_scope {
        List<Expression> parameterlist;
    }
    protected Stack parameters_stack = new Stack();



    // $ANTLR start "parameters"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:260:1: parameters returns [Expression[] expressions] : ^( PARAMETERS ( parameter )+ ) ;
    public final Expression[] parameters() throws RecognitionException {
        parameters_stack.push(new parameters_scope());
        Expression[] expressions = null;


        Expression parameter99 =null;



        		((parameters_scope)parameters_stack.peek()).parameterlist =new ArrayList<Expression>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:270:2: ( ^( PARAMETERS ( parameter )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:270:5: ^( PARAMETERS ( parameter )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_parameters1595); if (state.failed) return expressions;

            match(input, Token.DOWN, null); if (state.failed) return expressions;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:270:18: ( parameter )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case ATTRIBUTE:
                case CONSTANT:
                case EXTENSION_FUNCTION:
                case 52:
                case 55:
                case 56:
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

                }

                switch (alt57) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:270:19: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameters1598);
            	    parameter99=parameter();

            	    state._fsp--;
            	    if (state.failed) return expressions;

            	    if ( state.backtracking==0 ) {((parameters_scope)parameters_stack.peek()).parameterlist.add(parameter99);}

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return expressions;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return expressions;


            }

            if ( state.backtracking==0 ) {
            		expressions =((parameters_scope)parameters_stack.peek()).parameterlist.toArray(new Expression[((parameters_scope)parameters_stack.peek()).parameterlist.size()]);
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            parameters_stack.pop();
        }
        return expressions;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "time"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:273:1: time returns [Expression expression] : constant ;
    public final Expression time() throws RecognitionException {
        Expression expression = null;


        Expression constant100 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:274:2: ( constant )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:274:4: constant
            {
            pushFollow(FOLLOW_constant_in_time1618);
            constant100=constant();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) {expression =constant100;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "time"



    // $ANTLR start "parameter"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:277:1: parameter returns [Expression expression] : e1= expression ;
    public final Expression parameter() throws RecognitionException {
        Expression expression = null;


        Expression e1 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:278:2: (e1= expression )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:278:4: e1= expression
            {
            pushFollow(FOLLOW_expression_in_parameter1638);
            e1=expression();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) {expression =e1;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "parameter"


    public static class collect_return extends TreeRuleReturnScope {
        public int startVal;
        public int endVal;
    };


    // $ANTLR start "collect"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:281:1: collect returns [int startVal , int endVal] : ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd );
    public final SiddhiQLGrammarWalker.collect_return collect() throws RecognitionException {
        SiddhiQLGrammarWalker.collect_return retval = new SiddhiQLGrammarWalker.collect_return();
        retval.start = input.LT(1);


        int countStart101 =0;

        int countEnd102 =0;

        int countStart103 =0;

        int countEnd104 =0;

        int countStartAndEnd105 =0;



        		retval.startVal =0;
        		retval.endVal =-2;//UNLIMITED
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:286:2: ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd )
            int alt58=4;
            switch ( input.LA(1) ) {
            case POSITIVE_INT_VAL:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    switch ( input.LA(3) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt58=1;
                        }
                        break;
                    case UP:
                        {
                        alt58=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case UP:
                    {
                    alt58=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;

                }

                }
                break;
            case 61:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:286:4: countStart ':' countEnd
                    {
                    pushFollow(FOLLOW_countStart_in_collect1660);
                    countStart101=countStart();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,61,FOLLOW_61_in_collect1662); if (state.failed) return retval;

                    pushFollow(FOLLOW_countEnd_in_collect1664);
                    countEnd102=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStart101; retval.endVal =countEnd102;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:287:4: countStart ':'
                    {
                    pushFollow(FOLLOW_countStart_in_collect1672);
                    countStart103=countStart();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,61,FOLLOW_61_in_collect1674); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStart103;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:288:4: ':' countEnd
                    {
                    match(input,61,FOLLOW_61_in_collect1683); if (state.failed) return retval;

                    pushFollow(FOLLOW_countEnd_in_collect1685);
                    countEnd104=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.endVal =countEnd104;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:289:4: countStartAndEnd
                    {
                    pushFollow(FOLLOW_countStartAndEnd_in_collect1696);
                    countStartAndEnd105=countStartAndEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStartAndEnd105; retval.endVal =countStartAndEnd105;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "collect"



    // $ANTLR start "countStart"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:293:1: countStart returns [int value] : POSITIVE_INT_VAL ;
    public final int countStart() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL106=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:294:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:294:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL106=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStart1721); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL106!=null?POSITIVE_INT_VAL106.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countStart"



    // $ANTLR start "countEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:297:1: countEnd returns [int value] : POSITIVE_INT_VAL ;
    public final int countEnd() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL107=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:298:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:298:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL107=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countEnd1738); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL107!=null?POSITIVE_INT_VAL107.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countEnd"



    // $ANTLR start "countStartAndEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:301:1: countStartAndEnd returns [int value] : POSITIVE_INT_VAL ;
    public final int countStartAndEnd() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL108=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:302:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:302:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL108=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1756); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL108!=null?POSITIVE_INT_VAL108.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countStartAndEnd"



    // $ANTLR start "condition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:307:1: condition returns [Condition condition] : ^( CONDITION conditionExpression ) ;
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        Condition conditionExpression109 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:308:2: ( ^( CONDITION conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:308:4: ^( CONDITION conditionExpression )
            {
            match(input,CONDITION,FOLLOW_CONDITION_in_condition1779); if (state.failed) return condition;

            match(input, Token.DOWN, null); if (state.failed) return condition;
            pushFollow(FOLLOW_conditionExpression_in_condition1781);
            conditionExpression109=conditionExpression();

            state._fsp--;
            if (state.failed) return condition;

            if ( state.backtracking==0 ) {condition =conditionExpression109;}

            match(input, Token.UP, null); if (state.failed) return condition;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "condition"



    // $ANTLR start "conditionExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:311:1: conditionExpression returns [Condition condition] : ( ^( 'or' c1= conditionExpression c2= conditionExpression ) | ^( 'and' c1= conditionExpression c2= conditionExpression ) | ^( compareOperation m1= expression m2= expression ) | ^( 'not' c= conditionExpression ) | ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) | boolVal );
    public final Condition conditionExpression() throws RecognitionException {
        Condition condition = null;


        Condition c1 =null;

        Condition c2 =null;

        Expression m1 =null;

        Expression m2 =null;

        Condition c =null;

        Condition.Operator compareOperation110 =null;

        String extensionId111 =null;

        String functionId112 =null;

        Expression[] parameters113 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:312:5: ( ^( 'or' c1= conditionExpression c2= conditionExpression ) | ^( 'and' c1= conditionExpression c2= conditionExpression ) | ^( compareOperation m1= expression m2= expression ) | ^( 'not' c= conditionExpression ) | ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) | boolVal )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt60=1;
                }
                break;
            case 74:
                {
                alt60=2;
                }
                break;
            case 50:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 79:
            case 96:
                {
                alt60=3;
                }
                break;
            case 109:
                {
                alt60=4;
                }
                break;
            case CONDITION_FUNCTION:
                {
                alt60=5;
                }
                break;
            case BOOL_VAL:
                {
                alt60=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:312:7: ^( 'or' c1= conditionExpression c2= conditionExpression )
                    {
                    match(input,111,FOLLOW_111_in_conditionExpression1803); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1807);
                    c1=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1811);
                    c2=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.or(c1,c2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:313:7: ^( 'and' c1= conditionExpression c2= conditionExpression )
                    {
                    match(input,74,FOLLOW_74_in_conditionExpression1824); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1828);
                    c1=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1832);
                    c2=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.and(c1,c2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:314:7: ^( compareOperation m1= expression m2= expression )
                    {
                    pushFollow(FOLLOW_compareOperation_in_conditionExpression1846);
                    compareOperation110=compareOperation();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_expression_in_conditionExpression1850);
                    m1=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_expression_in_conditionExpression1854);
                    m2=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.compare(m1,compareOperation110,m2);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:315:7: ^( 'not' c= conditionExpression )
                    {
                    match(input,109,FOLLOW_109_in_conditionExpression1874); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1878);
                    c=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.not(c);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:316:7: ^( CONDITION_FUNCTION extensionId functionId ( parameters )? )
                    {
                    match(input,CONDITION_FUNCTION,FOLLOW_CONDITION_FUNCTION_in_conditionExpression1897); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_extensionId_in_conditionExpression1899);
                    extensionId111=extensionId();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_functionId_in_conditionExpression1901);
                    functionId112=functionId();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) {condition =new ConditionExtension(extensionId111,functionId112,null);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:316:132: ( parameters )?
                    int alt59=2;
                    switch ( input.LA(1) ) {
                        case PARAMETERS:
                            {
                            alt59=1;
                            }
                            break;
                    }

                    switch (alt59) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:316:133: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_conditionExpression1906);
                            parameters113=parameters();

                            state._fsp--;
                            if (state.failed) return condition;

                            if ( state.backtracking==0 ) {condition =new ConditionExtension(extensionId111,functionId112,parameters113);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return condition;


                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:317:6: boolVal
                    {
                    pushFollow(FOLLOW_boolVal_in_conditionExpression1919);
                    boolVal();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) {System.err.println("Boolean Value as condition not yet supported!");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "conditionExpression"



    // $ANTLR start "expression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:320:1: expression returns [Expression expression] : ( ^( '%' e1= expression e2= expression ) | ^( '/' e1= expression e2= expression ) | ^( '*' e1= expression e2= expression ) | ^( '-' e1= expression e2= expression ) | ^( '+' e1= expression e2= expression ) | valueExpression );
    public final Expression expression() throws RecognitionException {
        Expression expression = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression valueExpression114 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:321:2: ( ^( '%' e1= expression e2= expression ) | ^( '/' e1= expression e2= expression ) | ^( '*' e1= expression e2= expression ) | ^( '-' e1= expression e2= expression ) | ^( '+' e1= expression e2= expression ) | valueExpression )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt61=1;
                }
                break;
            case 60:
                {
                alt61=2;
                }
                break;
            case 55:
                {
                alt61=3;
                }
                break;
            case 58:
                {
                alt61=4;
                }
                break;
            case 56:
                {
                alt61=5;
                }
                break;
            case ATTRIBUTE:
            case CONSTANT:
            case EXTENSION_FUNCTION:
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:321:4: ^( '%' e1= expression e2= expression )
                    {
                    match(input,52,FOLLOW_52_in_expression1952); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression1956);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression1960);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.mod(e1,e2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:322:7: ^( '/' e1= expression e2= expression )
                    {
                    match(input,60,FOLLOW_60_in_expression1972); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression1976);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression1980);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.divide(e1,e2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:323:7: ^( '*' e1= expression e2= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression1992); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression1996);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2000);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.multiply(e1,e2);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:324:7: ^( '-' e1= expression e2= expression )
                    {
                    match(input,58,FOLLOW_58_in_expression2012); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression2016);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2020);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.minus(e1,e2);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:325:7: ^( '+' e1= expression e2= expression )
                    {
                    match(input,56,FOLLOW_56_in_expression2032); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression2036);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2040);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.add(e1,e2);}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:326:6: valueExpression
                    {
                    pushFollow(FOLLOW_valueExpression_in_expression2050);
                    valueExpression114=valueExpression();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =valueExpression114;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "expression"



    // $ANTLR start "valueExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:329:1: valueExpression returns [Expression expression] : ( constant | type | attributeVariable | ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) );
    public final Expression valueExpression() throws RecognitionException {
        Expression expression = null;


        Expression constant115 =null;

        Attribute.Type type116 =null;

        Variable attributeVariable117 =null;

        String extensionId118 =null;

        String functionId119 =null;

        Expression[] parameters120 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:330:5: ( constant | type | attributeVariable | ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt63=1;
                }
                break;
            case 76:
            case 84:
            case 87:
            case 97:
            case 101:
            case 119:
                {
                alt63=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt63=3;
                }
                break;
            case EXTENSION_FUNCTION:
                {
                alt63=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:330:6: constant
                    {
                    pushFollow(FOLLOW_constant_in_valueExpression2079);
                    constant115=constant();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =constant115;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:331:6: type
                    {
                    pushFollow(FOLLOW_type_in_valueExpression2091);
                    type116=type();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =Expression.type(type116);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:332:6: attributeVariable
                    {
                    pushFollow(FOLLOW_attributeVariable_in_valueExpression2107);
                    attributeVariable117=attributeVariable();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =attributeVariable117;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:333:6: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
                    {
                    match(input,EXTENSION_FUNCTION,FOLLOW_EXTENSION_FUNCTION_in_valueExpression2118); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_extensionId_in_valueExpression2120);
                    extensionId118=extensionId();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_functionId_in_valueExpression2122);
                    functionId119=functionId();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =new ExpressionExtension(extensionId118,functionId119, null);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:333:134: ( parameters )?
                    int alt62=2;
                    switch ( input.LA(1) ) {
                        case PARAMETERS:
                            {
                            alt62=1;
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:333:135: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_valueExpression2127);
                            parameters120=parameters();

                            state._fsp--;
                            if (state.failed) return expression;

                            if ( state.backtracking==0 ) {expression =new ExpressionExtension(extensionId118,functionId119,parameters120);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return expression;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "valueExpression"



    // $ANTLR start "constant"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:339:1: constant returns [Expression expression] : ( ^( CONSTANT intVal ) | ^( CONSTANT longVal ) | ^( CONSTANT floatVal ) | ^( CONSTANT doubleVal ) | ^( CONSTANT boolVal ) | ^( CONSTANT stringVal ) | ^( CONSTANT timeExpr ) );
    public final Expression constant() throws RecognitionException {
        Expression expression = null;


        int intVal121 =0;

        long longVal122 =0;

        float floatVal123 =0.0f;

        double doubleVal124 =0.0;

        boolean boolVal125 =false;

        String stringVal126 =null;

        long timeExpr127 =0;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:340:2: ( ^( CONSTANT intVal ) | ^( CONSTANT longVal ) | ^( CONSTANT floatVal ) | ^( CONSTANT doubleVal ) | ^( CONSTANT boolVal ) | ^( CONSTANT stringVal ) | ^( CONSTANT timeExpr ) )
            int alt64=7;
            switch ( input.LA(1) ) {
            case CONSTANT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SIGNED_VAL:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                alt64=1;
                                }
                                break;
                            case POSITIVE_LONG_VAL:
                                {
                                alt64=2;
                                }
                                break;
                            case POSITIVE_FLOAT_VAL:
                                {
                                alt64=3;
                                }
                                break;
                            case POSITIVE_DOUBLE_VAL:
                                {
                                alt64=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return expression;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 7, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return expression;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BOOL_VAL:
                        {
                        alt64=5;
                        }
                        break;
                    case STRING_VAL:
                        {
                        alt64=6;
                        }
                        break;
                    case TIME_EXP:
                        {
                        alt64=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return expression;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return expression;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:340:4: ^( CONSTANT intVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2155); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_intVal_in_constant2157);
                    intVal121=intVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(intVal121);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:341:4: ^( CONSTANT longVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2169); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_longVal_in_constant2171);
                    longVal122=longVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(longVal122);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:342:4: ^( CONSTANT floatVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2182); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_floatVal_in_constant2184);
                    floatVal123=floatVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(floatVal123);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:343:4: ^( CONSTANT doubleVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2195); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_doubleVal_in_constant2197);
                    doubleVal124=doubleVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(doubleVal124);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:344:4: ^( CONSTANT boolVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2207); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_boolVal_in_constant2209);
                    boolVal125=boolVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(boolVal125);}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:345:4: ^( CONSTANT stringVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2220); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_stringVal_in_constant2222);
                    stringVal126=stringVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(stringVal126);}

                    }
                    break;
                case 7 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:346:4: ^( CONSTANT timeExpr )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2232); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_timeExpr_in_constant2234);
                    timeExpr127=timeExpr();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(timeExpr127);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "constant"



    // $ANTLR start "timeExpr"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:349:2: timeExpr returns [long value] : ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) ;
    public final long timeExpr() throws RecognitionException {
        long value = 0;


        long yearValue128 =0;

        long monthValue129 =0;

        long weekValue130 =0;

        long dayValue131 =0;

        long hourValue132 =0;

        long minuteValue133 =0;

        long secondValue134 =0;

        long milliSecondValue135 =0;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:2: ( ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:3: ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? )
            {
            match(input,TIME_EXP,FOLLOW_TIME_EXP_in_timeExpr2258); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:14: ( yearValue )?
                int alt65=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 126:
                            case 127:
                                {
                                alt65=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt65) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:15: yearValue
                        {
                        pushFollow(FOLLOW_yearValue_in_timeExpr2261);
                        yearValue128=yearValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  yearValue128;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:59: ( monthValue )?
                int alt66=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 107:
                            case 108:
                                {
                                alt66=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt66) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:60: monthValue
                        {
                        pushFollow(FOLLOW_monthValue_in_timeExpr2270);
                        monthValue129=monthValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  monthValue129;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:106: ( weekValue )?
                int alt67=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 122:
                            case 123:
                                {
                                alt67=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt67) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:107: weekValue
                        {
                        pushFollow(FOLLOW_weekValue_in_timeExpr2279);
                        weekValue130=weekValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  weekValue130;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:151: ( dayValue )?
                int alt68=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 81:
                            case 82:
                                {
                                alt68=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt68) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:152: dayValue
                        {
                        pushFollow(FOLLOW_dayValue_in_timeExpr2288);
                        dayValue131=dayValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  dayValue131;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:195: ( hourValue )?
                int alt69=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 92:
                            case 93:
                                {
                                alt69=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt69) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:196: hourValue
                        {
                        pushFollow(FOLLOW_hourValue_in_timeExpr2298);
                        hourValue132=hourValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  hourValue132;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:241: ( minuteValue )?
                int alt70=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 104:
                            case 105:
                            case 106:
                                {
                                alt70=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt70) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:242: minuteValue
                        {
                        pushFollow(FOLLOW_minuteValue_in_timeExpr2307);
                        minuteValue133=minuteValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  minuteValue133;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:351:3: ( secondValue )?
                int alt71=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 115:
                            case 116:
                            case 117:
                                {
                                alt71=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt71) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:351:4: secondValue
                        {
                        pushFollow(FOLLOW_secondValue_in_timeExpr2318);
                        secondValue134=secondValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  secondValue134;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:351:53: ( milliSecondValue )?
                int alt72=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt72=1;
                        }
                        break;
                }

                switch (alt72) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:351:54: milliSecondValue
                        {
                        pushFollow(FOLLOW_milliSecondValue_in_timeExpr2327);
                        milliSecondValue135=milliSecondValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  milliSecondValue135;}

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return value;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "timeExpr"



    // $ANTLR start "yearValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:354:1: yearValue returns [long value] : a= POSITIVE_INT_VAL ( 'years' | 'year' ) ;
    public final long yearValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:355:2: (a= POSITIVE_INT_VAL ( 'years' | 'year' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:355:4: a= POSITIVE_INT_VAL ( 'years' | 'year' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_yearValue2353); if (state.failed) return value;

            if ( (input.LA(1) >= 126 && input.LA(1) <= 127) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.year(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "yearValue"



    // $ANTLR start "monthValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:358:1: monthValue returns [long value] : a= POSITIVE_INT_VAL ( 'months' | 'month' ) ;
    public final long monthValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:359:2: (a= POSITIVE_INT_VAL ( 'months' | 'month' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:359:4: a= POSITIVE_INT_VAL ( 'months' | 'month' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_monthValue2384); if (state.failed) return value;

            if ( (input.LA(1) >= 107 && input.LA(1) <= 108) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.month(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "monthValue"



    // $ANTLR start "weekValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:362:1: weekValue returns [long value] : a= POSITIVE_INT_VAL ( 'weeks' | 'week' ) ;
    public final long weekValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:363:2: (a= POSITIVE_INT_VAL ( 'weeks' | 'week' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:363:4: a= POSITIVE_INT_VAL ( 'weeks' | 'week' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_weekValue2414); if (state.failed) return value;

            if ( (input.LA(1) >= 122 && input.LA(1) <= 123) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.week(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "weekValue"



    // $ANTLR start "dayValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:366:1: dayValue returns [long value] : a= POSITIVE_INT_VAL ( 'days' | 'day' ) ;
    public final long dayValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:367:2: (a= POSITIVE_INT_VAL ( 'days' | 'day' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:367:4: a= POSITIVE_INT_VAL ( 'days' | 'day' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_dayValue2446); if (state.failed) return value;

            if ( (input.LA(1) >= 81 && input.LA(1) <= 82) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.day(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dayValue"



    // $ANTLR start "hourValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:370:1: hourValue returns [long value] : a= POSITIVE_INT_VAL ( 'hours' | 'hour' ) ;
    public final long hourValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:371:2: (a= POSITIVE_INT_VAL ( 'hours' | 'hour' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:371:4: a= POSITIVE_INT_VAL ( 'hours' | 'hour' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_hourValue2477); if (state.failed) return value;

            if ( (input.LA(1) >= 92 && input.LA(1) <= 93) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.hour(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "hourValue"



    // $ANTLR start "minuteValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:374:1: minuteValue returns [long value] : a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' ) ;
    public final long minuteValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:375:2: (a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:375:4: a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_minuteValue2507); if (state.failed) return value;

            if ( (input.LA(1) >= 104 && input.LA(1) <= 106) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value = Time.minute(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "minuteValue"



    // $ANTLR start "secondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:378:1: secondValue returns [long value] : a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) ;
    public final long secondValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:379:2: (a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:379:4: a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_secondValue2539); if (state.failed) return value;

            if ( (input.LA(1) >= 115 && input.LA(1) <= 117) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.sec(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "secondValue"



    // $ANTLR start "milliSecondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:382:1: milliSecondValue returns [long value] : a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) ;
    public final long milliSecondValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:383:2: (a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:383:4: a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2573); if (state.failed) return value;

            if ( (input.LA(1) >= 102 && input.LA(1) <= 103) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.milliSec(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "milliSecondValue"



    // $ANTLR start "streamId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:387:1: streamId returns [String value] : id ;
    public final String streamId() throws RecognitionException {
        String value = null;


        String id136 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:388:2: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:388:4: id
            {
            pushFollow(FOLLOW_id_in_streamId2600);
            id136=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id136;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "streamId"



    // $ANTLR start "attributeVariable"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:391:1: attributeVariable returns [Variable variable] : ( streamPositionAttributeName | streamAttributeName | attributeName );
    public final Variable attributeVariable() throws RecognitionException {
        Variable variable = null;


        SiddhiQLGrammarWalker.streamPositionAttributeName_return streamPositionAttributeName137 =null;

        SiddhiQLGrammarWalker.streamAttributeName_return streamAttributeName138 =null;

        String attributeName139 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:392:2: ( streamPositionAttributeName | streamAttributeName | attributeName )
            int alt73=3;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            alt73=1;
                            }
                            break;
                        case ID:
                        case ID_QUOTES:
                            {
                            alt73=2;
                            }
                            break;
                        case UP:
                            {
                            alt73=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return variable;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ID_QUOTES:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            alt73=1;
                            }
                            break;
                        case ID:
                        case ID_QUOTES:
                            {
                            alt73=2;
                            }
                            break;
                        case UP:
                            {
                            alt73=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return variable;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return variable;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return variable;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return variable;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:392:3: streamPositionAttributeName
                    {
                    pushFollow(FOLLOW_streamPositionAttributeName_in_attributeVariable2617);
                    streamPositionAttributeName137=streamPositionAttributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable((streamPositionAttributeName137!=null?streamPositionAttributeName137.stream:null),(streamPositionAttributeName137!=null?streamPositionAttributeName137.position:0),(streamPositionAttributeName137!=null?streamPositionAttributeName137.attribute:null));}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:393:6: streamAttributeName
                    {
                    pushFollow(FOLLOW_streamAttributeName_in_attributeVariable2626);
                    streamAttributeName138=streamAttributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable((streamAttributeName138!=null?streamAttributeName138.stream:null),(streamAttributeName138!=null?streamAttributeName138.attribute:null));}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:394:6: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attributeVariable2638);
                    attributeName139=attributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable(attributeName139);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "attributeVariable"


    public static class streamPositionAttributeName_return extends TreeRuleReturnScope {
        public String stream;
        public int position;
        public String attribute;
    };


    // $ANTLR start "streamPositionAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:397:1: streamPositionAttributeName returns [String stream, int position, String attribute] : ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) ;
    public final SiddhiQLGrammarWalker.streamPositionAttributeName_return streamPositionAttributeName() throws RecognitionException {
        SiddhiQLGrammarWalker.streamPositionAttributeName_return retval = new SiddhiQLGrammarWalker.streamPositionAttributeName_return();
        retval.start = input.LT(1);


        CommonTree POSITIVE_INT_VAL141=null;
        String streamId140 =null;

        String id142 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:398:2: ( ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:398:4: ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_streamPositionAttributeName2661); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_streamId_in_streamPositionAttributeName2664);
            streamId140=streamId();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.stream =streamId140;}

            match(input, Token.DOWN, null); if (state.failed) return retval;
            POSITIVE_INT_VAL141=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2668); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.position =Integer.parseInt((POSITIVE_INT_VAL141!=null?POSITIVE_INT_VAL141.getText():null));}

            match(input, Token.UP, null); if (state.failed) return retval;


            pushFollow(FOLLOW_id_in_streamPositionAttributeName2673);
            id142=id();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.attribute =id142;}

            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamPositionAttributeName"


    public static class streamAttributeName_return extends TreeRuleReturnScope {
        public String stream;
        public String attribute;
    };


    // $ANTLR start "streamAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:401:1: streamAttributeName returns [String stream, String attribute] : ^( ATTRIBUTE ( streamId ) id ) ;
    public final SiddhiQLGrammarWalker.streamAttributeName_return streamAttributeName() throws RecognitionException {
        SiddhiQLGrammarWalker.streamAttributeName_return retval = new SiddhiQLGrammarWalker.streamAttributeName_return();
        retval.start = input.LT(1);


        String streamId143 =null;

        String id144 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:402:2: ( ^( ATTRIBUTE ( streamId ) id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:402:3: ^( ATTRIBUTE ( streamId ) id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_streamAttributeName2694); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:402:16: ( streamId )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:402:17: streamId
            {
            pushFollow(FOLLOW_streamId_in_streamAttributeName2697);
            streamId143=streamId();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.stream =streamId143;}

            }


            pushFollow(FOLLOW_id_in_streamAttributeName2702);
            id144=id();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.attribute =id144;}

            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamAttributeName"



    // $ANTLR start "attributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:405:1: attributeName returns [String value] : ^( ATTRIBUTE id ) ;
    public final String attributeName() throws RecognitionException {
        String value = null;


        String id145 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:406:2: ( ^( ATTRIBUTE id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:406:3: ^( ATTRIBUTE id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeName2722); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_id_in_attributeName2724);
            id145=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id145;}

            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "attributeName"



    // $ANTLR start "join"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:409:1: join returns [JoinStream.Type type] : ( ^( 'join' ^( 'outer' 'left' ) ) | ^( 'join' ^( 'outer' 'right' ) ) | ^( 'join' ^( 'outer' 'full' ) ) | ^( 'join' 'inner' ) );
    public final JoinStream.Type join() throws RecognitionException {
        JoinStream.Type type = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:410:2: ( ^( 'join' ^( 'outer' 'left' ) ) | ^( 'join' ^( 'outer' 'right' ) ) | ^( 'join' ^( 'outer' 'full' ) ) | ^( 'join' 'inner' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 99:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case 112:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case 100:
                                {
                                alt74=1;
                                }
                                break;
                            case 114:
                                {
                                alt74=2;
                                }
                                break;
                            case 89:
                                {
                                alt74=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return type;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 74, 5, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return type;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case 94:
                        {
                        alt74=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return type;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:410:5: ^( 'join' ^( 'outer' 'left' ) )
                    {
                    match(input,99,FOLLOW_99_in_join2746); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,112,FOLLOW_112_in_join2749); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,100,FOLLOW_100_in_join2751); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.LEFT_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Left outer join not yet supported!");}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:411:5: ^( 'join' ^( 'outer' 'right' ) )
                    {
                    match(input,99,FOLLOW_99_in_join2765); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,112,FOLLOW_112_in_join2768); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,114,FOLLOW_114_in_join2770); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.RIGHT_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Right outer join not yet supported!");}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:412:5: ^( 'join' ^( 'outer' 'full' ) )
                    {
                    match(input,99,FOLLOW_99_in_join2784); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,112,FOLLOW_112_in_join2787); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,89,FOLLOW_89_in_join2789); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.FULL_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Full outer join not yet supported!");}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:413:4: ^( 'join' 'inner' )
                    {
                    match(input,99,FOLLOW_99_in_join2801); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,94,FOLLOW_94_in_join2803); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.INNER_JOIN;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "join"



    // $ANTLR start "compareOperation"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:416:1: compareOperation returns [Condition.Operator operator] : ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' );
    public final Condition.Operator compareOperation() throws RecognitionException {
        Condition.Operator operator = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:417:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' )
            int alt75=8;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt75=1;
                }
                break;
            case 50:
                {
                alt75=2;
                }
                break;
            case 64:
                {
                alt75=3;
                }
                break;
            case 68:
                {
                alt75=4;
                }
                break;
            case 63:
                {
                alt75=5;
                }
                break;
            case 67:
                {
                alt75=6;
                }
                break;
            case 79:
                {
                alt75=7;
                }
                break;
            case 96:
                {
                alt75=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:417:3: '=='
                    {
                    match(input,66,FOLLOW_66_in_compareOperation2823); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.EQUAL;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:418:3: '!='
                    {
                    match(input,50,FOLLOW_50_in_compareOperation2832); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.NOT_EQUAL;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:419:3: '<='
                    {
                    match(input,64,FOLLOW_64_in_compareOperation2840); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.LESS_THAN_EQUAL;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:420:3: '>='
                    {
                    match(input,68,FOLLOW_68_in_compareOperation2847); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.GREATER_THAN_EQUAL;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:421:3: '<'
                    {
                    match(input,63,FOLLOW_63_in_compareOperation2855); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.LESS_THAN;}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:422:3: '>'
                    {
                    match(input,67,FOLLOW_67_in_compareOperation2863); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.GREATER_THAN;}

                    }
                    break;
                case 7 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:423:3: 'contains'
                    {
                    match(input,79,FOLLOW_79_in_compareOperation2872); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.CONTAINS;}

                    }
                    break;
                case 8 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:424:3: 'instanceof'
                    {
                    match(input,96,FOLLOW_96_in_compareOperation2878); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.INSTANCE_OF;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "compareOperation"



    // $ANTLR start "id"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:427:1: id returns [String value] : ( ID | ID_QUOTES );
    public final String id() throws RecognitionException {
        String value = null;


        CommonTree ID146=null;
        CommonTree ID_QUOTES147=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:428:5: ( ID | ID_QUOTES )
            int alt76=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt76=1;
                }
                break;
            case ID_QUOTES:
                {
                alt76=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:428:7: ID
                    {
                    ID146=(CommonTree)match(input,ID,FOLLOW_ID_in_id2899); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =(ID146!=null?ID146.getText():null);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:429:7: ID_QUOTES
                    {
                    ID_QUOTES147=(CommonTree)match(input,ID_QUOTES,FOLLOW_ID_QUOTES_in_id2909); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =(ID_QUOTES147!=null?ID_QUOTES147.getText():null);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "id"



    // $ANTLR start "intVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:432:1: intVal returns [int value] : ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) ;
    public final int intVal() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL148=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:433:5: ( ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:433:7: ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_intVal2933); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_INT_VAL148=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_intVal2936); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL148!=null?POSITIVE_INT_VAL148.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:433:89: ( '-' )?
            int alt77=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt77=1;
                    }
                    break;
            }

            switch (alt77) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:433:90: '-'
                    {
                    match(input,58,FOLLOW_58_in_intVal2941); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "intVal"



    // $ANTLR start "longVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:436:1: longVal returns [long value] : ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) ;
    public final long longVal() throws RecognitionException {
        long value = 0;


        CommonTree POSITIVE_LONG_VAL149=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:437:5: ( ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:437:7: ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_longVal2968); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_LONG_VAL149=(CommonTree)match(input,POSITIVE_LONG_VAL,FOLLOW_POSITIVE_LONG_VAL_in_longVal2971); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Long.parseLong((POSITIVE_LONG_VAL149!=null?POSITIVE_LONG_VAL149.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:437:89: ( '-' )?
            int alt78=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt78=1;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:437:90: '-'
                    {
                    match(input,58,FOLLOW_58_in_longVal2976); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "longVal"



    // $ANTLR start "floatVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:440:1: floatVal returns [float value] : ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) ;
    public final float floatVal() throws RecognitionException {
        float value = 0.0f;


        CommonTree POSITIVE_FLOAT_VAL150=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:441:5: ( ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:441:7: ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_floatVal3003); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_FLOAT_VAL150=(CommonTree)match(input,POSITIVE_FLOAT_VAL,FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3006); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Float.parseFloat((POSITIVE_FLOAT_VAL150!=null?POSITIVE_FLOAT_VAL150.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:441:93: ( '-' )?
            int alt79=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt79=1;
                    }
                    break;
            }

            switch (alt79) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:441:94: '-'
                    {
                    match(input,58,FOLLOW_58_in_floatVal3011); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "floatVal"



    // $ANTLR start "doubleVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:444:1: doubleVal returns [double value] : ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) ;
    public final double doubleVal() throws RecognitionException {
        double value = 0.0;


        CommonTree POSITIVE_DOUBLE_VAL151=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:445:5: ( ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:445:7: ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_doubleVal3038); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_DOUBLE_VAL151=(CommonTree)match(input,POSITIVE_DOUBLE_VAL,FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3041); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Double.parseDouble((POSITIVE_DOUBLE_VAL151!=null?POSITIVE_DOUBLE_VAL151.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:445:97: ( '-' )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt80=1;
                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:445:98: '-'
                    {
                    match(input,58,FOLLOW_58_in_doubleVal3046); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "doubleVal"



    // $ANTLR start "boolVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:448:1: boolVal returns [boolean value] : BOOL_VAL ;
    public final boolean boolVal() throws RecognitionException {
        boolean value = false;


        CommonTree BOOL_VAL152=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:449:5: ( BOOL_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:449:7: BOOL_VAL
            {
            BOOL_VAL152=(CommonTree)match(input,BOOL_VAL,FOLLOW_BOOL_VAL_in_boolVal3072); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Boolean.parseBoolean((BOOL_VAL152!=null?BOOL_VAL152.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "boolVal"



    // $ANTLR start "extensionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:452:1: extensionId returns [String value] : id ;
    public final String extensionId() throws RecognitionException {
        String value = null;


        String id153 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:453:5: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:453:7: id
            {
            pushFollow(FOLLOW_id_in_extensionId3095);
            id153=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id153;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "extensionId"



    // $ANTLR start "functionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:456:1: functionId returns [String value] : id ;
    public final String functionId() throws RecognitionException {
        String value = null;


        String id154 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:457:5: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:457:7: id
            {
            pushFollow(FOLLOW_id_in_functionId3118);
            id154=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id154;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "functionId"



    // $ANTLR start "stringVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:460:1: stringVal returns [String value] : STRING_VAL ;
    public final String stringVal() throws RecognitionException {
        String value = null;


        CommonTree STRING_VAL155=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:461:5: ( STRING_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:461:7: STRING_VAL
            {
            STRING_VAL155=(CommonTree)match(input,STRING_VAL,FOLLOW_STRING_VAL_in_stringVal3141); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =(STRING_VAL155!=null?STRING_VAL155.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "stringVal"



    // $ANTLR start "type"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:464:1: type returns [Attribute.Type type] : ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' );
    public final Attribute.Type type() throws RecognitionException {
        Attribute.Type type = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:465:2: ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' )
            int alt81=6;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt81=1;
                }
                break;
            case 97:
                {
                alt81=2;
                }
                break;
            case 101:
                {
                alt81=3;
                }
                break;
            case 87:
                {
                alt81=4;
                }
                break;
            case 84:
                {
                alt81=5;
                }
                break;
            case 76:
                {
                alt81=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:465:3: 'string'
                    {
                    match(input,119,FOLLOW_119_in_type3164); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.STRING;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:466:3: 'int'
                    {
                    match(input,97,FOLLOW_97_in_type3172); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.INT;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:467:3: 'long'
                    {
                    match(input,101,FOLLOW_101_in_type3181); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.LONG;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:468:3: 'float'
                    {
                    match(input,87,FOLLOW_87_in_type3189); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.FLOAT;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:469:3: 'double'
                    {
                    match(input,84,FOLLOW_84_in_type3197); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.DOUBLE;}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:470:3: 'bool'
                    {
                    match(input,76,FOLLOW_76_in_type3205); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.BOOL;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred13_SiddhiQLGrammarWalker
    public final void synpred13_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:86:4: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:86:4: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred13_SiddhiQLGrammarWalker293);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_SiddhiQLGrammarWalker

    // $ANTLR start synpred28_SiddhiQLGrammarWalker
    public final void synpred28_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:4: ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:4: leftStream join rightStream 'unidirectional' ( condition )? ( time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred28_SiddhiQLGrammarWalker529);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred28_SiddhiQLGrammarWalker532);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred28_SiddhiQLGrammarWalker534);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,121,FOLLOW_121_in_synpred28_SiddhiQLGrammarWalker536); if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:50: ( condition )?
        int alt86=2;
        switch ( input.LA(1) ) {
            case CONDITION:
                {
                alt86=1;
                }
                break;
        }

        switch (alt86) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:51: condition
                {
                pushFollow(FOLLOW_condition_in_synpred28_SiddhiQLGrammarWalker539);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:112: ( time )?
        int alt87=2;
        switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt87=1;
                }
                break;
        }

        switch (alt87) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:112:113: time
                {
                pushFollow(FOLLOW_time_in_synpred28_SiddhiQLGrammarWalker546);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred28_SiddhiQLGrammarWalker

    // $ANTLR start synpred31_SiddhiQLGrammarWalker
    public final void synpred31_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:4: ( leftStream join rightStream ( condition )? ( time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:4: leftStream join rightStream ( condition )? ( time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred31_SiddhiQLGrammarWalker557);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred31_SiddhiQLGrammarWalker559);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred31_SiddhiQLGrammarWalker561);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:32: ( condition )?
        int alt88=2;
        switch ( input.LA(1) ) {
            case CONDITION:
                {
                alt88=1;
                }
                break;
        }

        switch (alt88) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:33: condition
                {
                pushFollow(FOLLOW_condition_in_synpred31_SiddhiQLGrammarWalker564);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:94: ( time )?
        int alt89=2;
        switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt89=1;
                }
                break;
        }

        switch (alt89) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:95: time
                {
                pushFollow(FOLLOW_time_in_synpred31_SiddhiQLGrammarWalker571);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred31_SiddhiQLGrammarWalker

    // $ANTLR start synpred34_SiddhiQLGrammarWalker
    public final void synpred34_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred34_SiddhiQLGrammarWalker630);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_SiddhiQLGrammarWalker

    // $ANTLR start synpred35_SiddhiQLGrammarWalker
    public final void synpred35_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:123:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:123:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred35_SiddhiQLGrammarWalker666);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred35_SiddhiQLGrammarWalker

    // $ANTLR start synpred38_SiddhiQLGrammarWalker
    public final void synpred38_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        PatternElement p =null;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:4: ( ^( 'every' patternItem ) (p= patternStream )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:4: ^( 'every' patternItem ) (p= patternStream )?
        {
        match(input,85,FOLLOW_85_in_synpred38_SiddhiQLGrammarWalker760); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_patternItem_in_synpred38_SiddhiQLGrammarWalker763);
        patternItem();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:76: (p= patternStream )?
        int alt90=2;
        switch ( input.LA(1) ) {
            case COLLECT:
            case STREAM:
            case 74:
            case 85:
            case 111:
                {
                alt90=1;
                }
                break;
        }

        switch (alt90) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:139:77: p= patternStream
                {
                pushFollow(FOLLOW_patternStream_in_synpred38_SiddhiQLGrammarWalker771);
                p=patternStream();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred38_SiddhiQLGrammarWalker

    // $ANTLR start synpred40_SiddhiQLGrammarWalker
    public final void synpred40_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        PatternElement p =null;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:4: ( ^( 'every' nonEveryPatternStream ) (p= patternStream )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:4: ^( 'every' nonEveryPatternStream ) (p= patternStream )?
        {
        match(input,85,FOLLOW_85_in_synpred40_SiddhiQLGrammarWalker781); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_nonEveryPatternStream_in_synpred40_SiddhiQLGrammarWalker783);
        nonEveryPatternStream();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:98: (p= patternStream )?
        int alt91=2;
        switch ( input.LA(1) ) {
            case COLLECT:
            case STREAM:
            case 74:
            case 85:
            case 111:
                {
                alt91=1;
                }
                break;
        }

        switch (alt91) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:99: p= patternStream
                {
                pushFollow(FOLLOW_patternStream_in_synpred40_SiddhiQLGrammarWalker794);
                p=patternStream();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred40_SiddhiQLGrammarWalker

    // Delegated rules

    public final boolean synpred40_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_DEFINITION_in_executionPlan67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_definitionStream_in_executionPlan69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_query_in_executionPlan78 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_streamId_in_definitionStream106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_ATTRIBUTE_in_definitionStream112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributeName_in_definitionStream114 = new BitSet(new long[]{0x0000000000000000L,0x0080002200901000L});
    public static final BitSet FOLLOW_type_in_definitionStream116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IP_in_definitionStream126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputStream_in_query149 = new BitSet(new long[]{0x0000140201000000L});
    public static final BitSet FOLLOW_inputStream_in_query151 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_outputProjection_in_query153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inputStream_in_query165 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_outputProjection_in_query167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_STREAM_in_outputStream188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_outputStream190 = new BitSet(new long[]{0x0000000000800008L,0x0000000000410200L});
    public static final BitSet FOLLOW_outputType_in_outputStream195 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_IP_in_outputStream202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_86_in_outputType222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_outputType229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_outputType236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_FULL_in_inputStream258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequenceFullStream_in_inputStream260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_FULL_in_inputStream269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternFullStream_in_inputStream272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_inputStream282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_joinStream_in_inputStream284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_windowStream_in_inputStream293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_inputStream309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_basicStream340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rawStream_in_basicStream342 = new BitSet(new long[]{0x0000800000300008L});
    public static final BitSet FOLLOW_transformHandler_in_basicStream347 = new BitSet(new long[]{0x0000000000300008L});
    public static final BitSet FOLLOW_id_in_basicStream354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_in_windowStream383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANONYMOUS_in_windowStream387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnQuery_in_windowStream389 = new BitSet(new long[]{0x0001800000010000L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream394 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream401 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_windowStream415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_in_windowStream426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_windowStream430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream435 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream442 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_windowStream456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANONYMOUS_in_rawStream478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnQuery_in_rawStream480 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamId_in_rawStream498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_leftStream_in_joinStream529 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_join_in_joinStream532 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream534 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream536 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_condition_in_joinStream539 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_time_in_joinStream546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream557 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_join_in_joinStream559 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream561 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_condition_in_joinStream564 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_time_in_joinStream571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream588 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_joinStream590 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_join_in_joinStream593 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream595 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_condition_in_joinStream598 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_time_in_joinStream605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_leftStream630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_leftStream641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_rightStream666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_rightStream677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_QUERY_in_returnQuery705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inputStream_in_returnQuery708 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_outputProjection_in_returnQuery710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_in_patternFullStream729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream732 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_time_in_patternFullStream737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_85_in_patternStream760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternItem_in_patternStream763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_patternStream771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_patternStream781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_patternStream783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_patternStream794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_patternStream803 = new BitSet(new long[]{0x0000100000000102L,0x0000800000200400L});
    public static final BitSet FOLLOW_patternStream_in_patternStream810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_nonEveryPatternStream833 = new BitSet(new long[]{0x0000100000000102L,0x0000800000000400L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequenceFullStream860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequenceStream_in_sequenceFullStream863 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_time_in_sequenceFullStream868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream902 = new BitSet(new long[]{0x0000108000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_74_in_patternItem924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem928 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem932 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_111_in_patternItem942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem947 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLLECT_in_patternItem960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem962 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_collect_in_patternItem964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_itemStream_in_patternItem973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_sequenceItem996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1000 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEX_in_sequenceItem1018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1020 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_regex_in_sequenceItem1022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_itemStream1064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rawStream_in_itemStream1066 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_attributeName_in_itemStream1070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_regex1096 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_56_in_regex1101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_regex1105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_regex1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_externalCall_in_outputProjection1135 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_OUT_ATTRIBUTES_in_outputProjection1142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputAttributeList_in_outputProjection1144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupBy_in_outputProjection1154 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_having_in_outputProjection1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_outputAttributeList1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_ATTRIBUTE_in_outputAttributeList1198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_outputItem1221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_extensionOutFunction_in_outputItem1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_outputItem1234 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_outputItem1247 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_outputItem1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_outputItem1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_FUNCTION_in_extensionOutFunction1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_extensionOutFunction1287 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensionOutFunction1289 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_extensionOutFunction1322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_outFunction1351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_outFunction1353 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_outFunction1358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_90_in_groupBy1386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1389 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_91_in_having1410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_having1412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_78_in_externalCall1428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_externalCall1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameters_in_externalCall1433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FILTER_in_filterHandler1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_filterHandler1455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRANSFORM_in_transformHandler1476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensibleId_in_transformHandler1478 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_transformHandler1484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_in_windowHandler1506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensibleId_in_windowHandler1508 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_windowHandler1514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_extensibleId1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_in_extensibleId1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_extensibleId1555 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_extensibleId1557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_parameters1595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameters1598 = new BitSet(new long[]{0x1590000000009048L,0x0080002200901000L});
    public static final BitSet FOLLOW_constant_in_time1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1660 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1662 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1672 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_collect1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_collect1683 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStartAndEnd_in_collect1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStart1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countEnd1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition1779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_condition1781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_111_in_conditionExpression1803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1807 = new BitSet(new long[]{0x8004000000000880L,0x0000A0010000841DL});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_74_in_conditionExpression1824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1828 = new BitSet(new long[]{0x8004000000000880L,0x0000A0010000841DL});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_compareOperation_in_conditionExpression1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionExpression1850 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_conditionExpression1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_109_in_conditionExpression1874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_FUNCTION_in_conditionExpression1897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_conditionExpression1899 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_conditionExpression1901 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_conditionExpression1906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_boolVal_in_conditionExpression1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_expression1952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1956 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression1960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_expression1972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1976 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression1980 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression1992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1996 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression2000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expression2012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2016 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression2020 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression2032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2036 = new BitSet(new long[]{0x1590000000009040L,0x0080002200901000L});
    public static final BitSet FOLLOW_expression_in_expression2040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpression_in_expression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpression2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_valueExpression2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_valueExpression2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_FUNCTION_in_valueExpression2118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_valueExpression2120 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_functionId_in_valueExpression2122 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_parameters_in_valueExpression2127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_intVal_in_constant2157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_longVal_in_constant2171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_floatVal_in_constant2184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_doubleVal_in_constant2197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolVal_in_constant2209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stringVal_in_constant2222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timeExpr_in_constant2234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_EXP_in_timeExpr2258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_yearValue_in_timeExpr2261 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_monthValue_in_timeExpr2270 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_weekValue_in_timeExpr2279 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_dayValue_in_timeExpr2288 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_hourValue_in_timeExpr2298 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_minuteValue_in_timeExpr2307 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_secondValue_in_timeExpr2318 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_milliSecondValue_in_timeExpr2327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_yearValue2353 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_yearValue2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_monthValue2384 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_monthValue2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_weekValue2414 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_set_in_weekValue2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_dayValue2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_dayValue2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_hourValue2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_set_in_hourValue2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_minuteValue2507 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_set_in_minuteValue2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_secondValue2539 = new BitSet(new long[]{0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_set_in_secondValue2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2573 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_milliSecondValue2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_streamId2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamPositionAttributeName_in_attributeVariable2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamAttributeName_in_attributeVariable2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeVariable2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_streamPositionAttributeName2661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_streamPositionAttributeName2664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_streamPositionAttributeName2673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_streamAttributeName2694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_streamAttributeName2697 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_id_in_streamAttributeName2702 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeName2722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_attributeName2724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_join2746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_112_in_join2749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_100_in_join2751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_join2765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_112_in_join2768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_114_in_join2770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_join2784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_112_in_join2787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_89_in_join2789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_join2801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_94_in_join2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_compareOperation2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_compareOperation2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_compareOperation2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_compareOperation2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_compareOperation2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_compareOperation2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_compareOperation2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_compareOperation2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_QUOTES_in_id2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_intVal2933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_intVal2936 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_58_in_intVal2941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_longVal2968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_LONG_VAL_in_longVal2971 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_58_in_longVal2976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_floatVal3003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3006 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_58_in_floatVal3011 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_doubleVal3038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3041 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_58_in_doubleVal3046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_VAL_in_boolVal3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensionId3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_functionId3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_VAL_in_stringVal3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_type3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_type3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_type3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_type3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_type3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_type3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred13_SiddhiQLGrammarWalker293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred28_SiddhiQLGrammarWalker529 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_join_in_synpred28_SiddhiQLGrammarWalker532 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rightStream_in_synpred28_SiddhiQLGrammarWalker534 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_synpred28_SiddhiQLGrammarWalker536 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_condition_in_synpred28_SiddhiQLGrammarWalker539 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_time_in_synpred28_SiddhiQLGrammarWalker546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred31_SiddhiQLGrammarWalker557 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_join_in_synpred31_SiddhiQLGrammarWalker559 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rightStream_in_synpred31_SiddhiQLGrammarWalker561 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_condition_in_synpred31_SiddhiQLGrammarWalker564 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_time_in_synpred31_SiddhiQLGrammarWalker571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred34_SiddhiQLGrammarWalker630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred35_SiddhiQLGrammarWalker666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred38_SiddhiQLGrammarWalker760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternItem_in_synpred38_SiddhiQLGrammarWalker763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_synpred38_SiddhiQLGrammarWalker771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred40_SiddhiQLGrammarWalker781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_synpred40_SiddhiQLGrammarWalker783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_synpred40_SiddhiQLGrammarWalker794 = new BitSet(new long[]{0x0000000000000002L});

}