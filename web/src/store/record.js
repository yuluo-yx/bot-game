export default {
    state: {
        is_Record: false,
        a_step: "",
        b_step: "",
        record_loser: ""
    },
    getters: {
    },
    mutations: {
        updateIsRecord(state, isRecord) {
            state.is_Record = isRecord;
        },
        updateSteps(state, data) {
            state.a_steps = data.a_steps;
            state.b_steps = data.b_steps;
        },
        updateRecordLoser(state, loser) {
            state.record_loser = loser;
        }
    },
    actions: {


    },
    modules: {
    }
}