# BlockMarkets API Java SDK
This repository contains the released Java client SDK for the BlockMarkets API.

The BlockMarkets API provides real-time and historical cryptocurrency market data from the world's top crypto exchanges. Sign up for a free API key at [BlockMarkets Cryptocurrency API](https://www.blockmarkets.io/cryptocurrency-api).

Check out our [API Documentation](https://docs.blockmarkets.io) for more information.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.blockmarkets</groupId>
  <artifactId>rest</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.blockmarkets:rest:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/rest-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.blockmarkets.rest.*;
import com.blockmarkets.rest.auth.*;
import com.blockmarkets.rest.models.*;
import com.blockmarkets.rest.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String symbol = "symbol_example"; // String | The asset symbol (see /assets)
        try {
            Empty result = apiInstance.benchmarkRate(symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#benchmarkRate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.blockmarkets.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**benchmarkRate**](docs/DefaultApi.md#benchmarkRate) | **GET** /v1/rates/benchmark/{symbol} | Returns the latest available benchmark rates for a specific asset.
*DefaultApi* | [**benchmarkRateHistory**](docs/DefaultApi.md#benchmarkRateHistory) | **GET** /v1/rates/benchmark/{symbol}/history | Returns historical benchmark rates for an asset. Requires premium subscription.
*DefaultApi* | [**listAssetMarkets**](docs/DefaultApi.md#listAssetMarkets) | **GET** /v1/assets/{symbol} | Returns a list of all markets (base and quote) for a specific asset.
*DefaultApi* | [**listAssets**](docs/DefaultApi.md#listAssets) | **GET** /v1/assets | Returns a list of supported assets.
*DefaultApi* | [**listBenchmarkRates**](docs/DefaultApi.md#listBenchmarkRates) | **GET** /v1/rates/benchmark | Returns a list of supported USD benchmark rates.
*DefaultApi* | [**listExchangeMarkets**](docs/DefaultApi.md#listExchangeMarkets) | **GET** /v1/exchanges/{exchange} | Returns a list of markets for a specific exchange.
*DefaultApi* | [**listExchanges**](docs/DefaultApi.md#listExchanges) | **GET** /v1/exchanges | Returns a list of supported exchanges.
*DefaultApi* | [**listMarkets**](docs/DefaultApi.md#listMarkets) | **GET** /v1/markets | Returns a list of supported markets.
*DefaultApi* | [**listPairMarkets**](docs/DefaultApi.md#listPairMarkets) | **GET** /v1/pairs/{pair} | Returns a list of markets for a specific asset pair.
*DefaultApi* | [**listPairs**](docs/DefaultApi.md#listPairs) | **GET** /v1/pairs | Returns a list of supported asset pairs.
*DefaultApi* | [**listSpotRates**](docs/DefaultApi.md#listSpotRates) | **GET** /v1/rates/spot | Returns a list of supported USD spot rates.
*DefaultApi* | [**marketBook**](docs/DefaultApi.md#marketBook) | **GET** /v1/markets/{exchange}/{pair}/book | Returns the top 50 bids and asks from the current order book for a market pair. Requires premium subscription.
*DefaultApi* | [**marketOHLCV**](docs/DefaultApi.md#marketOHLCV) | **GET** /v1/markets/{exchange}/{pair}/ohlcv | Returns OHLCV history for a market pair.
*DefaultApi* | [**marketTicker**](docs/DefaultApi.md#marketTicker) | **GET** /v1/markets/{exchange}/{pair} | Returns the latest ticker for a market pair.
*DefaultApi* | [**marketTrades**](docs/DefaultApi.md#marketTrades) | **GET** /v1/markets/{exchange}/{pair}/trades | Returns trades for a market pair. Requires premium subscription.
*DefaultApi* | [**spotRate**](docs/DefaultApi.md#spotRate) | **GET** /v1/rates/spot/{symbol} | Returns the last USD spot rate for an asset.
*DefaultApi* | [**spotRateHistory**](docs/DefaultApi.md#spotRateHistory) | **GET** /v1/rates/spot/{symbol}/history | Returns historical spot rates for an asset. Requires premium subscription.
*DefaultApi* | [**spotRateOHLCV**](docs/DefaultApi.md#spotRateOHLCV) | **GET** /v1/rates/spot/{symbol}/ohlcv | Returns the OHLCV history for a spot rate.


## License

```
Copyright 2019 BlockMarkets, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
