import os

from dotenv import load_dotenv, find_dotenv

_ = load_dotenv(find_dotenv())  # read local .env file

import warnings

warnings.filterwarnings("ignore")

from langchain_google_genai import ChatGoogleGenerativeAI
from langchain.chains import ConversationChain
from langchain.memory import ConversationBufferMemory

google_api_key = os.getenv("GEMINI_API_KEY")
llm_model = "gemini-1.5-flash"

llm = ChatGoogleGenerativeAI(
    temperature=0.0,
    model=llm_model,
    google_api_key=google_api_key,
)
memory = ConversationBufferMemory()
conversation = ConversationChain(llm=llm, memory=memory, verbose=True)

memory.clear()
conversation.predict(input="Hi, my name is Kartik")
conversation.predict(input="Your name is Andrew?")
conversation.predict(input="What is my name and your name?")
# print(response)
print(memory.buffer)
memory.load_memory_variables({})
