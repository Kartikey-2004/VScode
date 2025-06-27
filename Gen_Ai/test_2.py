import os
import warnings
from langchain_google_genai import ChatGoogleGenerativeAI
from langchain_core.prompts import ChatPromptTemplate
from langchain_core.runnables.history import RunnableWithMessageHistory
from langchain_community.chat_message_histories import FileChatMessageHistory
from dotenv import load_dotenv, find_dotenv

_ = load_dotenv(find_dotenv())
warnings.filterwarnings("ignore")
os.makedirs(".chat_history", exist_ok=True)
google_api_key = os.getenv("GEMINI_API_KEY")

llm = ChatGoogleGenerativeAI(
    model="gemini-1.5-flash", temperature=0.0, google_api_key=google_api_key
)
prompt = ChatPromptTemplate.from_messages(
    [("system", "You are a helpful AI assistant."), ("human", "{input}")]
)
chain = prompt | llm
message_history_chain = RunnableWithMessageHistory(
    chain,
    lambda session_id: FileChatMessageHistory(f".chat_history/{session_id}.json"),
    input_messages_key="input",
    history_messages_key="messages",
)

message_history_chain.invoke(
    {"input": "my name is Kartikey"},
    config={"configurable": {"session_id": "user-session-001"}},
)
response = message_history_chain.invoke(
    {
        "input": "Hi! My name is Kartikey. What is the capital of India? What is my name?"
    },
    config={"configurable": {"session_id": "user-session-001"}},
)

print(response.content)