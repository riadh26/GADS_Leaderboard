package com.example.gadsleaderboard.Api;


import com.example.gadsleaderboard.Models.LearningLeader;
import com.example.gadsleaderboard.Models.SkillIqLeader;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Riadh Laabidi on 30-Aug-20.
 */
public interface ApiClient {

    @GET("/api/hours")
    Call<List<LearningLeader>> getLearningLeaders();

    @GET("/api/skilliq")
    Call<List<SkillIqLeader>> getSkillIqLeaders();

    @POST("1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")
    @FormUrlEncoded
    Call<Void> submitProject(
            @Field("entry.1877115667") String firstName,
            @Field("entry.2006916086") String lastName,
            @Field("entry.1824927963") String email,
            @Field("entry.642603327") String track,
            @Field("entry.284483984") String githubLink
    );

}
