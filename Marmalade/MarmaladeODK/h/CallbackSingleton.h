#ifndef __CALLBACK_SINGLETON_H__
#define __CALLBACK_SINGLETON_H__

class CallbacksFetchGamerUUID;
class CallbacksRequestProducts;
class CallbacksRequestPurchase;
class CallbacksRequestReceipts;

namespace OuyaSDK
{
	class CallbackSingleton
	{
	private:
		static CallbackSingleton* m_instance;

		CallbackSingleton();

	public:

		static CallbackSingleton* GetInstance();

		CallbacksFetchGamerUUID* m_callbacksFetchGamerUUID;
		CallbacksRequestProducts* m_callbacksRequestProducts;
		CallbacksRequestPurchase* m_callbacksRequestPurchase;
		CallbacksRequestReceipts* m_callbacksRequestReceipts;
	};
};

#endif