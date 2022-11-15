package rickandmortyapp.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;
import rickandmortyapp.model.RMCharacterPOJO;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIRickMorty {

    @RequestLine("GET /characters.json")
    List<RMCharacterPOJO> CharacterList(@QueryMap Map<String, Object> queryMap);
}
